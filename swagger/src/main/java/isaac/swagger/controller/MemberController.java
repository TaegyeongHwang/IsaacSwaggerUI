package isaac.swagger.controller;

import isaac.swagger.domain.Member;
import isaac.swagger.dto.MemberDto;
import isaac.swagger.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join")
    public Member joinMember(MemberDto memberDTO) {
        log.info("joinMember()");

        return memberService.saveMember(memberDTO);
    }

    @GetMapping("/find/{memberId}")
    public Member findMember(@PathVariable String memberId) {
        log.info("findMember()");

        return memberService.findMember(memberId);
    }

}
