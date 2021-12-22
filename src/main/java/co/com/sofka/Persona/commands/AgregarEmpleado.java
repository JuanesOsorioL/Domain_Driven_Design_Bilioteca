package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.EmpleadoId;
import co.com.sofka.Persona.values.Funcion;
import co.com.sofka.domain.generic.Command;

public class AgregarEmpleado extends Command{

    private final EmpleadoId empleadoId;
    private final Funcion funcion;

    public AgregarEmpleado(EmpleadoId empleadoId, Funcion funcion) {
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
