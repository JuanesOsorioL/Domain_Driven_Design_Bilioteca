package co.com.sofka.Estanteria.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Bastidor implements ValueObject<String> {
    private String bastidor;

    public Bastidor(String bastidor) {
        this.bastidor = Objects.requireNonNull(bastidor,"El bastidor es requerido");
    }
    @Override
    public String value() {
        return bastidor;
    }
}
