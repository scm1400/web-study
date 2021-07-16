package spring.study.repository;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import spring.study.domain.Member;

public class JdbcTemplateMemberRepository implements MemberRepository {

    // 스프링 Jdbc
    private final JdbcTemplate jdbcTemplate;

    // ⭐ 생성자가 하나이면 @Autowirde 생략 가능
    public JdbcTemplateMemberRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Member save(Member member) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", member.getName());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
        member.setId(key.longValue());
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {

        List<Member> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(), id);
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        return jdbcTemplate.query("select * from member", memberRowMapper());
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = jdbcTemplate.query("select * from member where name = ?", memberRowMapper(), name);
        return result.stream().findAny();
    }

    /*
     * `RowMapper`를 사용하면, 원하는 형태의 결과값을 반환할 수 있다. SELECT로 나온 여러개의 값을 반환할 수 있을 뿐만 아니라,
     * 사용자가 원하는 형태로도 얼마든지 받을 수 있다.
     * 
     */

    // `RowMapper의 `mapRow(ResultSet rs, int count)` 메소드
    /*
     * ResultSet에 값을 담아와서 User 객체에 저장한다. 그리고 그것을 count만큼 반복한다는 뜻이다.
     */

    private RowMapper<Member> memberRowMapper() {

        // return new RowMapper<Member>() {
        // @Override
        // public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
        // Member member = new Member();
        // member.setId(rs.getLong("id"));
        // member.setName(rs.getString("name"));
        // return member;
        // }
        // };

        // 위의 코드를 람다로 변경 ( ⚡ VSC 단축키 `ctrl` + `.`)
        return (rs, rowNum) -> {
            Member member = new Member();
            member.setId(rs.getLong("id"));
            member.setName(rs.getString("name"));
            return member;
        };
    }

}
