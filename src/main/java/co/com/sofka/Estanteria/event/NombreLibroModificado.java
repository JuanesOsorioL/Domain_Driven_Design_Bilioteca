package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.LibroId;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreLibroModificado extends DomainEvent {
    private final LibroId libroId;
    private final Nombre nombre;

    public NombreLibroModificado(LibroId libroId, Nombre nombre) {
        super("sofka.Libro.NombreLibroModificado");
        this.libroId = libroId;
        this.nombre = nombre;
    }

    public LibroId getLibroId() {
        return libroId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
