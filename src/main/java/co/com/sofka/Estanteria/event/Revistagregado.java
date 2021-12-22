package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Autor;
import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.Estanteria.value.RevistaId;
import co.com.sofka.domain.generic.DomainEvent;

public class Revistagregado extends DomainEvent {
    private final RevistaId revistaId;
    private final Autor autor;
    private final Categoria categoria;
    private final Nombre nombre;

    public Revistagregado(RevistaId revistaId, Autor autor, Categoria categoria, Nombre nombre) {
        super("sofka.Revista.Revistagregado");
        this.revistaId = revistaId;
        this.autor = autor;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public RevistaId getRevistaId() {
        return revistaId;
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
