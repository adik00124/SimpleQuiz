package pl.adriandlugosz;

import javax.swing.*;

public class TestClass {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Quiz quiz=new Quiz(new UserQuestionQenerator());

            }
        });

    }
}