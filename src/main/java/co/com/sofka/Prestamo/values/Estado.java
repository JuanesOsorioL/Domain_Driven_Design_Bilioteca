package co.com.sofka.Prestamo.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public class Estado implements ValueObject<String> {
    private String estado;

    public Estado(String estado) {
        this.estado = Objects.requireNonNull(estado,"El estado es requerido");
    }

    @Override
    public String value() {
        return estado;
    }

}
