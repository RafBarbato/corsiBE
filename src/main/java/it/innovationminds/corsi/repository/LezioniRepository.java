package it.innovationminds.corsi.repository;

import it.innovationminds.corsi.model.Lezione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LezioniRepository extends JpaRepository<Lezione, Integer> {


    

}
