package be.thomasmore.party.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        final int calculatedValue = 45 * 34;
        model.addAttribute("calculatedValue", calculatedValue);
        return "home";
    }


    @GetMapping("/about")
    public String about(Model model) {
        String myName = "tosj de potter";
        String myStreet = "regenbooglei";
        String myCity = "antwerpen";
        model.addAttribute("name", myName);
        model.addAttribute("street", myStreet);
        model.addAttribute("city", myCity);
        return "about";
    }

    @GetMapping("/pay")
    public String pay(Model model){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDateTime = now.format(format);
        LocalDateTime after =now.plusDays(30);
        String formatDateTimeAfter = after.format(format);
        model.addAttribute("formatDateTime",formatDateTime);
        model.addAttribute("formatDateTimeAfter",formatDateTimeAfter);
    return "pay";
    }
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    @RequestMapping("/Venue")
    public String Venuedetails() {
        return "Venuedetails";
    }
    @RequestMapping("/about")
    public String aboutme() {
        return "about me";
    }
}
