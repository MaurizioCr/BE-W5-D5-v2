package mauriziocrispino.gestioneprenotazioni;

import DAO.EdificioService;
import DAO.PostazioneService;
import DAO.PrenotazioneService;
import DAO.UtenteService;
import Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InizializzazioneDati implements CommandLineRunner {
    @Autowired
    private EdificioService edificioService;

    @Autowired
    private PostazioneService postazioneService;

    @Autowired
    private UtenteService utenteService;

    @Autowired
    private PrenotazioneService prenotazioneService;

    @Override
    public void run(String... args) throws Exception {
        Edificio edificio = new Edificio();
        edificio.setName("Edificio A");
        edificio.setAddress("Via delle Rose, 123");
        edificio.setCity("Città");

        edificioService.saveEdificio(edificio);

        Postazione postazione = new Postazione();
        postazione.setDescrizione("Postazione 1");
        postazione.setTipoPostazione(TipoPostazione.OPENSPACE);
        postazione.setMaxOccupanti(1);
        postazione.setEdificio(edificio);

        postazioneService.savePostazione(postazione);

        Utente utente = new Utente();
        utente.setUsername("user1");
        utente.setName("Nome");
        utente.setSurname("Cognome");
        utente.setEmail("nome.cognome@example.com");

        utenteService.saveUtente(utente);

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setPostazione(postazione);
        prenotazione.setUtente(utente);
        prenotazione.setLocalDate(LocalDate.now());

        prenotazioneService.savePrenotazione(prenotazione);
    }
}