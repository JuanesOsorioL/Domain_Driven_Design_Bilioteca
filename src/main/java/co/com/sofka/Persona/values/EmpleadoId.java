package co.com.sofka.Persona.values;

import co.com.sofka.domain.generic.Identity;

public class EmpleadoId extends Identity {

    private EmpleadoId(String value){
        super(value);
    }

    public EmpleadoId(){

    }

    public static EmpleadoId of(String value){
        return new EmpleadoId(value);
    }
}
