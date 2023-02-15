package be.thomasmore.party.controller;

import be.thomasmore.party.model.Venue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Veneucontroller {
    @GetMapping({ "/Venue"})
    public String Venue(Model model){
        Venue venue = new Venue("de roma","https://denaalmoezenier.weebly.com");
        model.addAttribute("venue",venue);
        venue.setCapacity(2000);
        venue.setCity("antwerpen");
        venue.setIndoor(true);
        venue.setOutdoor(false);
        venue.setFoodProvided(true);
        venue.setDistanceFromPublicTransportInKm(1);
        venue.setVenueName("Den Aalmoezenier");
        venue.setLinkMoreInfo("https://denaalmoezenier.weebly.com");
        return "venuedetails";
    }
}
