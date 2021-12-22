package co.com.sofka.Estanteria;

import co.com.sofka.Estanteria.value.*;
import co.com.sofka.Generico.Entity;

import java.util.Objects;

public class Libro extends Entity<LibroId> {

    private LibroId libroId;
    private Autor autor;
    private Categoria categoria;
    private Nombre nombre;

    public Libro(LibroId libroId, Autor autor, Categoria categoria, Nombre nombre) {
        super(libroId);
        this.autor= Objects.requireNonNull(autor);
        this.categoria= Objects.requireNonNull(categoria);
        this.nombre= Objects.requireNonNull(nombre);
    }

    public void actualizarCategoria(Categoria categoria){
        this.categoria = Objects.requireNonNull(categoria);
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

}
