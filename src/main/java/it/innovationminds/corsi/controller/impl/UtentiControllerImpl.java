package it.innovationminds.corsi.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import it.innovationminds.utenti.UtentiController;

@RestController
public class UtentiControllerImpl implements UtentiController {


    // Not used
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping()
    public ResponseEntity<?> getUtente(){
        return null;
    };




    /*
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/macchina")
    public ResponseEntity<?> addMacchina(@RequestBody AddMacchinaDto macchina) throws Exception;
    */

}
