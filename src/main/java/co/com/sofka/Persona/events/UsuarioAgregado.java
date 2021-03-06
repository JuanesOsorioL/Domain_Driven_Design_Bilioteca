package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.Nikname;
import co.com.sofka.Persona.values.Password;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioAgregado extends DomainEvent {
    private final UsuarioId usuarioId;
    private final Nikname nikname;
    private final Password password;

    public UsuarioAgregado(UsuarioId usuarioId, Nikname nikname, Password password) {
        super("sofka.Usuario.UsuarioAgregado");
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
