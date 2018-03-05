package pl.adriandlugosz;

import java.util.ArrayList;
import java.util.List;

public class UserQuestionQenerator implements QuestionGenerator {

    @Override
    public List<Question> generator() {
        List<Question> listOfUserQuestions = new ArrayList<>();

        listOfUserQuestions.add(new Question("In which year the Second World War started?"));
        listOfUserQuestions.add(new Question("Which town is the capital of Italy?"));
        listOfUserQuestions.add(new Question("What is the chemical formula of water?"));
        listOfUserQuestions.add(new Question("How many province has Poland?"));
        listOfUserQuestions.add(new Question("Who is the author of the law of gravity?"));

        listOfUserQuestions.get(0).addAnswer(new Answer("1920",false));
        listOfUserQuestions.get(0).addAnswer(new Answer("1939",true));
        listOfUserQuestions.get(0).addAnswer(new Answer("1945",false));

        listOfUserQuestions.get(1).addAnswer(new Answer("Rome",true));
        listOfUserQuestions.get(1).addAnswer(new Answer("Venice",false));
        listOfUserQuestions.get(1).addAnswer(new Answer("Paris",false));

        listOfUserQuestions.get(2).addAnswer(new Answer("H2O2",false));
        listOfUserQuestions.get(2).addAnswer(new Answer("HgO",false));
        listOfUserQuestions.get(2).addAnswer(new Answer("H2O",true));

        listOfUserQuestions.get(3).addAnswer(new Answer("15",false));
        listOfUserQuestions.get(3).addAnswer(new Answer("16",true));
        listOfUserQuestions.get(3).addAnswer(new Answer("17",false));

        listOfUserQuestions.get(4).addAnswer(new Answer("Newton",true));
        listOfUserQuestions.get(4).addAnswer(new Answer("Keppler",false));
        listOfUserQuestions.get(4).addAnswer(new Answer("Einstein",false));

        return listOfUserQuestions;
    }
}