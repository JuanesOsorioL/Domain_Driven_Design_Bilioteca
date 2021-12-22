package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.RevistaId;
import co.com.sofka.domain.generic.Command;

public class ModificarCategoriaRevista extends Command {
    private final RevistaId revistaId;
    private final Categoria categoria;

    public ModificarCategoriaRevista(RevistaId revistaId, Categoria categoria) {
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
