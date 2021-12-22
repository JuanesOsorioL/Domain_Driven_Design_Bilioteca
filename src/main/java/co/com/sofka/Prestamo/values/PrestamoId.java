package co.com.sofka.Prestamo.values;


import co.com.sofka.domain.generic.Identity;

public class PrestamoId extends Identity {

    private PrestamoId(String value){
        super(value);
    }

    public PrestamoId(){

    }

    public static PrestamoId of(String value){
        return new PrestamoId(value);
    }
}
