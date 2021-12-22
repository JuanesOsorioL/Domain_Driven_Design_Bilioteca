package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaModificada extends DomainEvent {
    private EstanteriaId estanteriaId;
    private Categoria categoria;

    public CategoriaModificada(EstanteriaId estanteriaId, Categoria categoria) {
        super("sofka.Estanteria.CategoriaModificada");
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
