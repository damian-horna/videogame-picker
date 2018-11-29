package pl.poznan.put.cs;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String content;
    private List<String> answers;
    private String choice;

    public Question(String content, List<String> answers) {
        this.content = content;
        this.answers = answers;
        this.choice=answers.get(0);
    }

    public Question() {
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
