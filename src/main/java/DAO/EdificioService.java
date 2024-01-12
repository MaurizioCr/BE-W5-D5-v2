package DAO;

import Entities.Edificio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired
    EdificioDAO edificioDAO;

    public void saveEdificio(Edificio edificio){
        edificioDAO.save(edificio);
        System.out.println("Il tuo edificio è stato salvato correttamente");
    }
}
