package model.entities;

import model.exceptions.DomainException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsHandler {
    private List<String> allQuestions = new ArrayList<>();
    private List<String> selectedQuestions = new ArrayList<>();
    private Random random = new Random();

    public void loadQuestionsFromData(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                allQuestions.add(line);
            }
        } catch (IOException e) {
            throw new DomainException("Erro ao carregar perguntas do arquivo: " + e.getMessage());
        }
    }

    public void selectRandomQuestions(int number) {
        selectedQuestions.clear();

        for(int i = 0; i <number && !allQuestions.isEmpty(); i++) {
            int index = random.nextInt(allQuestions.size());
            String selectedQ = allQuestions.remove(index);
            selectedQuestions.add(selectedQ);
        }
    }

    public List<String> getSelectedQuestions() {
        return selectedQuestions;
    }
}

