package DAO;

import Entities.Edificio;
import Entities.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    UtenteDAO utenteDAO;

    public void saveUtente(Utente utente){
        utenteDAO.save(utente);
        System.out.println("Il tuo edificio è stato salvato correttamente");
    }
}
