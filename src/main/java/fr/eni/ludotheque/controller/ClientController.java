package fr.eni.ludotheque.controller;

import fr.eni.ludotheque.bll.ClientServiceImpl;
import fr.eni.ludotheque.bo.ClientBo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientServiceImpl clientService;

    public ClientController(ClientServiceImpl clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<ClientBo> getAllClients() {
        List client = clientService.getAllClients();
        return client;
    }
}

