package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.LibroId;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreLibro extends Command {

    private final LibroId libroId;
    private final Nombre nombre;

    public ModificarNombreLibro(LibroId libroId, Nombre nombre) {
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
