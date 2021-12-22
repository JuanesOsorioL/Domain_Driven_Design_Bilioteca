package co.com.sofka.Estanteria;

import co.com.sofka.Estanteria.event.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class EstanteriaChange extends EventChange {
    public EstanteriaChange(Estanteria estanteria) {
        apply((EstanteriaCreada event) -> {
            estanteria.bastidor=event.getBastidor();
            estanteria.categoria=event.getCategoria();
            estanteria.libro =new HashSet<>();
            estanteria.multimedia=new HashSet<>();
            estanteria.revista =new HashSet<>();
        });

        apply((LibroAgregado event) -> {
            estanteria.libro.add(new Libro(
                    event.getLibroId(),
                    event.getAutor(),
                    event.getCategoria(),
                    event.getNombre()));
        });

        apply((Revistagregado event) -> {
            estanteria.revista.add(new Revista(
                    event.getRevistaId(),
                    event.getAutor(),
                    event.getCategoria(),
                    event.getNombre()));
        });

        apply((MultimediaAgregada event) -> {
            estanteria.multimedia.add(new Multimedia(
                    event.getMultimediaId(),
                    event.getAutor(),
                    event.getCategoria(),
                    event.getNombre()));
        });

        apply((NombreMultimediaModificado event) -> {
            var multimedia = estanteria.buscarMultimediaPorId(event.getMultimediaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la multimedia"));
            multimedia.actualizarNombre(event.getNombre());
        });

        apply((NombreRevistaModificado event) -> {
            var revista = estanteria.buscarRevistaPorId(event.getRevistaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la revista"));
            revista.actualizarNombre(event.getNombre());
        });

        apply((NombreLibroModificado event) -> {
            var libro = estanteria.buscarLibroPorId(event.getLibroId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la libro"));
            libro.actualizarNombre(event.getNombre());
        });

        apply((CategoriaMultimediaModificado event) -> {
            var multimedia = estanteria.buscarMultimediaPorId(event.getMultimediaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la multimedia"));
            multimedia.actualizarCategoria(event.getCategoria());
        });

        apply((CategoriaRevistaModificado event) -> {
            var revista = estanteria.buscarRevistaPorId(event.getRevistaId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la revista"));
            revista.actualizarCategoria(event.getCategoria());
        });

        apply((CategoriaLibroModificado event) -> {
            var libro = estanteria.buscarLibroPorId(event.getLibroId())
                    .orElseThrow(()->new IllegalArgumentException("No se encuentra la libro"));
            libro.actualizarCategoria(event.getCategoria());
        });

        apply((CategoriaModificada event) -> {
            estanteria.categoria=event.getCategoria();
        });

        apply((CategoriaBastidor event) -> {
            estanteria.bastidor=event.getBastidor();
        });
    }
}
