package pl.poznan.put.cs;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String content;
    private boolean isLastAnswer;
    private List<String> finalAnswer = new ArrayList<String>();

    public Answer(String content, List<String> finalAnswer) {
        this.content = content;
        this.isLastAnswer = true;
        this.finalAnswer = finalAnswer;
    }

    public Answer(String content) {
        this.content = content;
        this.isLastAnswer = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isLastAnswer() {
        return isLastAnswer;
    }

    public void setLastAnswer(boolean lastAnswer) {
        isLastAnswer = lastAnswer;
    }

    public List<String> getFinalAnswer() {
        return finalAnswer;
    }

    public void setFinalAnswer(List<String> finalAnswer) {
        this.finalAnswer = finalAnswer;
    }
}