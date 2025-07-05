package br.com.amigodaspatinhas.usuarios;

import br.com.amigodaspatinhas.util.Endereco;

public class Voluntario {
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private Endereco endereco;
    private int status;
    private int disponibilidade;

    public Voluntario(String nome, String email, String cpf, String telefone, Endereco endereco, int status, int disponibilidade) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.status = status;
        this.disponibilidade = disponibilidade;
    }

    public void cuidarAnimal() {
        System.out.println(getNome() + " está cuidando de um animal.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}