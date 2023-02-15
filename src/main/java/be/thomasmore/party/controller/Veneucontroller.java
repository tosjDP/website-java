package be.thomasmore.party.controller;

import be.thomasmore.party.model.Venue;
import be.thomasmore.party.repositories.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class Veneucontroller {

    @Autowired
    private VenueRepository venueRepository;

    @GetMapping({ "/Venue"})
    public String Venue(Model model){
        Optional<Venue> optionalVenue = venueRepository.findById(1);
        if (optionalVenue.isPresent()){
            model.addAttribute("venue",optionalVenue.get());
        }

        return "venuedetails";
    }
}
