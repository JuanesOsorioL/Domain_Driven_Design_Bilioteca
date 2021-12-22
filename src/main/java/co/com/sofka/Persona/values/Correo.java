package co.com.sofka.Persona.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {
    private String correo;

    public Correo(String correo) {
        this.correo = Objects.requireNonNull(correo,"El correo es requerido");
    }

    @Override
    public String value() {
        return correo;
    }
}
