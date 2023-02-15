package be.thomasmore.party.controller;

import be.thomasmore.party.model.Venue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Veneucontroller {
    @GetMapping({ "/Venue"})
    public String Venue(Model model){
        Venue venue = new Venue("de roma","https://www.google.be");
        model.addAttribute("venue",venue);
        return "venuedetails";
    }
}
