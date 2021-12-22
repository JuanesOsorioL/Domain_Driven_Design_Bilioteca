package co.com.sofka.Prestamo.commands;

import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.Prestamo.values.Estado;
import co.com.sofka.Prestamo.values.PrestamoId;
import co.com.sofka.Prestamo.values.RegistroId;
import co.com.sofka.domain.generic.Command;

public class CrearPrestamo extends Command {
    private final PrestamoId prestamoId;
    private final PersonaId personaId;
    private final EstanteriaId estanteriaId;
    private final Estado estado;
    private final RegistroId registroId;

    public CrearPrestamo(PrestamoId prestamoId, PersonaId personaId, EstanteriaId estanteriaId, Estado estado, RegistroId registroId) {

        this.prestamoId = prestamoId;
        this.personaId = personaId;
        this.estanteriaId = estanteriaId;
        this.estado = estado;
        this.registroId = registroId;
    }

    public PrestamoId getPrestamoId() {
        return prestamoId;
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
