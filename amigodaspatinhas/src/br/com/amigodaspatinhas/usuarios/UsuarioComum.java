package br.com.amigodaspatinhas.usuarios;

import java.time.LocalDate;

import br.com.amigodaspatinhas.animais.AdocaoSolicitacao;
import br.com.amigodaspatinhas.animais.Animal;
import br.com.amigodaspatinhas.util.Endereco;

public class UsuarioComum extends Usuario {
    private String cpf;
    private String rg;
    private String telefone;
    private Endereco endereco;
    private LocalDate dataNascimento;

    public UsuarioComum(String nome, String email, String senha, String cpf, String rg, String telefone, Endereco endereco, LocalDate dataNascimento) {
        super(nome, email, senha);
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    /**
     * Método para solicitar adoção de um animal.
     */
    public void solicitarAdocao(Animal animal) {
        AdocaoSolicitacao solicitacao = new AdocaoSolicitacao(0, LocalDate.now());
        solicitacao.solicitarAdocao();
        System.out.println(getNome() + " solicitou a adoção do animal: " + animal.getNome());
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}