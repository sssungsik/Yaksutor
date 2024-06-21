package team01.yaksutor.member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping("pharm/pharmMain")
    public String memberMain(Model model) {

        return "pharm/pharmMain";
    }

}
