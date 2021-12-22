package co.com.sofka.Persona.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Password implements ValueObject<String> {
    private String password;

    public Password(String password) {
        this.password= Objects.requireNonNull(password,"El password es requerido");
    }

    @Override
    public String value() {
        return password;
    }
}
