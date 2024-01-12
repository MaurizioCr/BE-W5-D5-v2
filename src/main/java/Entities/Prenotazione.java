package Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazione")
@Getter
@ToString


public class Prenotazione {
    @Id
    @GeneratedValue

    private long id;
    private LocalDate localDate;
    private LocalDate dataScadenza;

    @ManyToMany
    private Postazione postazione;

    @ManyToMany
    private Utente utente;

    public Prenotazione(LocalDate localDate, Postazione postazione, Utente utente) {
        this.localDate = localDate;
        this.postazione = postazione;
        this.utente = utente;
    }

    public Prenotazione() {
    }
    public Prenotazione(LocalDate dataEmissione) {
        this.localDate = dataEmissione;
        this.dataScadenza = dataEmissione.plusDays(1);
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
