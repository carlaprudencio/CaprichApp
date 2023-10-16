package model.entities.questionario;

import model.entities.perguntas.Opcao;
import model.entities.perguntas.Pergunta;
import model.entities.resultado.Resultado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionarioBuilder {
    private Scanner scanner;

    public QuestionarioBuilder(String titulo, Scanner scanner) {
        this.scanner = scanner;
    }

    public Questionario criarQuestionario() {
        System.out.println("Digite o título do questionário: ");
        String title = scanner.nextLine();

        System.out.print("Quantas perguntas terá o questionário? ");
        int numPerguntas = scanner.nextInt();
        scanner.nextLine();

        List<Pergunta> perguntas = new ArrayList<>();
        for (int i = 1; i <= numPerguntas; i++) {
            System.out.println("Digite o texto da pergunta " + i + ": ");
            String textoPergunta = scanner.nextLine();

            List<Opcao> opcoes = new ArrayList<>();
            int numOpcoes;

            do {
                System.out.println("Quantas opções de resposta terá a pergunta " + i + "?");
                numOpcoes = scanner.nextInt();
                scanner.nextLine();

                if (numOpcoes <= 0) {
                    System.out.println("Número inválido. Digite um número maior que zero.");
                }
            } while (numOpcoes <= 0);

            for (int j = 1; j <= numOpcoes; j++) {
                System.out.println("Digite o texto da opção " + j + ": ");
                String textoOpcao = scanner.nextLine();

                System.out.print("Digite a pontuação da opção " + j + ": ");
                int pontuacao = scanner.nextInt();
                scanner.nextLine();

                opcoes.add(new Opcao(textoOpcao, pontuacao));
            }

            perguntas.add(new Pergunta(textoPergunta, opcoes));
        }

        List<Resultado> resultados = new ArrayList<>();
        System.out.println("Agora, defina os resultados:");

        do {
            System.out.print("Digite o texto do resultado (ou 'fim' para encerrar): ");
            String textoResultado = scanner.nextLine();

            if (textoResultado.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite o valor mínimo de pontuação para este resultado: ");
            int valorMinimo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o valor máximo de pontuação para este resultado: ");
            int valorMaximo = scanner.nextInt();
            scanner.nextLine();

            resultados.add(new Resultado(textoResultado, valorMinimo, valorMaximo));
        } while (true);

        return new Questionario(title, perguntas, resultados);
    }
}
