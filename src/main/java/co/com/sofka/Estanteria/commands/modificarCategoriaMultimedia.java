package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.MultimediaId;
import co.com.sofka.domain.generic.Command;

public class modificarCategoriaMultimedia extends Command {
    private final MultimediaId multimediaId;
    private final Categoria categoria;

    public modificarCategoriaMultimedia(MultimediaId multimediaId, Categoria categoria) {
        this.multimediaId = multimediaId;
        this.categoria = categoria;
    }

    public MultimediaId getMultimediaId() {
        return multimediaId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
