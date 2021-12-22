package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.Nikname;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.Command;

public class modificarNiknameUsuario extends Command {
    private final UsuarioId usuarioId;
    private final Nikname nikname;

    public modificarNiknameUsuario(UsuarioId usuarioId, Nikname nikname) {
        this.usuarioId = usuarioId;
        this.nikname = nikname;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nikname getNikname() {
        return nikname;
    }
}
