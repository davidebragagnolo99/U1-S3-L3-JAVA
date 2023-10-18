package davidebragagnolo;

import javax.persistence.EntityManager;

public class PersonaDAO {
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    
}
