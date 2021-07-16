package spring.study;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.study.repository.JdbcMemberRepository;
import spring.study.repository.JdbcTemplateMemberRepository;
import spring.study.repository.JpaMemberRepository;
import spring.study.repository.MemberRepository;
import spring.study.repository.MemoryMemberRepository;
import spring.study.service.MemberService;

@Configuration
public class SpringConfig {

    // @Autowired DataSource dataSource;

    private DataSource dataSource;

    private EntityManager em;

    private final MemberRepository memberRepository;

    // ⚡ 스프링 데이터 JPA
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // ⚡ JPA를 사용하는 경우 주석해제
    // @Autowired
    // public SpringConfig(EntityManager em) {
    // this.em = em;
    // }

    // ⚡ Jdbc 사용하는 경우 주석해제
    // dataSource를 DI 해줌
    // @Autowired
    // public SpringConfig(DataSource dataSource) {
    // this.dataSource = dataSource;
    // }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    // @Bean
    // public MemberRepository memberRepository() {
    // // Memory Repository 사용
    // // return new MemoryMemberRepository();

    // // 순수 JDBC 사용
    // // return new JdbcMemberRepository(dataSource);

    // // 스프링 JDBC 사용
    // // return new JdbcTemplateMemberRepository(dataSource);

    // // JPA 사용
    // // return new JpaMemberRepository(em);

    // }
}
