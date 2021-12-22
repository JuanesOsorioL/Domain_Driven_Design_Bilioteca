package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.Password;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class PasswordUsuarioModificado extends DomainEvent {
    private final UsuarioId usuarioId;
    private final Password password;

    public PasswordUsuarioModificado(UsuarioId usuarioId, Password password) {
        super("sofka.Usuario.PasswordUsuarioModificado");
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
