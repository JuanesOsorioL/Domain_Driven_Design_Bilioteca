package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.Command;

public class ModificarCategoria extends Command {
    private final EstanteriaId estanteriaId;
    private final Categoria categoria;

    public ModificarCategoria(EstanteriaId estanteriaId, Categoria categoria) {
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
