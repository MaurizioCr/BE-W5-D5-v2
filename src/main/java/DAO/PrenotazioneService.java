package DAO;

import Entities.Postazione;
import Entities.Prenotazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {

    @Autowired
    PrenotazioneDAO prenotazioneDAO;

    public void savePrenotazione(Prenotazione prenotazione){
        prenotazioneDAO.save(prenotazione);
        System.out.println("La tua prenotazione è stata salvata correttamente");
    }
}
