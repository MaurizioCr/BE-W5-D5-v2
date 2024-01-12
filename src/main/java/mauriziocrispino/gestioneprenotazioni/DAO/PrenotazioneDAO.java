package mauriziocrispino.gestioneprenotazioni.DAO;

import mauriziocrispino.gestioneprenotazioni.Entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDAO extends JpaRepository <Prenotazione, Long> {
}
