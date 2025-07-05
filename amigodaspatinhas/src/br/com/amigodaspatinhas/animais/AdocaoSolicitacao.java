package br.com.amigodaspatinhas.animais;

import java.time.LocalDate;

public class AdocaoSolicitacao {
    private int statusSolicitacao; // 0 = Pendente, 1 = Aprovado, 2 = Rejeitado
    private LocalDate dataSolicitacao;

    public AdocaoSolicitacao(int statusSolicitacao, LocalDate dataSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
        this.dataSolicitacao = dataSolicitacao;
    }

    /**
     * Registra a solicitação de adoção.
     */
    public void solicitarAdocao() {
        System.out.println("Solicitação de adoção registrada em: " + getDataSolicitacao());
        System.out.println("Status: " + getStatusDescricao());
    }

    /**
     * Retorna a descrição do status da solicitação.
     */
    private String getStatusDescricao() {
        switch (statusSolicitacao) {
            case 0:
                return "Pendente";
            case 1:
                return "Aprovado";
            case 2:
                return "Rejeitado";
            default:
                return "Desconhecido";
        }
    }

    // Getters e Setters
    public int getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(int statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}