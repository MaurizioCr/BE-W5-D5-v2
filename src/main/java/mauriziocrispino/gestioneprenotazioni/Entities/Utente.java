package mauriziocrispino.gestioneprenotazioni.Entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "utente")

@Getter

public class Utente {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String name;
    private String surname;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "prenotazione_utente",
            joinColumns = @JoinColumn(name = "utente_id"),
            inverseJoinColumns = @JoinColumn(name = "prenotazione_id"))
    private List<Postazione> postazione;

    @OneToMany(mappedBy = "utente")
    private List<Prenotazione> prenotazioni;


    public Utente(String username, String name, String surname, String email, List<Postazione> postazione) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.postazione = postazione;
    }

    public Utente() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPostazione(List<Postazione> postazione) {
        this.postazione = postazione;
    }
}
