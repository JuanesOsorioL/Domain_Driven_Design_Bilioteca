package co.com.sofka.Estanteria.value;

import co.com.sofka.domain.generic.Identity;

public class EstanteriaId extends Identity {
    private EstanteriaId(String value){
        super(value);
    }

    public EstanteriaId(){

    }

    public static EstanteriaId of(String value){
        return new EstanteriaId(value);
    }

}
