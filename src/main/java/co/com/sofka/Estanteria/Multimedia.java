package co.com.sofka.Estanteria;

import co.com.sofka.Estanteria.value.*;
import co.com.sofka.Generico.Entity;


import java.util.Objects;

public class Multimedia extends Entity<MultimediaId> {

    private MultimediaId multimediaId;
    private Autor autor;
    private Categoria categoria;
    private Nombre nombre;

    public Multimedia(MultimediaId multimediaId, Autor autor, Categoria categoria, Nombre nombre) {
        super(multimediaId);
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
