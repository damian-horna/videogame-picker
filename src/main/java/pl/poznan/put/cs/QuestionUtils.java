package pl.poznan.put.cs;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Enumeration;


public class QuestionUtils {
    public static void showAnswer(String answer) {
        JOptionPane.showOptionDialog(
                null,
                answer,
                answer,
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null);
    }

    public static void ask(Question question) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(question.getAnswers().length + 1, 1));
        ButtonGroup bgroup = new ButtonGroup();
        JLabel questionContent = new JLabel();
        questionContent.setText(question.getContent());
        panel.add(questionContent);

        for (String answer : question.getAnswers()) {
            JRadioButton btn = new JRadioButton(answer);
            bgroup.add(btn);
            panel.add(btn);
        }

        int n = JOptionPane.showOptionDialog(
                null,
                panel,
                "Selection",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                null
        );

        if (n == 0) {
            System.out.println("selected OK");
            Enumeration<AbstractButton> buttons = bgroup.getElements();
            while (buttons.hasMoreElements()) {
                AbstractButton button = buttons.nextElement();
                if (button.isSelected()) {
                    question.setAnswered(true);
                    System.out.println("Setting answered to true");
                    Arrays.stream(question.getAnswers()).filter(a -> a.equals(button.getText())).forEach(question::setChosenAnswer);
                }
            }
        }
    }
}
