package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Autor;
import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.LibroId;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarLibro extends Command {
    private final LibroId libroId;
    private final Autor autor;
    private final Categoria categoria;
    private final Nombre nombre;

    public AgregarLibro(LibroId libroId, Autor autor, Categoria categoria, Nombre nombre) {
        this.libroId = libroId;
        this.autor = autor;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public LibroId getLibroId() {
        return libroId;
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
