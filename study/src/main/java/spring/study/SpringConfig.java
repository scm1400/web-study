package spring.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.study.repository.MemberRepository;
import spring.study.repository.MemoryMemberRepository;
import spring.study.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
