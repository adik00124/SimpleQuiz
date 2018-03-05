package pl.adriandlugosz;

public class Answer {
    private String answerContent;
    private boolean isCorrectAnswer;

    public Answer(String answerContent, boolean isCorrectAnswer) {
        this.answerContent = answerContent;
        this.isCorrectAnswer = isCorrectAnswer;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public boolean isCorrectAnswer() {
        return isCorrectAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        isCorrectAnswer = correctAnswer;
    }
}