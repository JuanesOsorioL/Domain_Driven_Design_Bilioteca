package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Autor;
import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.Estanteria.value.RevistaId;
import co.com.sofka.domain.generic.Command;

public class AgregarRevista extends Command {
    private final RevistaId revistaId;
    private final Autor autor;
    private final Categoria categoria;
    private final Nombre nombre;

    public AgregarRevista(RevistaId revistaId, Autor autor, Categoria categoria, Nombre nombre) {
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
