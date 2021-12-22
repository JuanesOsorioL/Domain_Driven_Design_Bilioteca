package co.com.sofka.Prestamo.commands;

import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.Command;

public class AsociarEstanteria extends Command {
    private EstanteriaId estanteriaId;

    public AsociarEstanteria(EstanteriaId estanteriaId) {
        this.estanteriaId = estanteriaId;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }
}
