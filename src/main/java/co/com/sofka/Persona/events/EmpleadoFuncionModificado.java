package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.EmpleadoId;
import co.com.sofka.Persona.values.Funcion;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoFuncionModificado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final Funcion funcion;

    public EmpleadoFuncionModificado(EmpleadoId empleadoId, Funcion funcion) {
        super("sofka.Empleado.EmpleadoFuncionModificado");
        this.empleadoId = empleadoId;
        this.funcion = funcion;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Funcion getFuncion() {
        return funcion;
    }

}
