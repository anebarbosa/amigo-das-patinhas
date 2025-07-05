package br.com.amigodaspatinhas.animais;

import java.time.LocalDate;

public class Vacinacao {
    private LocalDate dataAplicacao;
    private Vacina vacina;

    public Vacinacao(LocalDate dataAplicacao, Vacina vacina) {
        this.dataAplicacao = dataAplicacao;
        this.vacina = vacina;
    }

    public void registrar() {
        System.out.println("Vacinação registrada em: " + getDataAplicacao());
        vacina.aplicar();
    }

    // Getters e Setters
    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }
}