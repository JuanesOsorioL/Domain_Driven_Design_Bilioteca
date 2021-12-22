package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class UsuarioQuitado extends DomainEvent {
    private UsuarioId usuarioId;

    public UsuarioQuitado(UsuarioId usuarioId) {
        super("sofka.Usuario.UsuarioQuitado");
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
