package it.innovationminds.corsi.model;

import lombok.Data;

@Data
public class Corso {

    String titolo;
    Float durataOre;
    Integer lezioneAttuale;
    String stato;

}
