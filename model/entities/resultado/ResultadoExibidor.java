package model.entities.resultado;

import model.entities.questionario.Questionario;
import model.entities.resultado.Resultado;

public class ResultadoExibidor {

    public void exibirResultados(Questionario questionario, int pontuacaoTotal) {
        System.out.println("Questionário: " + questionario.getTitulo());
        System.out.println("Pontuação Total: " + pontuacaoTotal);
        System.out.println("Resultados:");

        for (Resultado resultado : questionario.getResultados()) {
            if (pontuacaoTotal >= resultado.getValorMinimo() && pontuacaoTotal <= resultado.getValorMaximo()) {
                System.out.println(resultado.getTexto());
            }
        }
    }
}
