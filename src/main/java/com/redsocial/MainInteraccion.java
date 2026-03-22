package com.redsocial;

import com.redsocial.models.Post;
import com.redsocial.models.Comment;
import com.redsocial.models.Reaction;
import com.redsocial.services.PostService;
import com.redsocial.services.InteractionService;

public class MainInteraccion {
    public static void main(String[] args) {
        PostService postService = new PostService();
        InteractionService interactionService = new InteractionService();

        // Operaciones de Post (Programador B)
        Post p1 = new Post(1, "Contenido del post", 101);
        postService.guardarPost(p1);

        // Operaciones de Interacción (Programador B)
        Comment c1 = new Comment(1, "¡Increíble!", 1, 102);
        interactionService.añadirComentario(c1);

        Reaction r1 = new Reaction(Reaction.Tipo.LIKE, 1, 103);
        interactionService.añadirReaccion(r1);

        // Mostrar resultados
        postService.mostrarTodosLosPosts();
        interactionService.mostrarInteracciones();
    }
}