package com.entities;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {
    private int numero;
    private String nome;
    private List<Tipo> tipos;

    private Pokemon evoluiPara;// Objeto Pokemon
    private int evoluiEm; // nivel em que o pokemons passa para a proxima evo.
    private boolean lendario; // Para especies raras

    public Pokemon() {

    }

    public Pokemon(int numero, String nome, List<Tipo> tipos, Pokemon evoluiPara, int evoluiEm, boolean lendario) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList<>();
        for (Tipo t : tipos) {
            this.tipos.add(t);
        }
        this.evoluiPara = null;
        this.evoluiEm = evoluiEm;
        this.lendario = lendario;
    }

    public Pokemon(int numero, String nome, List<Tipo> tipos, boolean lendario) {
        this.numero = numero;
        this.nome = nome;
        this.tipos = new ArrayList<>();
        for (Tipo t : tipos) {
            this.tipos.add(t);
        }
        this.lendario = lendario;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(List<Tipo> tipos) {
        for (Tipo tipo : tipos) {
            this.tipos.add(tipo);
        }
    }

    public List<Tipo> getTipo() {
        return this.tipos;
    }

    public String getTiposInString() {
        String tiposText = "";
        for (Tipo tipo : tipos) {
            tiposText += tipo.getNome() + " | ";
        }
        return tiposText;
    }

    public String getTipoFraquezas() {
        String fraquezas = "";
        for (Tipo tipo : tipos) {
            fraquezas += tipo.getFraquezas() + " ";
        }
        return fraquezas;

    }

    public String getTipoResistencias() {
        String resistencias = "";
        for (Tipo tipo : tipos) {
            resistencias += tipo.getResistencias() + " ";
        }
        return resistencias;

    }

    public void setEvoluiPara(Pokemon pokemon) {
        this.evoluiPara = new Pokemon();
        this.evoluiPara = pokemon;
    }

    public void setEvoluiEm(int nivel) {
        this.evoluiEm = nivel;
    }

    public void setLendario(boolean lendario) {
        this.lendario = lendario;
    }

    public Pokemon getEvoluiPara() {
        return this.evoluiPara;
    }

    public int getEvoluiEm() {
        return this.evoluiEm;
    }

    public boolean isLendario() {
        return this.lendario;
    }

}
