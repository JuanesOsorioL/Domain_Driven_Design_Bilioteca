package co.com.sofka.Prestamo.commands;

import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.Command;

public class AsociarEstanteria extends Command {
    private final EstanteriaId estanteriaId;

    public AsociarEstanteria(EstanteriaId estanteriaId) {
        this.estanteriaId = estanteriaId;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }
}
