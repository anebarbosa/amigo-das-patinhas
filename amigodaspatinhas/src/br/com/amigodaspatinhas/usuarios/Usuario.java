package br.com.amigodaspatinhas.usuarios;

import br.com.amigodaspatinhas.autenticacao.Autenticavel;

public abstract class Usuario implements Autenticavel {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void login(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            System.out.println(getNome() + " logado com sucesso!");
        } else {
            System.out.println("Email ou senha incorretos.");
        }
    }

    @Override
    public void logout() {
        System.out.println(getNome() + " fez logout.");
    }

    @Override
    public void criarConta(String nome, String email, String senha) {
        System.out.println("Conta criada para: " + nome);
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}