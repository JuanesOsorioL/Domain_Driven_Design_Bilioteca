package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.Correo;
import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CorreoModificado extends DomainEvent {
    private final PersonaId personaId;
    private final Correo correo;

    public CorreoModificado(PersonaId personaId, Correo correo) {
        super("sofka.Persona.CorreoModificado");
        this.personaId = personaId;
        this.correo = correo;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public Correo getCorreo() {
        return correo;
    }
}
