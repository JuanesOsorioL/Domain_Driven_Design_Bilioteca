package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.Command;

public class modificarCategoria extends Command {
    private EstanteriaId estanteriaId;
    private Categoria categoria;

    public modificarCategoria(EstanteriaId estanteriaId, Categoria categoria) {
        this.estanteriaId = estanteriaId;
        this.categoria = categoria;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
