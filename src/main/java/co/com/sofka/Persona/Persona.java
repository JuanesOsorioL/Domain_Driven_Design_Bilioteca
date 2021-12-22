package co.com.sofka.Persona;

import co.com.sofka.Persona.events.*;
import co.com.sofka.Persona.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import java.util.Optional;
import java.util.Set;

public class Persona extends AggregateEvent<PersonaId> {


    protected PersonaId personaId;
    protected Nombre nombre;
    protected Edad edad;
    protected Genero genero;
    protected Correo correo;
    protected Set<Empleado> Empleado;
    protected Set<Usuario> Usuario;

    public Persona(PersonaId personaId, Nombre nombre, Edad edad,Genero genero,Correo correo){
        super(personaId);
        subscribe(new PersonaChange(this));
        appendChange(new PersonaCreada(nombre, edad, genero, correo)).apply();
    }

    public void agregarEmpleado(EmpleadoId empleadoId, Funcion funcion){
        appendChange(new EmpleadoAgregado(empleadoId,funcion)).apply();
    }

    public void agregarUsuario(UsuarioId usuarioId, Nikname nikname, Password password){
        appendChange(new UsuarioAgregado(usuarioId, nikname, password));
    }

    public void quitarEmpleado(EmpleadoId empleadoId){
        appendChange(new EmpleadoQuitado(empleadoId));
    }

    public void quitarUsuario(UsuarioId usuarioId){
        appendChange(new UsuarioQuitado(usuarioId));
    }

    public void modificarFuncionEmpleado(EmpleadoId empleadoId, Funcion funcion){
        appendChange(new EmpleadoFuncionModificado(empleadoId, funcion));
    }

    public void ModificarNiknameUsuario(UsuarioId usuarioId, Nikname nikname){
        appendChange(new NiknameUsuarioModificado(usuarioId, nikname));
    }

    public void ModificarPasswordUsuario(UsuarioId usuarioId, Password password){
        appendChange(new PasswordUsuarioModificado(usuarioId, password));
    }

    public void modificarCorreo(PersonaId personaId,Correo correo){
        appendChange(new CorreoModificado(personaId, correo));
    }

    public Optional<Empleado> buscarEmpleadoPorId(EmpleadoId empleadoId){
        return Empleado.stream()
                .filter(Empleado->Empleado.empleadoId().equals(empleadoId)).findFirst();
    }

    public Optional<Usuario> buscarUsuarioPorId(UsuarioId usuarioId){
        return Usuario.stream()
                .filter(Usuario->Usuario.usuarioId().equals(usuarioId)).findFirst();
    }

    public PersonaId personaId() {
        return personaId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Edad edad() {
        return edad;
    }

    public Genero genero() {
        return genero;
    }

    public Correo correo() {
        return correo;
    }

    public Set<Empleado> empleado() {
        return Empleado;
    }

    public Set<Usuario> usuario() {
        return Usuario;
    }

}
