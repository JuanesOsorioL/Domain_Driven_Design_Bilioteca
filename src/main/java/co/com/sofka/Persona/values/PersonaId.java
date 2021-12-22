package co.com.sofka.Persona.values;

import co.com.sofka.domain.generic.Identity;

public final class PersonaId extends Identity {

    private PersonaId(String value){
        super(value);
    }

    public PersonaId(){

    }

    public static PersonaId of(String value){
        return new PersonaId(value);
    }
}
