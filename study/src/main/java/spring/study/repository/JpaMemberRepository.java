package spring.study.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import spring.study.domain.Member;

public class JpaMemberRepository implements MemberRepository {

    // ⭐ EntityManger가 내부적으로 datasource를 들고있으면서 DB와 통신한다.
    private final EntityManager em;

    // EntityManager em을 DI방식으로 주입
    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {

        List<Member> result = em.createQuery("select m from Member m where m.name= :name", Member.class)
                .setParameter("name", name).getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }

}
