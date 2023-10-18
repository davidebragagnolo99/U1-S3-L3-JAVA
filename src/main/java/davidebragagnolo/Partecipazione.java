package davidebragagnolo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table()

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

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


}
