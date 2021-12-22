package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

public class quitarEmpleado extends Command {

    private final EmpleadoId empleadoId;

    public quitarEmpleado(EmpleadoId empleadoId) {
        this.empleadoId = empleadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
