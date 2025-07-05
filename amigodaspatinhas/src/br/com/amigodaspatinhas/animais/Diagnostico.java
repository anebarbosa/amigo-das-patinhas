package br.com.amigodaspatinhas.animais;

import java.time.LocalDate;

public class Diagnostico {
    private LocalDate dataDiagnostico;
    private String observacao;

    public Diagnostico(LocalDate dataDiagnostico, String observacao) {
        this.dataDiagnostico = dataDiagnostico;
        this.observacao = observacao;
    }

    public void diagnosticar() {
        System.out.println("Diagnóstico realizado em " + getDataDiagnostico() + ": " + getObservacao());
    }

    // Getters e Setters
    public LocalDate getDataDiagnostico() {
        return dataDiagnostico;
    }

    public void setDataDiagnostico(LocalDate dataDiagnostico) {
        this.dataDiagnostico = dataDiagnostico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}