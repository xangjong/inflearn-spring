//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;

    public MemberServiceTest() {
    }

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        this.memberService = appConfig.memberService();
    }

    @Test
    void join() {
        Member member = new Member(1L, "memberA", Grade.VIP);
        this.memberService.join(member);
        Member findMember = this.memberService.findMember(1L);
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
