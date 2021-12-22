package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Autor;
import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.MultimediaId;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class MultimediaAgregada extends DomainEvent {
    private final MultimediaId multimediaId;
    private final Autor autor;
    private final Categoria categoria;
    private final Nombre nombre;

    public MultimediaAgregada(MultimediaId multimediaId, Autor autor, Categoria categoria, Nombre nombre) {
        super("sofka.Multimedia.Multimediaagregada");
        this.multimediaId = multimediaId;
        this.autor = autor;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public MultimediaId getMultimediaId() {
        return multimediaId;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
