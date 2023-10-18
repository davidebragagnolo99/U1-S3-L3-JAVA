package davidebragagnolo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
@Getter
@Setter

public class Location {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String city;

    public Location(String nome, String city) {
        super();
        this.nome = nome;
        this.city = city;
    }
}
