package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.Password;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.Command;

public class modificarPasswordUsuario extends Command {

    private final UsuarioId usuarioId;
    private final Password password;

    public modificarPasswordUsuario(UsuarioId usuarioId, Password password) {
        this.usuarioId = usuarioId;
        this.password = password;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Password getPassword() {
        return password;
    }
}
