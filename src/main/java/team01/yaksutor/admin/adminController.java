package team01.yaksutor.admin;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
@Slf4j
public class adminController {

    @GetMapping("/adminMain")
    public String adminMain(Model model) {

        model.addAttribute("title", "관리자 메인 페이지");
        model.addAttribute("content", "메인화면");
        return "admin/adminMain";
    }

}
