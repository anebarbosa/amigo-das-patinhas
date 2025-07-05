package br.com.amigodaspatinhas.animais;

public class FotoAnimal {
    private String urlFoto;
    private String descricao;

    public FotoAnimal(String urlFoto, String descricao) {
        this.urlFoto = urlFoto;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}