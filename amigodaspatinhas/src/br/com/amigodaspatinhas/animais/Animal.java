package br.com.amigodaspatinhas.animais;

import java.time.LocalDate;

public class Animal {
    private String nome;
    private String especie;
    private String porte;
    private char sexo; // M = macho, F = fêmea
    private LocalDate dataNascimento;
    private int idade;
    private boolean castrado;
    private int statusAdocao;
    private FotoAnimal fotoAnimal;

    public Animal(String nome, String especie, String porte, char sexo,
                  LocalDate dataNascimento, boolean castrado, int statusAdocao, FotoAnimal fotoAnimal) {
        this.nome = nome;
        this.especie = especie;
        this.porte = porte;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade(dataNascimento);
        this.castrado = castrado;
        this.statusAdocao = statusAdocao;
        this.fotoAnimal = fotoAnimal;
    }

    private int calcularIdade(LocalDate dataNascimento) {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }
    public void exibirInformacoes() {
        System.out.println("Animal: " + getNome());
        System.out.println("Espécie: " + getEspecie());
        System.out.println("Porte: " + getPorte());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Castrado: " + (isCastrado() ? "Sim" : "Não"));
        System.out.println("Status Adoção: " + getStatusAdocaoDescricao());
        if (fotoAnimal != null) {
            System.out.println("Foto: " + fotoAnimal.getUrlFoto());
        }
    }

    private String getStatusAdocaoDescricao() {
        switch (statusAdocao) {
            case 0: return "Disponível";
            case 1: return "Adotado";
            case 2: return "Em processo de adoção";
            default: return "Desconhecido";
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade(dataNascimento);
    }

    public int getIdade() {
        return idade;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public int getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(int statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    public FotoAnimal getFotoAnimal() {
        return fotoAnimal;
    }

    public void setFotoAnimal(FotoAnimal fotoAnimal) {
        this.fotoAnimal = fotoAnimal;
    }
}