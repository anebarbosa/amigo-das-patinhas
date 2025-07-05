package br.com.amigodaspatinhas.autenticacao;

public interface Autenticavel {
    void login(String email, String senha);
    void logout();
    void criarConta(String nome, String email, String senha);
}
