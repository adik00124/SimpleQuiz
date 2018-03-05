package pl.adriandlugosz;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileQuestionGenerator implements QuestionGenerator {
    @Override
    public List<Question> generator() {

        String file = "questions.txt";
        List<Question> listOfQuestionsFromFile = new ArrayList<>();
        int counter=-1;

        try (Scanner scanner = new Scanner(new File(file))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.endsWith("?")) {
                    counter++;
                    listOfQuestionsFromFile.add(new Question(line));
                }
                if (line.trim().endsWith("true")) {
                    listOfQuestionsFromFile.get(counter).addAnswer(new Answer(line.replace("true", "").trim(), true));
                }
                if (line.trim().endsWith("false")) {
                    listOfQuestionsFromFile.get(counter).addAnswer(new Answer(line.replace("false", "").trim(), false));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listOfQuestionsFromFile;
    }
}