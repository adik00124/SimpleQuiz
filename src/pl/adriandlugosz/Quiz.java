package pl.adriandlugosz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Quiz extends JFrame implements ActionListener {

    private JButton button1, button2, button3;
    private JLabel questionLabel;
    private static List<Question> questions = new ArrayList<>();
    private int counter = 0;
    private int score = 0;


    public Quiz(QuestionGenerator questionGenerator) {
        this.questions = questionGenerator.generator();
        setFrame();
        setFrameComponets();
    }

    public static void addQuestion(Question question) {
        questions.add(question);
    }

    public void setFrameComponets() {
        questionLabel = new JLabel(questions.get(0).getQuestionContent(), SwingConstants.CENTER);
        add(questionLabel);

        button1 = new JButton(questions.get(0).getAnswersList().get(0).getAnswerContent());
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton(questions.get(0).getAnswersList().get(1).getAnswerContent());
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton(questions.get(0).getAnswersList().get(2).getAnswerContent());
        button3.addActionListener(this);
        add(button3);

    }

    public void setFrame() {
        setTitle("Simple Quiz");
        setVisible(true);
        setSize(400, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
    }


    @Override
    public void actionPerformed(ActionEvent e) {


        JButton clickedButton = (JButton) e.getSource();

        //button1=index0  button2=index1 button3=index2

        boolean userChoice=false;

        if (clickedButton == button1) {
            userChoice = questions.get(counter).getAnswersList().get(0).isCorrectAnswer();
        } else if (clickedButton == button2) {
            userChoice = questions.get(counter).getAnswersList().get(1).isCorrectAnswer();
        } else if (clickedButton == button3) {
            userChoice = questions.get(counter).getAnswersList().get(2).isCorrectAnswer();
        }

        if(userChoice){
            score++;
        }
        counter++;

        if (counter == questions.size()) {
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Score: " + score);
        } else {
            questionLabel.setText(questions.get(counter).getQuestionContent());
            button1.setText(questions.get(counter).getAnswersList().get(0).getAnswerContent());
            button2.setText(questions.get(counter).getAnswersList().get(1).getAnswerContent());
            button3.setText(questions.get(counter).getAnswersList().get(2).getAnswerContent());
        }
    }
}