package co.com.sofka.Persona;

import co.com.sofka.Persona.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class PersonaChange extends EventChange {
    public PersonaChange(Persona persona) {
        apply((PersonaCreada event) -> {
            persona.nombre=event.getNombre();
            persona.edad=event.getEdad();
            persona.genero=event.getGenero();
            persona.correo=event.getCorreo();
            persona.Empleado=new HashSet<>();
            persona.Usuario=new HashSet<>();
        });

        apply((EmpleadoAgregado event) -> {
            persona.Empleado.add(new Empleado(
                    event.getEmpleadoId(),
                    event.getFuncion()));
        });

        apply((UsuarioAgregado event) -> {
            persona.Usuario.add(new Usuario(
                    event.getUsuarioId(),
                    event.getNikname(),
                    event.getPassword()));
        });

        apply((EmpleadoQuitado event) -> {
            persona.Empleado.removeIf(Empleado -> Empleado.identity().equals(event.getEmpleadoId()));
        });

        apply((UsuarioQuitado event) -> {
            persona.Usuario.removeIf(Usuario -> Usuario.identity().equals(event.getUsuarioId()));
        });

        apply((EmpleadoFuncionModificado event) -> {
         var empleado = persona.buscarEmpleadoPorId(event.getEmpleadoId())
                 .orElseThrow(()->new IllegalArgumentException("No se encuentra el empleado"));
            empleado.modificarFuncion(event.getFuncion());
        });

        apply((NiknameUsuarioModificado event) -> {
            var usuario = persona.buscarUsuarioPorId(event.getUsuarioId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el usuario"));
            usuario.cambiarNikname(event.getNikname());
        });

        apply((PasswordUsuarioModificado event) -> {
            var usuario = persona.buscarUsuarioPorId(event.getUsuarioId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra el usuario"));
            usuario.cambiarPassword(event.getPassword());
        });

        apply((CorreoModificado event) -> {
            persona.correo=event.getCorreo();
        });
    }
}
