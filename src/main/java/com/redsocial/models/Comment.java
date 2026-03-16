package com.redsocial.models;

public class Comment {
    private int id;
    private String texto;
    private int postId;
    private int autorId;

    public Comment(int id, String texto, int postId, int autorId) {
        this.id = id;
        this.texto = texto;
        this.postId = postId;
        this.autorId = autorId;
    }
}