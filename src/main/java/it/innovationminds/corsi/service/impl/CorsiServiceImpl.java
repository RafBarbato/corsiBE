package it.innovationminds.corsi.service.impl;

import it.innovationminds.corsi.model.Corso;
import it.innovationminds.corsi.model.Lezione;
import it.innovationminds.corsi.repository.CorsiRepository;
import it.innovationminds.corsi.repository.LezioniRepository;
import it.innovationminds.corsi.service.CorsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CorsiServiceImpl implements CorsiService {

    @Autowired
    CorsiRepository corsiRepository;

    @Autowired
    LezioniRepository lezioniRepository;


    @Override
    public Page<Corso> getCorsi(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return corsiRepository.findAll(pageable);
    }

    @Override
    public Page<Lezione> getLezioni(Integer page, Integer size) {
        return null;
    }
}
