package it.innovationminds.corsi.repository;

import it.innovationminds.corsi.model.Corso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CorsiRepository extends JpaRepository<Corso, Integer> {

    @Query(value = "SELECT * FROM Corso")
    Page<Corso> findAll(Pageable pageable);


}
