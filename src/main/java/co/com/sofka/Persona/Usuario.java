package co.com.sofka.Persona;

import co.com.sofka.Persona.values.Nikname;
import co.com.sofka.Persona.values.Password;
import co.com.sofka.Persona.values.UsuarioId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Usuario extends Entity<UsuarioId> {

    private UsuarioId usuarioId;
    private Nikname nikname;
    private Password password;

    public Usuario(UsuarioId usuarioId, Nikname nikname, Password password) {
        super(usuarioId);
        this.nikname= Objects.requireNonNull(nikname);
        this.password= Objects.requireNonNull(password);
    }

    public void cambiarNikname(Nikname nikname){
        this.nikname = Objects.requireNonNull(nikname);
    }

    public void cambiarPassword(Password password){
        this.password = Objects.requireNonNull(password);
    }

    public UsuarioId usuarioId() {
        return usuarioId;
    }

    public Nikname nikname() {
        return nikname;
    }

    public Password password() {
        return password;
    }

}
