package DAO;

import Entities.Edificio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    @Autowired
    EdificioDAO edificioDAO;

    public void saveEdificio(Edificio edificio){
        edificioDAO.save(edificio);
        System.out.println("Il tuo edificio è stato salvato correttamente");
    }
}
