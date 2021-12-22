package co.com.sofka.Estanteria;

import co.com.sofka.Estanteria.value.Autor;
import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.LibroId;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class librocreado extends DomainEvent {
    public librocreado(LibroId libroId, Autor autor, Categoria categoria, Nombre nombre) {
        super();
    }
}
