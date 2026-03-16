package com.redsocial;

import com.redsocial.models.Post;
import com.redsocial.models.Comment;
import com.redsocial.models.Reaction;

public class MainInteraccion {
    public static void main(String[] args) {

        Post miPost = new Post(1, "¡Hola mundo! Mi primer post en la red social.", 10);
        
        Comment miComentario = new Comment(1, "¡Qué buen post!", 1, 20);
        
        Reaction miLike = new Reaction(Reaction.Tipo.LIKE, 1, 30);

        System.out.println("--- PRUEBA PROGRAMADOR B ---");
        System.out.println("Post creado: " + miPost.getContenido());
        System.out.println("Comentario creado: " + miComentario.getTexto());
        System.out.println("Reacción registrada correctamente.");
    }
}