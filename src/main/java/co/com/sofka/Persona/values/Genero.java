package co.com.sofka.Persona.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Genero implements ValueObject<String> {
    private String genero;

    public Genero(String genero) {
        this.genero = Objects.requireNonNull(genero,"El genero es requerido");
    }

    @Override
    public String value() {
        return genero;
    }
}
