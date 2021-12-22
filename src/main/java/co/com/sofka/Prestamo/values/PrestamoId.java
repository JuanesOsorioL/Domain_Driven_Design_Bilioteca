package co.com.sofka.Prestamo.values;

import co.com.sofka.Generico.Id;

public class PrestamoId extends Id {

    private PrestamoId(String value){
        super(value);
    }

    public PrestamoId(){

    }

    public static PrestamoId of(String value){
        return new PrestamoId(value);
    }
}
