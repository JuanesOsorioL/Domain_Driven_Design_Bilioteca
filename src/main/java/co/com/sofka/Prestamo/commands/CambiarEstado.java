package co.com.sofka.Prestamo.commands;

import co.com.sofka.Prestamo.values.Estado;
import co.com.sofka.domain.generic.Command;

public class CambiarEstado extends Command {
    private final Estado estado;

    public CambiarEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
