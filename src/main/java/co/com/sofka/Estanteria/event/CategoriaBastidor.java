package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Bastidor;
import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaBastidor extends DomainEvent {
    private EstanteriaId estanteriaId;
    private Bastidor bastidor;

    public CategoriaBastidor(EstanteriaId estanteriaId, Bastidor bastidor) {
        super("sofka.Estanteria.CategoriaBastidor");
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
