package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Bastidor;
import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.domain.generic.DomainEvent;

public class EstanteriaCreada extends DomainEvent {
    private final Bastidor bastidor;
    private final Categoria categoria;

    public EstanteriaCreada(Bastidor bastidor, Categoria categoria) {
        super("sofka.Estanteria.EstanteriaCreada");
        this.bastidor = bastidor;
        this.categoria = categoria;
    }

    public Bastidor getBastidor() {
        return bastidor;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
