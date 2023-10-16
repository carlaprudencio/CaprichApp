package model.entities.questionario;

import model.entities.perguntas.Pergunta;
import model.entities.resultado.Resultado;

import java.util.List;

public class Questionario {
    private String titulo;
    private List<Pergunta> perguntas;
    private List<Resultado> resultados;

    public Questionario(String titulo, List<Pergunta> perguntas, List<Resultado> resultados) {
        this.titulo = titulo;
        this.perguntas = perguntas;
        this.resultados = resultados;
    }

    public void adicionarPergunta(Pergunta pergunta) {
        perguntas.add(pergunta);
    }

    public void adicionarResultado(Resultado resultado) {
        resultados.add(resultado);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(List<Pergunta> perguntas) {
        this.perguntas = perguntas;
    }

    public List<Resultado> getResultados() {
        return resultados;
    }

    public void setResultados(List<Resultado> resultados) {
        this.resultados = resultados;
    }
}
