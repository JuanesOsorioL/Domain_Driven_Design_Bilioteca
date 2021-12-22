package co.com.sofka.Estanteria.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<String> {
    private String categoria;

    public Categoria(String categoria) {
        this.categoria = Objects.requireNonNull(categoria,"La categoria es requerido");
    }

    @Override
    public String value() {
        return categoria;
    }
}
