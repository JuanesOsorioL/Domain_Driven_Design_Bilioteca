package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.Nikname;
import co.com.sofka.Persona.values.Password;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioAgregado extends DomainEvent {
    private UsuarioId usuarioId;
    private Nikname nikname;
    private Password password;

    public UsuarioAgregado(UsuarioId usuarioId, Nikname nikname, Password password) {
        super("sofka.Usuario.UsuarioAgregado");
        this.usuarioId = usuarioId;
        this.nikname = nikname;
        this.password = password;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(UsuarioId usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Nikname getNikname() {
        return nikname;
    }

    public void setNikname(Nikname nikname) {
        this.nikname = nikname;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
