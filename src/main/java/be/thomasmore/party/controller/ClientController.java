package be.thomasmore.party.controller;

import be.thomasmore.party.repositories.Clientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClientController {
    @Autowired
    private Clientrepository clientrepository;
}
