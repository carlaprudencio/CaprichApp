package application;

import model.entities.questionario.Questionario;
import model.entities.questionario.QuestionarioBuilder;
import model.entities.questionario.QuestionarioExecutor;
import model.entities.resultado.ResultadoExibidor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao CaprichApp!");
        String titulo = null;
        QuestionarioBuilder questionarioBuilder = new QuestionarioBuilder(titulo, scanner);
        Questionario questionario = questionarioBuilder.criarQuestionario();

        QuestionarioExecutor executor = new QuestionarioExecutor(scanner);
        executor.executarQuestionario(questionario);

        ResultadoExibidor resultadoExibidor = new ResultadoExibidor();
        resultadoExibidor.exibirResultados(questionario, executor.getPontuacaoTotal());

        scanner.close();
    }
}