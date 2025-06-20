package spring.boardTest.controller;

import jakarta.validation.Valid;
import org.aspectj.lang.reflect.MemberSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.boardTest.domain.Member;
import spring.boardTest.domain.MemberDto;
import spring.boardTest.service.MemberService;


@Controller
@RequestMapping(value = "/members")
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

    @GetMapping("/update/{memberId}")
    public String requestUpdateMember(@PathVariable(name = "memberId") String memberId, Model model){
        Member member=memberService.getMemberById(memberId);
        model.addAttribute("member",member);
        return "member/updateMember";
    }

    @PostMapping("/update")
    public String submitUpdateMember(@Valid MemberDto memberDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors())
            return "member/updateMember";
        try{
            memberService.updateMember(memberDto);
        }catch(IllegalStateException e){
            model.addAttribute("errorMessage", e.getMessage());
            return "member/updateMember";
        }
        return "redirect:/members";
    }

    @GetMapping("/delete/{memberId}")
    public String deleteMember(@PathVariable(name = "memberId") String memberId){
        memberService.deleteMember(memberId);
        return "redirect:/logout";
    }

    @GetMapping
    public String requestMain(){
        return "redirect:/";
    }
}
