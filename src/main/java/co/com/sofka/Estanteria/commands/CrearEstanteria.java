package co.com.sofka.Estanteria.commands;

import co.com.sofka.Estanteria.value.Bastidor;
import co.com.sofka.Estanteria.value.Categoria;
import co.com.sofka.domain.generic.Command;

public class CrearEstanteria extends Command {
    private final Bastidor bastidor;
    private final Categoria categoria;

    public CrearEstanteria(Bastidor bastidor, Categoria categoria) {
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
