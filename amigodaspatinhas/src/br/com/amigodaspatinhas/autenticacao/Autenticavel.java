package br.com.amigodaspatinhas.autenticacao;

// INTERFACE
public interface Autenticavel {
    void login(String email, String senha);
    void logout();
    void criarConta(String nome, String email, String senha);
}
