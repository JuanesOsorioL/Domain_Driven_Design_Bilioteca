package co.com.sofka.Prestamo.events;

import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.Prestamo.values.Estado;
import co.com.sofka.Prestamo.values.RegistroId;
import co.com.sofka.domain.generic.DomainEvent;

public class PrestamoCreado extends DomainEvent {
    private final PersonaId personaId;
    private final EstanteriaId estanteriaId;
    private final Estado estado;
    private final RegistroId registroId;

    public PrestamoCreado(PersonaId personaId, EstanteriaId estanteriaId, Estado estado, RegistroId registroId) {
        super("sofka.Prestamo.PrestamoCreado");
        this.personaId = personaId;
        this.estanteriaId = estanteriaId;
        this.estado = estado;
        this.registroId = registroId;
    }

    public PersonaId getPersonaId() {
        return personaId;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }

    public Estado getEstado() {
        return estado;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }
}
