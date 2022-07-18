package isaac.swagger.repository;

import isaac.swagger.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberRepository {

    private Map<String, Member> store = new HashMap<>();

    public Member save(Member member) {

        store.put(member.getId(), member);

        return store.get(member.getId());
    }

    public Member findById(String memberId) {

        return store.get(memberId);
    }
}
