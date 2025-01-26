package it.innovationminds.corsi.controller.impl;

import it.innovationminds.corsi.controller.CorsoController;
import it.innovationminds.corsi.model.Corso;
import it.innovationminds.corsi.service.CorsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsoControllerImpl implements CorsoController {

    @Autowired
    CorsiService corsiService;

    @Override
    public Page<Corso> getCorsiByUtentePaginati(String idUtente, int page, int size) {
        Page<Corso> corsi = corsiService.getCorsi(page, size);
        return corsi;
    }

}
