package spring.study.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import spring.study.domain.Member;
import spring.study.repository.MemberRepository;
import spring.study.repository.MemoryMemberRepository;

class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository;

    // ⭐ 같은메모리 MemoryMemberRepository를 사용. MemberService 를 ctrl 클릭해서 이동해볼것.
    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }

    // ⭐ 권장하지 않음.. static이라 지금은 괜찮지만,.혹시라도 새로운 repository를 생성해서 다른 DB를 만들 수 있음.
    // ⭐ 따라서 MemberService.java의 MemberRepository를 외부에서 넣어주도록 바꿔준다.
    // ⭐ MemoryMemberRepository memberRepository = new MemoryMemberRepository();
    // MemberService.java 파일의 memberRepository를 아래와 같이 수정한다.
    // ⭐public MemberService(MemberRepository memberRepository) {
    // ⭐ this.memberRepository = memberRepository;
    // ⭐}

    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void 회원가입() {
        // given
        Member member = new Member();
        member.setName("spring");
        // when
        Long saveId = memberService.join(member);
        // then
        Member findMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외() {
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");
        // when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
        // memberService.join(member2);

        /*
         * 💥 Try_Catch로 예외처리 try { memberService.join(member2); fail("예외가 발생해야 합니다.");
         * } catch (IllegalStateException e) {
         * Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.123"); }
         */
        // then
    }

    @Test
    void findMembers() {

    }

    @Test
    void findOne() {

    }
}
