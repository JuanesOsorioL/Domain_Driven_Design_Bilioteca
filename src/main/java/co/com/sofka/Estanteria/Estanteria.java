package co.com.sofka.Estanteria;

import co.com.sofka.Estanteria.value.*;
import co.com.sofka.Persona.PersonaChange;
import co.com.sofka.Persona.events.PersonaCreada;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Estanteria extends AggregateEvent<EstanteriaId> {

    protected EstanteriaId estanteriaId;
    protected Bastidor bastidor;
    protected Categoria categoria;
    protected Set<Revista> revistas;
    protected Set<Multimedia> multimedia;
    protected Set<Libro> libros;


    public Estanteria(EstanteriaId estanteriaId, Bastidor bastidor, Categoria categoria) {
        super(estanteriaId);
        subscribe(new EstanteriaChange(this));
        appendChange(new EstanteriaCreada(bastidor, categoria)).apply();
        /*this.bastidor = Objects.requireNonNull(bastidor,"El bastidor es requerido");;
        this.categoria = Objects.requireNonNull(categoria,"La categoria es requerido");
        this.revistas = new HashSet<>();;
        this.multimedia = new HashSet<>();;
        this.libros = new HashSet<>();;*/
    }

    public void agregarLibro(LibroId libroId, Autor autor, Categoria categoria, Nombre nombre){
        appendChange(new librocreado( libroId,  autor,  categoria,  nombre)).apply();
    }


}
