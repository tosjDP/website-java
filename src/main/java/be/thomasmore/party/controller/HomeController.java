package be.thomasmore.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/","/home"})
    public String home(Model model) {
        final int calculatedValue = 45 * 34;
        model.addAttribute("calculatedValue",calculatedValue);
        return "home";
    }


    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
