package co.com.sofka.Estanteria.value;

import co.com.sofka.domain.generic.Identity;

public class LibroId extends Identity {
    private LibroId(String value){
        super(value);
    }

    public LibroId(){

    }

    public static LibroId of(String value){
        return new LibroId(value);
    }
}
