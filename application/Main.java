package application;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pontuacao = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao CaprichApp!");
        System.out.println("Teste: Você está afim do seu melhor amigo?");
        System.out.println("Por favor, responda S para Sim ou N para Não nas perguntas abaixo.");

        String[] perguntas = {
                "Você já sonhou que seu melhor amigo era um unicórnio voando sobre arco-íris cor-de-rosa enquanto segurava um buquê de salsichas?",
                "Você já se viu dançando a dança do frango em homenagem ao aniversário do seu melhor amigo, vestida de pinguim?",
                "Se seu melhor amigo fosse um sorvete, ele seria o sorvete de pistache?",
                "Você pensa em patos de borracha quando olha para o seu melhor amigo?",
                "Você já escreveu um poema de amor épico para o seu melhor amigo usando apenas emojis de vegetais?",
                "Você acha que seu melhor amigo seria um bom companheiro numa luta contra zumbis alienígenas usando almofadas como armas?"
        };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
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
        if (pontuacao <= 2) {
            System.out.println("Você colocou seu melhor amigo na friendzone. O que é ótimo porque talvez ele seja apenas seu amigo.");
        } else if (pontuacao <= 4) {
            System.out.println("Talvez haja amor, talvez seja hormônios. Vale a pena experimentar uns cinco minutos de trocação de beijo sem estragar a amizade.");
        } else {
            System.out.println("É o amor\n" +
                    "Que mexe com minha cabeça e me deixa assim\n" +
                    "Que faz eu pensar em você e esquecer de mim\n" +
                    "Que faz eu esquecer que a vida é feita pra viver");
        }
    }
}