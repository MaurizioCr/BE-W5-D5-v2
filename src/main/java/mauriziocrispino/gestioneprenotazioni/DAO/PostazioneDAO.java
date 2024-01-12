package mauriziocrispino.gestioneprenotazioni.DAO;

import mauriziocrispino.gestioneprenotazioni.Entities.Postazione;
import mauriziocrispino.gestioneprenotazioni.Entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostazioneDAO extends JpaRepository <Postazione, Long> {
    List<Postazione> findByTipoPostazioneAndEdificio_City(TipoPostazione tipoPostazione, String city);
}
