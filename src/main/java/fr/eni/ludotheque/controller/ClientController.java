package fr.eni.ludotheque.controller;

import fr.eni.ludotheque.bll.ClientServiceImpl;
import fr.eni.ludotheque.bo.ClientBo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientServiceImpl clientService;

    public ClientController(ClientServiceImpl clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientBo> getAllClients() {
        List client = clientService.getAllClients();
        return client;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientBo> getClientById(@PathVariable Integer id) {
        Optional<ClientBo> clientOpt = clientService.getClientById(id);
        if (clientOpt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.ok(clientOpt.get());

    }
}

