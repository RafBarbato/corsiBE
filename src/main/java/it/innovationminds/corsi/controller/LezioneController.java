package it.innovationminds.corsi.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/lezione")
public interface LezioneController {

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/lezioni/{idCorso}")
    public ResponseEntity<Page> getLezioniByCorsoIdAndUtentePaginato(@PathVariable("idUtente") String idUtente,
                                                         @RequestParam(defaultValue = "0") int page,
                                                         @RequestParam(defaultValue = "10") int size);




    /*
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/macchina")
    public ResponseEntity<?> addMacchina(@RequestBody Sti) throws Exception;*/


}
