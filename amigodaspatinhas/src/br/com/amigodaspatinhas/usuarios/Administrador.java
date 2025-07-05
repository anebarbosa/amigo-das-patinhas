package br.com.amigodaspatinhas.usuarios;

public class Administrador extends Usuario {
    private int nivelAcesso;

    public Administrador(String nome, String email, String senha, int nivelAcesso) {
        super(nome, email, senha);
        this.nivelAcesso = nivelAcesso;
    }

    public void gerenciarSistema() {
        System.out.println(getNome() + " está gerenciando o sistema.");
    }

    // Getter e Setter
    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}