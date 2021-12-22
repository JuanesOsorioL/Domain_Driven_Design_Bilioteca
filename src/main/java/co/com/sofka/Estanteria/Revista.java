package co.com.sofka.Estanteria;

import co.com.sofka.Estanteria.value.*;
import co.com.sofka.domain.generic.Entity;
import java.util.Objects;

public class Revista extends Entity<RevistaId> {

    private RevistaId revistaId;
    private Autor autor;
    private Categoria categoria;
    private Nombre nombre;

    public Revista(RevistaId revistaId, Autor autor, Categoria categoria, Nombre nombre) {
        super(revistaId);
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

    public RevistaId revistaId() {
        return revistaId;
    }

    public Autor autor() {
        return autor;
    }

    public Categoria categoria() {
        return categoria;
    }

    public Nombre nombre() {
        return nombre;
    }
}
