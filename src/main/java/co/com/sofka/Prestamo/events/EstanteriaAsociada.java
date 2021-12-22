package co.com.sofka.Prestamo.events;

import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.DomainEvent;

public class EstanteriaAsociada extends DomainEvent {
    private final EstanteriaId estanteriaId;

    public EstanteriaAsociada(EstanteriaId estanteriaId) {
        super("sofka.Prestamo.estanteriaAsociada");
        this.estanteriaId = estanteriaId;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }
}
