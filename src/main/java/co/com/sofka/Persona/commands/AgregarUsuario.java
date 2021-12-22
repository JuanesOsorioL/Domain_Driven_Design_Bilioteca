package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.Nikname;
import co.com.sofka.Persona.values.Password;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.Command;

public class AgregarUsuario extends Command {

    private final UsuarioId usuarioId;
    private final Nikname nikname;
    private final Password password;

    public AgregarUsuario(UsuarioId usuarioId, Nikname nikname, Password password) {
        this.usuarioId = usuarioId;
        this.nikname = nikname;
        this.password = password;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nikname getNikname() {
        return nikname;
    }

    public Password getPassword() {
        return password;
    }
}
