package co.com.sofka.Prestamo.values;

import co.com.sofka.Generico.Id;

public class RegistroId extends Id {

    private RegistroId(String value){
        super(value);
    }

    public RegistroId(){

    }

    public static RegistroId of(String value){
        return new RegistroId(value);
    }
}
