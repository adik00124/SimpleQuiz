package pl.adriandlugosz;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String questionContent;
    private List<Answer> answersList;

    public Question(String questionContent) {
        this.questionContent = questionContent;
        answersList = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        answersList.add(answer);
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public List<Answer> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List<Answer> answersList) {
        this.answersList = answersList;
    }
}