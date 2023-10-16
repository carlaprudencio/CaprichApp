package application;


import model.entities.QuestionsHandler;
import model.entities.Result;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        QuestionsHandler questionsHandler = new QuestionsHandler();
        questionsHandler.loadQuestionsFromData("questions.txt");
        questionsHandler.selectRandomQuestions(5);
        ArrayList<String> perguntas = (ArrayList<String>) questionsHandler.getSelectedQuestions();

        int pontuacao = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao CaprichApp!");
        System.out.println("Teste: Você está afim do seu melhor amigo?");
        System.out.println("Por favor, responda S para Sim ou N para Não nas perguntas abaixo.");


        for (String question : perguntas) {
            System.out.println(question);
            char resposta;
            do {
                resposta = sc.next().charAt(0);
                resposta = Character.toUpperCase(resposta);
                if (resposta != 'S' && resposta != 'N') {
                    System.out.println("Resposta inválida. Digite S para Sim ou N para Não.");
                }
            } while (resposta != 'S' && resposta != 'N');
            if (resposta == 'S') {
                pontuacao += 1;
            }
        }

        System.out.println("Resultado:");
        Result.showResult(pontuacao);
    }
}