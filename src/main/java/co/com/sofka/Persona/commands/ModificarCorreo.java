package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.Correo;
import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.domain.generic.Command;

public class ModificarCorreo extends Command {
    private final PersonaId personaId;
    private final Correo correo;

    public ModificarCorreo(PersonaId personaId, Correo correo) {
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
