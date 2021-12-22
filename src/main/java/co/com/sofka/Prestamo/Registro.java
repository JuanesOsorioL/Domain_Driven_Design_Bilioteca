package co.com.sofka.Prestamo;

import co.com.sofka.Estanteria.*;
import co.com.sofka.Persona.values.*;
import co.com.sofka.Generico.Entity;
import co.com.sofka.Prestamo.values.RegistroId;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Registro extends Entity<RegistroId> {

    private RegistroId registroId;
    private UsuarioId usuarioId;
    private final Set<Revista> revistas;
    private final Set<Multimedia> multimedia;
    private final Set<Libro> libros;

    public Registro(RegistroId registroId, UsuarioId usuarioId){
        super(registroId);
        this.usuarioId = Objects.requireNonNull(usuarioId,"El Id de Usuario es requerido");
        this.revistas = new HashSet<>();
        this.multimedia = new HashSet<>();
        this.libros = new HashSet<>();
    }

/*    public void agregarRevista(EmpleadoId empleadoId, Funcion funcion){
        var id = new EmpleadoId();
        Empleado.add(new Empleado(id, funcion));
        // this.applyChange(new ItemAgregado(id, productoId, nombre, cantidad, precio));
    }*/
}
