package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Bastidor;
import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.Command;

public class modificarBastidor extends Command {

    private EstanteriaId estanteriaId;
    private Bastidor bastidor;

    public modificarBastidor(EstanteriaId estanteriaId, Bastidor bastidor) {
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
