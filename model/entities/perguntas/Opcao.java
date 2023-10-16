package model.entities.perguntas;

public class Opcao {
    private String texto;
    private int pontuacao;

    public Opcao(String texto, int pontuacao) {
        this.texto = texto;
        this.pontuacao = pontuacao;
    }

    public String getTexto() {
        return texto;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
