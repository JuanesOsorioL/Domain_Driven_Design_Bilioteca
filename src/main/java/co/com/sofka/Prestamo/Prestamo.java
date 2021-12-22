package co.com.sofka.Prestamo;


import co.com.sofka.Estanteria.value.EstanteriaId;
import co.com.sofka.Persona.values.PersonaId;
import co.com.sofka.Prestamo.events.PrestamoCreado;
import co.com.sofka.Prestamo.events.EstadoCambiado;
import co.com.sofka.Prestamo.events.EstanteriaAsociada;
import co.com.sofka.Prestamo.values.Estado;
import co.com.sofka.Prestamo.values.PrestamoId;
import co.com.sofka.Prestamo.values.RegistroId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;


public class Prestamo extends AggregateEvent<PrestamoId> {

    protected PrestamoId prestamoId;
    protected PersonaId personaId;
    protected EstanteriaId estanteriaId;
    protected Estado estado;
    protected RegistroId registroId;

    public Prestamo(PrestamoId prestamoId, PersonaId personaId, EstanteriaId estanteriaId, Estado estado, RegistroId registroId) {
        super(prestamoId);
        appendChange(new PrestamoCreado(personaId, estanteriaId, estado, registroId)).apply();
    }

    public Prestamo(PrestamoId prestamoId) {
        super(prestamoId);
        subscribe(new PrestamoChange(this));
    }

    public static Prestamo from(PrestamoId prestamoId, List<DomainEvent> events){
        var prestamo = new Prestamo(prestamoId);
        events.forEach(prestamo::applyEvent);
        return prestamo;
    }

    public void cambiarEstado(Estado estado){
        appendChange(new EstadoCambiado(estado)).apply();
    }

    public void asociarEstanteria(EstanteriaId estanteriaId){
        appendChange(new EstanteriaAsociada(estanteriaId)).apply();
    }


    public PrestamoId prestamoId() {
        return prestamoId;
    }

    public PersonaId personaId() {
        return personaId;
    }

    public EstanteriaId estanteriaId() {
        return estanteriaId;
    }

    public Estado estado() {
        return estado;
    }

    public RegistroId registroId() {
        return registroId;
    }
}
