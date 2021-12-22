package co.com.sofka.Estanteria.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Autor implements ValueObject<String> {

    private String autor;

    public Autor(String autor) {
        this.autor = Objects.requireNonNull(autor,"El autor es requerido");
    }

    @Override
    public String value() {
        return autor;
    }
}
