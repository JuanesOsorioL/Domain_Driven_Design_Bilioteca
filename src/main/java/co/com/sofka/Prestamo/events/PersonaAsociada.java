package co.com.sofka.Prestamo.events;

import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;

public class PersonaAsociada extends DomainEvent {
    private final PersonaId personaId;

    public PersonaAsociada(PersonaId personaId) {
        super("sofka.Prestamo.PersonaAsociada");
        this.personaId = personaId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }
}
