package co.com.sofka.Prestamo.commands;

import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.domain.generic.Command;

public class AsociarPersona extends Command {
    private final PersonaId personaId;

    public AsociarPersona(PersonaId personaId) {
        this.personaId = personaId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }
}
