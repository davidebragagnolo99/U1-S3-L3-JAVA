package davidebragagnolo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "persona")
@Getter
@Setter


    public class Persona {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private Sesso genere;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private Set<Partecipazione> listaPartecipazioni;

    public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, Sesso genere, Set<Partecipazione> partecipazioni) {
        super();
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.genere = genere;
        this.listaPartecipazioni = partecipazioni;
    }
}
