package team01.yaksutor.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("title", "메인화면");
        model.addAttribute("content", "Spring boot Mybatis");

        return "index";
    }
}
