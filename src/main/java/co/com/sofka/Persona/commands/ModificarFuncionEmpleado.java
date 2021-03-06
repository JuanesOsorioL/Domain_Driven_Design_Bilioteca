package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.EmpleadoId;
import co.com.sofka.Persona.values.Funcion;
import co.com.sofka.domain.generic.Command;

public class ModificarFuncionEmpleado extends Command {
    private final EmpleadoId empleadoId;
    private final Funcion funcion;

    public ModificarFuncionEmpleado(EmpleadoId empleadoId, Funcion funcion) {
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
