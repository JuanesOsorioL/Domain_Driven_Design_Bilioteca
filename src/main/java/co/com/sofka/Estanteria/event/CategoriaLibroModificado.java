package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.LibroId;
import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaLibroModificado extends DomainEvent {
    private LibroId libroId;
    private Categoria categoria;

    public CategoriaLibroModificado(LibroId libroId, Categoria categoria) {
        super("sofka.Libro.CategoriaLibroModificado");
        this.libroId = libroId;
        this.categoria = categoria;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
