package co.com.sofka.Persona.events;

import co.com.sofka.Persona.values.Nikname;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class NiknameUsuarioModificado extends DomainEvent {
    private final UsuarioId usuarioId;
    private final Nikname nikname;

    public NiknameUsuarioModificado(UsuarioId usuarioId, Nikname nikname) {
        super("sofka.Usuario.NiknameUsuarioModificado");
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
