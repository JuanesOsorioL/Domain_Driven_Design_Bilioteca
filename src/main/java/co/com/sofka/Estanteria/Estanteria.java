package co.com.sofka.Estanteria;

import co.com.sofka.Estanteria.event.*;
import co.com.sofka.Estanteria.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public class Estanteria extends AggregateEvent<EstanteriaId> {

    protected EstanteriaId estanteriaId;
    protected Bastidor bastidor;
    protected Categoria categoria;
    protected Set<Revista> revista;
    protected Set<Multimedia> multimedia;
    protected Set<Libro> libro;


    public Estanteria(EstanteriaId estanteriaId, Bastidor bastidor, Categoria categoria) {
        super(estanteriaId);
        appendChange(new EstanteriaCreada(bastidor, categoria)).apply();
    }

    public Estanteria(EstanteriaId estanteriaId) {
        super(estanteriaId);
        subscribe(new EstanteriaChange(this));
    }

    public static Estanteria from(EstanteriaId estanteriaId, List<DomainEvent> events){
        var estanteria = new Estanteria(estanteriaId);
        events.forEach(estanteria::applyEvent);
        return estanteria;
    }

    public void agregarLibro(LibroId libroId, Autor autor, Categoria categoria, Nombre nombre){
        appendChange(new LibroAgregado( libroId,  autor,  categoria,  nombre)).apply();
    }

    public void agregarRevista(RevistaId revistaId, Autor autor, Categoria categoria, Nombre nombre){
        appendChange(new Revistagregado(revistaId,  autor,  categoria,  nombre)).apply();
    }

    public void agregarMultimedia(MultimediaId multimediaId, Autor autor, Categoria categoria, Nombre nombre){
        appendChange(new MultimediaAgregada(multimediaId,  autor,  categoria,  nombre)).apply();
    }

    public void modificarNombreMultimedia(MultimediaId multimediaId, Nombre nombre){
        appendChange(new NombreMultimediaModificado(multimediaId,nombre)).apply();
    }

    public void modificarNombreRevista(RevistaId revistaId, Nombre nombre){
        appendChange(new NombreRevistaModificado(revistaId,nombre)).apply();
    }

    public void modificarNombreLibro(LibroId libroId, Nombre nombre){
        appendChange(new NombreLibroModificado(libroId,nombre)).apply();
    }

    public void modificarCategoriaMultimedia(MultimediaId multimediaId,Categoria categoria){
        appendChange(new CategoriaMultimediaModificado(multimediaId,categoria)).apply();
    }

    public void modificarCategoriaRevista(RevistaId revistaId, Categoria categoria){
        appendChange(new CategoriaRevistaModificado(revistaId,categoria)).apply();
    }

    public void modificarCategoriaLibro(LibroId libroId, Categoria categoria){
        appendChange(new CategoriaLibroModificado(libroId,categoria)).apply();
    }

    public void modificarCategoria(EstanteriaId estanteriaId,Categoria categoria){
        appendChange(new CategoriaModificada(estanteriaId, categoria));
    }

    public void modificarBastidor(EstanteriaId estanteriaId,Bastidor bastidor){
        appendChange(new CategoriaBastidor(estanteriaId, bastidor));
    }

    public Optional<Multimedia> buscarMultimediaPorId(MultimediaId multimediaId){
        return multimedia.stream()
                .filter(multi->multi.multimediaId().equals(multimediaId)).findFirst();
    }

    public Optional<Libro> buscarLibroPorId(LibroId libroId){
        return libro.stream()
                .filter(libro->libro.libroId().equals(libroId)).findFirst();
    }

    public Optional<Revista> buscarRevistaPorId(RevistaId revistaId){
        return revista.stream()
                .filter(revista->revista.revistaId().equals(revistaId)).findFirst();
    }

}
