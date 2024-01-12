package DAO;

import Entities.Edificio;
import Entities.Postazione;
import Entities.TipoPostazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    PostazioneDAO postazioneDAO;

    public void savePostazione(Postazione postazione){
        postazioneDAO.save(postazione);
        System.out.println("La tua postazione è stata salvata correttamente");
    }

    public List<Postazione> filterByType(TipoPostazione tipoPostazione, String city) {
        return postazioneDAO.findByTypeAndCity(tipoPostazione, city);
    }
}
