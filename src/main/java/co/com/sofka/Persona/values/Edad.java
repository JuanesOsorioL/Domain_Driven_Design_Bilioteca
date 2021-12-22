package co.com.sofka.Persona.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Edad implements ValueObject<Integer> {
    private Integer edad;

    public Edad(Integer edad) {
        this.edad = Objects.requireNonNull(edad,"La Edad es requerida");
    }

    @Override
    public Integer value() {
        return edad;
    }
}
