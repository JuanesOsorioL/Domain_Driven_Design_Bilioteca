package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.Command;

public class QuitarUsuario extends Command {
    private final UsuarioId usuarioId;

    public QuitarUsuario(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
