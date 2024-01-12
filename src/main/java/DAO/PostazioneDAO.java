package DAO;

import Entities.Postazione;
import Entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostazioneDAO extends JpaRepository <Postazione, Long> {
    List<Postazione> findByTypeAndCity(TipoPostazione tipoPostazione, String city);
}
