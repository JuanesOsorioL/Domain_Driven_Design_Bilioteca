package co.com.sofka.Persona;

import co.com.sofka.Persona.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoId> {

    private Funcion funcion;

    public Empleado(EmpleadoId empleadoId, Funcion funcion) {
        super(empleadoId);
        this.funcion= Objects.requireNonNull(funcion);
    }

    public void modificarFuncion(Funcion funcion){
        this.funcion = Objects.requireNonNull(funcion);
    }

    public Funcion funcion() {
        return funcion;
    }
}
