package co.com.sofka.Estanteria.value;

import co.com.sofka.domain.generic.Identity;

public class RevistaId extends Identity {
    private RevistaId(String value){
        super(value);
    }

    public RevistaId(){

    }

    public static RevistaId of(String value){
        return new RevistaId(value);
    }

}
