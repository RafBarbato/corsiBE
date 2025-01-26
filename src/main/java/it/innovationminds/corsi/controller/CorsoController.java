package it.innovationminds.corsi.controller;

import it.innovationminds.corsi.model.Corso;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/corso")
public interface CorsoController {

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/corsi/{idUtente}")
    public Page<Corso> getCorsiByUtentePaginati(@PathVariable("idUtente") String idUtente,
                                                @RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "10") int size);


    /*
    * {
        return lessonRepository.findAll(PageRequest.of(page,
    */

    /*
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/macchina")
    public ResponseEntity<?> addMacchina(@RequestBody Sti) throws Exception;*/


}
