package com.redsocial;

import com.redsocial.models.Post;
import com.redsocial.services.PostService;

public class MainInteraccion {
    public static void main(String[] args) {
        // Inicializamos el servicio
        PostService postService = new PostService();

        // Creamos un par de posts de prueba
        Post p1 = new Post(1, "¡Mi primer post!", 101);
        Post p2 = new Post(2, "Estudiando DAW en el Vivobook", 102);

        // Los guardamos usando el servicio
        postService.guardarPost(p1);
        postService.guardarPost(p2);

        // Mostramos el muro
        postService.mostrarTodosLosPosts();
    }
}