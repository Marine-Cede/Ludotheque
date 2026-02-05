package fr.eni.ludotheque.controller;

import fr.eni.ludotheque.bll.ClientServiceImpl;
import fr.eni.ludotheque.bo.ClientBo;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ClientController {
    private final ClientServiceImpl clientService;

    public ClientController(ClientServiceImpl clientService) {
        this.clientService = clientService;
    }
}
