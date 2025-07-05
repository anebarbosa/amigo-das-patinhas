package br.com.amigodaspatinhas.animais;

import java.time.LocalDate;

public class Vacina {
    private String nome;
    private String fabricante;
    private LocalDate validade;

    public Vacina(String nome, String fabricante, LocalDate validade) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.validade = validade;
    }

    public void aplicar() {
        System.out.println("Vacina " + getNome() + " aplicada. Validade até: " + getValidade());
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }
}