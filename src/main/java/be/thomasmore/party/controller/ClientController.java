package be.thomasmore.party.controller;

import be.thomasmore.party.model.Client;
import be.thomasmore.party.repositories.Clientrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private ClientController clientController;

    @GetMapping({ "/greeting"})
    public String Client(Model model) {
        Optional<Client> optionalClient = Clientrepository.findById(1);
        if (optionalClient.isPresent()) {
            Client client = optionalClient.get();
            model.addAttribute("client", client);

            String groet = "goedemorgen";
            model.addAttribute("code", generateClientcode(client));
            model.addAttribute("groet", groet);
            if (client.getGender().equals("m")) {
                groet += "meneer";
            } else if (client.getGender().equals("f")) {
                groet += "mevrouw";

            } else {
                groet += "beste";
            }
        }

        return "newclient";
    }


        private String generateClientcode (Client client){
            String code = "";
            code = client.getName().substring(0,2)+client.getName().charAt(client.getName().length() - 1);
        }
    }