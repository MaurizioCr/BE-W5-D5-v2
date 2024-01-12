package mauriziocrispino.gestioneprenotazioni.DAO;

import mauriziocrispino.gestioneprenotazioni.Entities.Postazione;
import mauriziocrispino.gestioneprenotazioni.Entities.TipoPostazione;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PostazioneService {
    @Autowired
    PostazioneDAO postazioneDAO;

    public void savePostazione(Postazione postazione){
        postazioneDAO.save(postazione);
        System.out.println("La tua postazione è stata salvata correttamente");
    }

    public List<Postazione> findByTypeAndCity(TipoPostazione tipoPostazione, String city) {
        return postazioneDAO.findByTipoPostazioneAndEdificio_City(tipoPostazione, city);
    }
}
