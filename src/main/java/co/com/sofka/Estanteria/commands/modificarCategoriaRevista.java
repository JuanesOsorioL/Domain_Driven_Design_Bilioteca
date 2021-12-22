package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.RevistaId;
import co.com.sofka.domain.generic.Command;

public class modificarCategoriaRevista extends Command {
    private RevistaId revistaId;
    private Categoria categoria;

    public modificarCategoriaRevista(RevistaId revistaId, Categoria categoria) {
        this.revistaId = revistaId;
        this.categoria = categoria;
    }

    public RevistaId getRevistaId() {
        return revistaId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
