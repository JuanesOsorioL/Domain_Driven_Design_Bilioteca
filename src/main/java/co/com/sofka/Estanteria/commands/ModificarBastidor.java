package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Bastidor;
import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.Command;

public class ModificarBastidor extends Command {

    private final EstanteriaId estanteriaId;
    private final Bastidor bastidor;

    public ModificarBastidor(EstanteriaId estanteriaId, Bastidor bastidor) {
        this.estanteriaId = estanteriaId;
        this.bastidor = bastidor;
    }

    public EstanteriaId getEstanteriaId() {
        return estanteriaId;
    }

    public Bastidor getBastidor() {
        return bastidor;
    }
}
