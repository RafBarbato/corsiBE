package it.innovationminds.utenti;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/utenti")
public interface UtentiController {

    // Not used
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping()
    public ResponseEntity<?> getUtente();

    /*
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/macchina")
    public ResponseEntity<?> addMacchina(@RequestBody Sti) throws Exception;*/


}
