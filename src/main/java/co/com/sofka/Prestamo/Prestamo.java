package co.com.sofka.Prestamo;

import co.com.sofka.Generico.Entity;
import co.com.sofka.Persona.values.Funcion;
import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.Prestamo.values.PrestamoId;

public class Prestamo extends Entity<PrestamoId> {
    private PrestamoId prestamoId;
    private PersonaId personaId;
    private EstanteriaId estanteriaId;
    private Estado estado;
    private RegistroId registroId;

}
