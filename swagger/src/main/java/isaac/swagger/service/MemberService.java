package isaac.swagger.service;

import isaac.swagger.domain.Member;
import isaac.swagger.dto.MemberDto;
import isaac.swagger.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member saveMember(MemberDto memberDTO) {

        Member member = new Member();
        member.setId(memberDTO.getId());
        member.setPassword(memberDTO.getPassword());

        return memberRepository.save(member);
    }

    public Member findMember(String memberId) {

        return memberRepository.findById(memberId);
    }

}
