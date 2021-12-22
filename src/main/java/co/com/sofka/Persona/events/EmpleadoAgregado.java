package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.EmpleadoId;
import co.com.sofka.Persona.values.Funcion;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoAgregado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final Funcion funcion;

    public EmpleadoAgregado(EmpleadoId empleadoId, Funcion funcion) {
        super("sofka.Empleado.EmpleadoAgregado");
        this.empleadoId=empleadoId;
        this.funcion = funcion;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

}
