package com.redsocial.services;

import com.redsocial.models.Comment;
import com.redsocial.models.Reaction;
import java.util.ArrayList;
import java.util.List;

public class InteractionService {
    private List<Comment> listaComentarios = new ArrayList<>();
    private List<Reaction> listaReacciones = new ArrayList<>();

    // Método para añadir un comentario
    public void añadirComentario(Comment comentario) {
        listaComentarios.add(comentario);
        System.out.println("Comentario añadido al post ID: " + comentario.getPostId());
    }

    // Método para añadir una reacción (Like, etc.)
    public void añadirReaccion(Reaction reaccion) {
        listaReacciones.add(reaccion);
        System.out.println("Reacción registrada correctamente.");
    }

    public void mostrarInteracciones() {
        System.out.println("\n--- ESTADÍSTICAS DE INTERACCIÓN ---");
        System.out.println("Total comentarios: " + listaComentarios.size());
        System.out.println("Total reacciones: " + listaReacciones.size());
    }
}