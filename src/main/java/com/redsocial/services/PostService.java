package com.redsocial.services;

import com.redsocial.models.Post;
import java.util.ArrayList;
import java.util.List;

public class PostService {
    private List<Post> listaPosts = new ArrayList<>();

    public void guardarPost(Post post) {
        listaPosts.add(post);
        System.out.println("Post guardado con éxito.");
    }

    // Lógica para borrar un post por su ID
    public void eliminarPost(int id) {
        listaPosts.removeIf(p -> p.getId() == id);
        System.out.println("Post con ID " + id + " eliminado.");
    }

    // Lógica para editar el contenido de un post
    public void editarPost(int id, String nuevoContenido) {
        for (Post p : listaPosts) {
            if (p.getId() == id) {
                p.setContenido(nuevoContenido);
                System.out.println("Post con ID " + id + " actualizado.");
            }
        }
    }

    public void mostrarTodosLosPosts() {
        System.out.println("\n--- MURO DE LA RED SOCIAL ---");
        if (listaPosts.isEmpty()) {
            System.out.println("No hay publicaciones que mostrar.");
        } else {
            for (Post p : listaPosts) {
                System.out.println("[" + p.getId() + "] Usuario " + p.getAutorId() + ": " + p.getContenido());
            }
        }
    }
}