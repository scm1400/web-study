package spring.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import spring.study.domain.Member;
import spring.study.service.MemberService;

//⭐스프링 빈(Bean)을 등록하는 2가지 방법
//⭐ 1. 컴포넌트스캔 : @Controller, @Service, @Repository annotation들을 객체를 생성해서 스프링 컨테이너에 등록함. 
//                     @Autowired가 컴포넌트들을 연결해줌
//⭐ 2. 자바 코드로 직접 스프링 빈(Bean) 등록 : 상황에따라 구현 클래스를 변경해야하는 경우 좋음(구현체변경 등) 
//      -> SpringConfig << 이동해보기(Ctrl 클릭)

@Controller
public class MemberController {
    private final MemberService memberService;
    // DI 방식 3가지 (아래)
    // 💥 Setter Injection 방식 - 누군가 member컨트롤을 호출했을 때 이녀석이 public으로
    // 열려있어야한다.(public으로 노출)
    // 아무개발자나 호출이 가능한상태가됨.
    // @Autowired
    // public void setMemberService(Object memberService) {
    // this.memberService = memberService;
    // };

    // 🔴 필드주입방식 권장하지않음 - 중간에 바꿀 수 있는방법이 없기때문
    // @Autowired private final MemberService memberService;

    // 🟢 생성자를 통한 주입방식 - 권장
    @Autowired // membercontroller가 생성이 될 때 SpringBean에 등록되어있는 Service객체를 연결해줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }
}
