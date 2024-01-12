package mauriziocrispino.gestioneprenotazioni.DAO;

import mauriziocrispino.gestioneprenotazioni.Entities.Utente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {

    @Autowired
    UtenteDAO utenteDAO;

    public void saveUtente(Utente utente){
        utenteDAO.save(utente);
        System.out.println("Il tuo edificio è stato salvato correttamente");
    }
}
