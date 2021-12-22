package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.EmpleadoId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoQuitado extends DomainEvent {
    private final EmpleadoId empleadoId;

    public EmpleadoQuitado(EmpleadoId empleadoId) {
        super("sofka.Empleado.EmpleadoQuitado");
        this.empleadoId = empleadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
