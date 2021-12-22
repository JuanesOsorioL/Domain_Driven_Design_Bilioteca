package co.com.sofka.Prestamo;

import co.com.sofka.Estanteria.*;
import co.com.sofka.Persona.values.*;
import co.com.sofka.Prestamo.values.RegistroId;
import co.com.sofka.domain.generic.Entity;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Registro extends Entity<RegistroId> {

    private RegistroId registroId;
    private UsuarioId usuarioId;
    private Set<Revista> revista;
    private Set<Multimedia> multimedia;
    private Set<Libro> libros;

    public Registro(RegistroId registroId, UsuarioId usuarioId){
        super(registroId);
        this.usuarioId = Objects.requireNonNull(usuarioId,"El Id de Usuario es requerido");
        this.revista = new HashSet<>();
        this.multimedia = new HashSet<>();
        this.libros = new HashSet<>();
    }

    public void agregarRevista(Revista revista){
        this.revista.add(revista);
    }

    public void agregarMultimedia(Multimedia multimedia){
        this.multimedia.add(multimedia);
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public UsuarioId usuarioId() {
        return usuarioId;
    }

    public Set<Revista> revista() {
        return revista;
    }

    public Set<Multimedia> multimedia() {
        return multimedia;
    }

    public Set<Libro> libros() {
        return libros;
    }
}
