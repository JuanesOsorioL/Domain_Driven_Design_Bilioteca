package co.com.sofka.Prestamo.events;

import co.com.sofka.Prestamo.values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoCambiado extends DomainEvent {
    private final Estado estado;

    public EstadoCambiado(Estado estado) {
        super("sofka.Estado.estadoCambiado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
