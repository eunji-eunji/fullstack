package spring.boardTest.controller;

import org.aspectj.lang.reflect.MemberSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.boardTest.domain.MemberDto;
import spring.boardTest.service.MemberService;

@Controller
@RequestMapping(value = "/board")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/add")
    public String addMember(Model model){
        model.addAttribute("memberDto", new MemberDto());
        return "member/addMember";
    }
}
