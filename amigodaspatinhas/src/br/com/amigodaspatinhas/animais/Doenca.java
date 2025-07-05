package br.com.amigodaspatinhas.animais;

public class Doenca {
	private String nome;
    private String descricao;

    public Doenca(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void exibir() {
        System.out.println("Doença: " + nome + " - " + descricao);
    }
}
