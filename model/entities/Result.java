package model.entities;

public class Result {
    public static void  showResult(int pontuacao) {
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
