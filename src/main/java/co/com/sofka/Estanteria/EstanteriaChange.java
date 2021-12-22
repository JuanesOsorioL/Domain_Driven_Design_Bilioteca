package co.com.sofka.Estanteria;

import co.com.sofka.domain.generic.EventChange;



public class EstanteriaChange extends EventChange {
    public EstanteriaChange(Estanteria estanteria) {
        apply((EstanteriaCreada event) -> {
            estanteria.bastidor=event.

        });
    }
}
