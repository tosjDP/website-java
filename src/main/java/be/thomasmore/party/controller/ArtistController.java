package be.thomasmore.party.controller;

import be.thomasmore.party.model.Artist;
import be.thomasmore.party.model.Venue;
import be.thomasmore.party.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ArtistController {
    @Autowired
    private ArtistRepository artistRepository;


    @GetMapping({"/artistdetails", "/artistdetails/", "/artistdetails/{id}"})
    public String artistDetails(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) return "artistdetails";

        Optional<Artist> optionalartist = artistRepository.findById(id);
        if (optionalartist.isPresent()) {
            model.addAttribute("artist", optionalartist.get());
        }
        return "artistdetails";
    }
    @GetMapping("/artistlist")
    public String artistList(Model model) {
        Iterable<Artist> allArtist = artistRepository.findAll();
        model.addAttribute("artists", allArtist);
        return "artistlist";
    }
}
