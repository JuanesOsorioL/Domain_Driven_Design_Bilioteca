package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.Estanteria.value.RevistaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreRevistaModificado extends DomainEvent {
    private final RevistaId revistaId;
    private final Nombre nombre;

    public NombreRevistaModificado(RevistaId revistaId, Nombre nombre) {
        super("sofka.Nombre.NombreRevistaModificado");
        this.revistaId = revistaId;
        this.nombre = nombre;
    }

    public RevistaId getRevistaId() {
        return revistaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
