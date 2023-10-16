package model.entities.perguntas;

import model.entities.perguntas.Opcao;

import java.util.List;

public class Pergunta {
    private String texto;
    private List<Opcao> opcoes;

    public Pergunta(String texto, List<Opcao> opcoes) {
        this.texto = texto;
        this.opcoes = opcoes;
    }

    public String getTexto() {
        return texto;
    }

    public List<Opcao> getOpcoes() {
        return opcoes;
    }
}
