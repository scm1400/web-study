package spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello"; // hello.html을 찾아가라
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // @RespnseBody를 사용하면 ViewResolver를 사용하지 않음, 대신에 HTTP의 BODY에 문자 내용을 직접 반환
                  // (HTML BODY TAG를 말하는 것이 아님) HTML 파일을 작성하지 않아도 됨.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api") // JSON 방식구현, 요즘에는 XML보다 JSON 반환이 거의 기본
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // 객체를 리턴하면 HttpMessageConverter -> JsonConverter 동작함
                      // 스프링에서는 Jackson2 라이브러리 사용
    }

    static class Hello {
        private String name;

        // getter & setter : Property 방식이라고 부름
        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}