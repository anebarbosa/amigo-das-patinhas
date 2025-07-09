package br.com.amigodaspatinhas.usuarios;

import java.util.concurrent.ThreadLocalRandom;

//HERANÇA E POLIMORFISMO
public class Administrador extends Usuario {
    private int nivelAcesso;

    public Administrador(String nome, String email, String senha, int nivelAcesso) {
        super(nome, email, senha);
        this.nivelAcesso = nivelAcesso;
    }

    public void gerenciarSistema() {
        System.out.println(getNome() + " está gerenciando o sistema.");
    }
    
    
    // POLIMORFISMO
    @Override
	public void criarConta(String nome, String email, String senha) {
    	System.out.println("Conta criada para: " + nome);
        // Gerando número aleatório de 100000 a 999999 como autenticador
        int autenticador = ThreadLocalRandom.current().nextInt(100000, 1000000);
        System.out.println("Número autenticador: " + autenticador);
	}

	// Getter e Setter
    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}