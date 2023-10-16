package model.entities.questionario;

import model.entities.perguntas.Opcao;
import model.entities.perguntas.Pergunta;

import java.util.List;
import java.util.Scanner;

public class QuestionarioExecutor {
    private Scanner scanner;
    private int pontuacaoTotal;

    public QuestionarioExecutor(Scanner scanner) {
        this.scanner = scanner;
        this.pontuacaoTotal = 0;
    }

    public void executarQuestionario(Questionario questionario) {
        System.out.println("Questionário: " + questionario.getTitulo());
        System.out.println();

        List<Pergunta> perguntas = questionario.getPerguntas();

        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getTexto());
            List<Opcao> opcoes = pergunta.getOpcoes();

            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println((i + 1) + ". " + opcoes.get(i).getTexto());
            }

            int resposta;
            do {
                System.out.print("Escolha a opção (1-" + opcoes.size() + "): ");
                resposta = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                if (resposta < 1 || resposta > opcoes.size()) {
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                }
            } while (resposta < 1 || resposta > opcoes.size());

            int pontuacaoOpcao = opcoes.get(resposta - 1).getPontuacao();
            pontuacaoTotal += pontuacaoOpcao;
            System.out.println("Pontuação da resposta: " + pontuacaoOpcao);
            System.out.println();
        }
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }
}
