package mokjang.indonesia_mokjang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class home {

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/role")
    public String role(Model model) {
        return "role";
    }

    @GetMapping("/column")
    public String column(Model model) {
        return "column";
    }

    @GetMapping("/advertisement")
    public String advertisement(Model model) {
        return "advertisement";
    }

    @GetMapping("/prayer")
    public String prayer(Model model) {
        return "prayer";
    }
}
