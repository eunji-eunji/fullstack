package spring.boardTest.controller;

import jakarta.validation.Valid;
import org.aspectj.lang.reflect.MemberSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.boardTest.domain.Member;
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
    public String requestAddMember(Model model){
        model.addAttribute("memberDto", new MemberDto());
        return "member/addMember";
    }
    @PostMapping("/add")
    public String submitAddMember(@Valid MemberDto memberDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors())
            return "member/addMember";
        try{
            Member member = Member.createMember(memberDto, passwordEncoder);
            memberService.saveMember(member);
        }catch(IllegalStateException e){
            model.addAttribute("errorMessage", e.getMessage());
            return "member/addMember";
        }
        return "redirect:/members";
    }
}
