package it.innovationminds.corsi.service;

import it.innovationminds.corsi.model.Corso;
import it.innovationminds.corsi.model.Lezione;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface CorsiService {


    Page<Corso> getCorsi(Integer page, Integer size);
    Page<Lezione> getLezioni(Integer page, Integer size);



}
