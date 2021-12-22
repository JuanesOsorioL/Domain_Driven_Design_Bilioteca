package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.LibroId;
import co.com.sofka.domain.generic.Command;

public class ModificarCategoriaLibro extends Command {
    private final LibroId libroId;
    private final Categoria categoria;

    public ModificarCategoriaLibro(LibroId libroId, Categoria categoria) {
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
