package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.MultimediaId;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreMultimediaModificado extends DomainEvent {
    private final MultimediaId multimediaId;
    private final Nombre nombre;

    public NombreMultimediaModificado(MultimediaId multimediaId, Nombre nombre) {
        super("sofka.Multimedia.NombreMultimediaModificado");
        this.multimediaId = multimediaId;
        this.nombre = nombre;
    }

    public MultimediaId getMultimediaId() {
        return multimediaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
