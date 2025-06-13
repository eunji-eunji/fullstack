package spring.boardTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring.boardTest.repository.MemberRepository;

public class MemberService {
    @Autowired
    private MemberRepository memberRepository;
}
