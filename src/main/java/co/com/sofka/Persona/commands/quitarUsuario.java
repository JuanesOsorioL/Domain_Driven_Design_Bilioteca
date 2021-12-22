package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.Command;

public class quitarUsuario extends Command {
    private final UsuarioId usuarioId;

    public quitarUsuario(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
