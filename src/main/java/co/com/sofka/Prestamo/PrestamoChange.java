package co.com.sofka.Prestamo;

import co.com.sofka.Prestamo.events.PrestamoCreado;
import co.com.sofka.domain.generic.EventChange;

public class PrestamoChange extends EventChange {
    public PrestamoChange(Prestamo prestamo) {

        apply((PrestamoCreado event) -> {
            prestamo.estado=event.getEstado();
            prestamo.estanteriaId=event.getEstanteriaId();
            prestamo.personaId=event.getPersonaId();
            prestamo.estado=event.getEstado();
            prestamo.registroId=event.getRegistroId();
        });



    }
}
