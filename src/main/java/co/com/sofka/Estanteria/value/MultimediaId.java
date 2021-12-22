package co.com.sofka.Estanteria.value;

import co.com.sofka.domain.generic.Identity;

public class MultimediaId extends Identity {
    private MultimediaId(String value){
        super(value);
    }

    public MultimediaId(){

    }

    public static MultimediaId of(String value){
        return new MultimediaId(value);
    }

}
