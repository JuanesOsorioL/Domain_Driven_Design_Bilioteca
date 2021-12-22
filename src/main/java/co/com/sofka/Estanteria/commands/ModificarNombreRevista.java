package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Nombre;
import co.com.sofka.Estanteria.value.RevistaId;
import co.com.sofka.domain.generic.Command;

public class ModificarNombreRevista extends Command {
    private final RevistaId revistaId;
    private final Nombre nombre;

    public ModificarNombreRevista(RevistaId revistaId, Nombre nombre) {
        this.revistaId = revistaId;
        this.nombre = nombre;
    }

    public RevistaId getRevistaId() {
        return revistaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
