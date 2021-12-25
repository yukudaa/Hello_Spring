package hello.hello.spring.controller;

import hello.hello.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired      //controller에 service를 의존해줌(뭔가 넣어준 느낌)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
