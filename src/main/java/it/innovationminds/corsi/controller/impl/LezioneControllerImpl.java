package it.innovationminds.corsi.controller.impl;

import it.innovationminds.corsi.controller.LezioneController;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LezioneControllerImpl implements LezioneController {


    @Override
    public ResponseEntity<Page> getLezioniByCorsoIdAndUtentePaginato(String idUtente, int page, int size) {
        return null;
    }
}
