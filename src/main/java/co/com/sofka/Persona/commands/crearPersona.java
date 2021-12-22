package co.com.sofka.Persona.commands;

import co.com.sofka.Persona.values.Correo;
import co.com.sofka.Persona.values.Edad;
import co.com.sofka.Persona.values.Genero;
import co.com.sofka.Persona.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class crearPersona extends Command {
    private Nombre nombre;
    private Edad edad;
    private Genero genero;
    private Correo correo;

    public crearPersona(Nombre nombre, Edad edad, Genero genero, Correo correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.correo = correo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public Correo getCorreo() {
        return correo;
    }
}
