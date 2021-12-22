package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.MultimediaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaMultimediaModificado extends DomainEvent {
    private final MultimediaId multimediaId;
    private final Categoria categoria;

    public CategoriaMultimediaModificado(MultimediaId multimediaId, Categoria categoria) {
        super("sofka.Multimedia.CategoriaMultimediaModificado");
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
