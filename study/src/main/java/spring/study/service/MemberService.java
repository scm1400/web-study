package spring.study.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.study.domain.Member;
import spring.study.repository.MemberRepository;
import spring.study.repository.MemoryMemberRepository;

//@Service // ❔ 스프링이 순수한 JAVA코드를 읽지 않기대문에 annotation을 달아줌?
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    // ⭐ MemberRepository를 외부에서 넣어주도록 바꿔준다.
    // ⭐⭐ Dependency Injection : 의존성 주입, Unit Test를 용이하게해주고 코드의 재활용성을 높여줌
    // @Autowired // MemberRepository(인터페이스)의 구현체인 MemoryMemberRepository와 연결
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
     * 회원가입
     */
    public Long join(Member member) {
        // 같은 이름이 있는 중복 회원 X

        // 🔴 권장하지 않음
        // Optional<Member> result = memberRepository.findByName(member.getName());
        // result.ifPresent(m -> {
        // throw new IllegalStateException("이미 존재하는 회원입니다.");
        // });

        // 🔴 권장하지 않음.. 수동 메소드 호출시간 측정
        long start = System.currentTimeMillis();

        validateDuplicationMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    // 🟢 권장
    private void validateDuplicationMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    /*
     * 전체 회원 조회
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
