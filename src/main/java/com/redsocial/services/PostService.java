package com.redsocial.services;

import com.redsocial.models.Post;
import java.util.ArrayList;
import java.util.List;

public class PostService {
    // Aquí guardaremos todos los posts que se creen
    private List<Post> listaPosts = new ArrayList<>();

    public void guardarPost(Post post) {
        listaPosts.add(post);
        System.out.println("Post guardado en el sistema.");
    }

    public void mostrarTodosLosPosts() {
        System.out.println("--- MURO DE LA RED SOCIAL ---");
        for (Post p : listaPosts) {
            System.out.println("Usuario " + p.getAutorId() + " dice: " + p.getContenido());
        }
    }
}