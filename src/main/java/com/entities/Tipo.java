package com.entities;

import java.util.List; //Interface
import java.util.ArrayList; //Funcional

public class Tipo {
    private int indice;
    private String nome;
    private List<Tipo> fraquezas;
    private List<Tipo> resistencias;

    public Tipo(int indice, String nome) {
        this.indice = indice;
        this.nome = nome;
    }

    public Tipo(int indice, String nome, Tipo fraqueza, Tipo resistencia) {
        this.indice = indice;
        this.nome = nome;
        this.fraquezas = new ArrayList<>();
        this.fraquezas.add(fraqueza);
        this.resistencias = new ArrayList<>();
        this.resistencias.add(resistencia);
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFraquezas() {
        String fraquezas = " ";
        for (Tipo tipo : this.fraquezas) {
            fraquezas += tipo.getNome() + " ";
        }
        return fraquezas;
    }

    public void setFraquezas(List<Tipo> fraquezas) {
        this.fraquezas = new ArrayList<>();
        for (Tipo tipo : fraquezas) {
            this.fraquezas.add(tipo);
        }
    }

    public void addFraquezas(List<Tipo> fraquezas) {
        for (Tipo tipo : fraquezas) {
            this.fraquezas.add(tipo);
        }
    }

    public void addFraqueza(Tipo tipo) {
        this.fraquezas.add(tipo);
    }

    public String getResistencias() {
        String resistencias = "";
        for (Tipo tipo : this.resistencias) {
            resistencias += tipo.getNome() + " ";
        }
        return resistencias;
    }

    public void setResistencias(List<Tipo> resistencias) {
        this.resistencias = new ArrayList<>();
        for (Tipo tipo : resistencias) {
            this.resistencias.add(tipo);
        }
    }

    public void addResistencias(List<Tipo> resistencias) {
        for (Tipo tipo : resistencias) {
            this.resistencias.add(tipo);
        }
    }

    public void addResistencia(Tipo tipo) {
        this.resistencias.add(tipo);
    }

}
