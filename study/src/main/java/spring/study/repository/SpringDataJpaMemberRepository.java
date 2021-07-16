package spring.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.study.domain.Member;

import java.util.Optional;

//⭐ JpaRepository 라이브러리가 save,delete,finbyId 등 기본 CRUD 기능을 제공하기 때문에 구현하지 않아도 됨
//인터페이스로  인터페이스를 상속받을 때는 extends 사용
//자동으로 구현체를 만들어 Bean에 자동 등록해줌
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // ⭐ 인터페이스 이름만으로 기능을 구현해서 보여줌.
    // select m from Member m where m.name = ? 방식으로 작동
    @Override
    Optional<Member> findByName(String name);
}
