package co.com.sofka.Estanteria.event;

import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.Estanteria.value.RevistaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CategoriaRevistaModificado extends DomainEvent {
    private RevistaId revistaId;
    private Categoria categoria;

    public CategoriaRevistaModificado(RevistaId revistaId, Categoria categoria) {
        super("sofka.Revista.CategoriaRevistaModificado");
        this.revistaId = revistaId;
        this.categoria = categoria;
    }

    public RevistaId getRevistaId() {
        return revistaId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
