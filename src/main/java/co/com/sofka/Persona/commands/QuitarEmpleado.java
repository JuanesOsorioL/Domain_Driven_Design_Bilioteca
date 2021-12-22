package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

public class QuitarEmpleado extends Command {

    private final EmpleadoId empleadoId;

    public QuitarEmpleado(EmpleadoId empleadoId) {
        this.empleadoId = empleadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
