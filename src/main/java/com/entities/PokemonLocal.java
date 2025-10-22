package com.entities;

public class PokemonLocal {
    private String nome;
    private Pokemon especia;
    private int nivel;
    private float peso;
    private int altura;
    private int vida;

    public PokemonLocal(Pokemon especie, float peso, int altura, int vida) {
        this.especia = especie;
        this.peso = peso;
        this.altura = altura;
        this.vida = vida;

        this.nome = especie.getNome();
        this.nivel = 1;
    }

    public PokemonLocal(String nome, Pokemon especie, float peso, int altura, int vida) {
        this.nome = nome;
        this.especia = especie;
        this.peso = peso;
        this.altura = altura;
        this.vida = vida;
        this.nivel = 1;
    }
}
