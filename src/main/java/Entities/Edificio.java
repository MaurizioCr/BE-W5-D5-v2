package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Edificio {

    @Id
    @GeneratedValue

    private long id;
    private String name;
    private String address;
    private String city;

    @OneToMany (mappedBy = "edificio")
    private List<Postazione> postazione;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostazione(List<Postazione> postazione) {
        this.postazione = postazione;
    }
}
