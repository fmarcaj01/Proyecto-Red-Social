package com.redsocial.models;
import java.util.Date;

public class Post {
    private int id;
    private String contenido;
    private Date fechaPublicacion;
    private int autorId;

    public Post(int id, String contenido, int autorId) {
        this.id = id;
        this.contenido = contenido;
        this.autorId = autorId;
        this.fechaPublicacion = new Date();
    }
}