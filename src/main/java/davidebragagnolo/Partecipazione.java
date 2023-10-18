package davidebragagnolo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table()
@Getter
@Setter
public class Partecipazione {
    @Id
    @GeneratedValue
    private int id;
    private Stato stato;

    @ManyToOne
    @JoinColumn(name = "evento", referencedColumnName = "id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "persona", referencedColumnName = "id")
    private Persona persona;

    public Partecipazione(Stato stato, Evento evento, Persona persona) {
        this.stato = stato;
        this.evento = evento;
        this.persona = persona;
    }
}
