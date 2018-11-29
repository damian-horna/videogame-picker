package pl.poznan.put.cs;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String content;
    private List<String> answers = new ArrayList<>();

    public Question(String content, List<String> answers) {
        this.content = content;
        this.answers = answers;
    }

    public Question() {
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
