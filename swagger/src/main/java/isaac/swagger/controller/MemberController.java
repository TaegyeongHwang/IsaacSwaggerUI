package isaac.swagger.controller;

import io.swagger.annotations.ApiOperation;
import isaac.swagger.domain.Member;
import isaac.swagger.dto.MemberDto;
import isaac.swagger.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    @ApiOperation(value = "회원가입", notes = "회원가입 notes")
    @PostMapping("/join")
    public Member joinMember(@RequestBody MemberDto memberDto) {
        log.info("joinMember()");

        return memberService.joinMember(memberDto);
    }

    @GetMapping("/find/{memberNo}")
    public Member findMember(@PathVariable Long memberNo) {
        log.info("findMember()");

        return memberService.findMember(memberNo);
    }

    @GetMapping("/findList")
    public List<Member> findListMember() {
        log.info("findListMember()");

        return memberService.findListMember();
    }

}
