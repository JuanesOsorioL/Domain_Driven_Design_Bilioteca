package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.MultimediaId;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.domain.generic.Command;

public class modificarNombreMultimedia extends Command {
    private final MultimediaId multimediaId;
    private final Nombre nombre;

    public modificarNombreMultimedia(MultimediaId multimediaId, Nombre nombre) {
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
