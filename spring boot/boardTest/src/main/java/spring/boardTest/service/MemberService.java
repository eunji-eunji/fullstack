package spring.boardTest.service;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import spring.boardTest.domain.Member;
import spring.boardTest.domain.MemberDto;
import spring.boardTest.repository.MemberRepository;

public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveMember(Member member) {
        validationDuplicateMember(member);  // 중복 확인
        memberRepository.save(member);
    }

    // 중복 확인
    private void validationDuplicateMember(Member member) {
        Member findMember=memberRepository.findByMemberId(member.getMemberId());
        if(findMember!=null)    // db에 있으면
            throw new IllegalArgumentException("이미 가입된 회원입니다.");
    }

    public Member getMemberById(String memberId) {
        return memberRepository.findByMemberId(memberId);
    }

    public void updateMember(@Valid MemberDto memberDto) {
        Member member=memberRepository.findByMemberId(memberDto.getMemberId());
        if(member==null)
            throw new IllegalArgumentException("존재하지 않는 회원입니다.");
        member.updateFromDto(memberDto, passwordEncoder);
    }

    public void deleteMember(String memberId) {
        Member member=memberRepository.findByMemberId(memberId);
        memberRepository.deleteById(member.getId());
    }
}
