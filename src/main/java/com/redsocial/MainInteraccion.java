package com.redsocial;

import com.redsocial.models.Post;
import com.redsocial.services.PostService;

public class MainInteraccion {
    public static void main(String[] args) {
        PostService postService = new PostService();

        // 1. Crear posts
        System.out.println("--- PASO 1: CREAR ---");
        postService.guardarPost(new Post(1, "Post original", 101));
        postService.guardarPost(new Post(2, "Este post se va a borrar", 102));
        postService.mostrarTodosLosPosts();

        // 2. Editar un post existente
        System.out.println("\n--- PASO 2: EDITAR ---");
        postService.editarPost(1, "Post editado y mejorado por el Programador B");

        // 3. Borrar un post
        System.out.println("\n--- PASO 3: BORRAR ---");
        postService.eliminarPost(2);

        // 4. Ver resultado final en el muro
        System.out.println("\n--- RESULTADO FINAL ---");
        postService.mostrarTodosLosPosts();
    }
}