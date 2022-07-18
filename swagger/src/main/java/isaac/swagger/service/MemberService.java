package isaac.swagger.service;

import isaac.swagger.domain.Member;
import isaac.swagger.dto.MemberDto;
import isaac.swagger.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Member joinMember(MemberDto memberDto) {

        Member member = new Member();
        member.setId(memberDto.getId());
        member.setPassword(memberDto.getPassword());

        memberRepository.save(member);

        Member saveMember = memberRepository.findById(member.getNo());

        return saveMember;
    }

    public Member findMember(Long memberNo) {

        return memberRepository.findById(memberNo);
    }

    public List<Member> findListMember() {

        List<Member> response = memberRepository.findAll();

        return response;
    }
}
