package com.redsocial.models;

public class Reaction {
    public enum Tipo { LIKE, LOVE, DISLIKE }
    private Tipo tipo;
    private int targetId; 
    private int usuarioId;

    public Reaction(Tipo tipo, int targetId, int usuarioId) {
        this.tipo = tipo;
        this.targetId = targetId;
        this.usuarioId = usuarioId;
    }
}