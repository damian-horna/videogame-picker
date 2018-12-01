package pl.poznan.put.cs;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String content;
    private Question nextQuestion;
    private boolean isLastAnswer;
    private List<String> finalAnswer = new ArrayList<String>();

    public Answer(String content, Question nextQuestion, List<String> finalAnswer) {
        this.content = content;
        this.nextQuestion = nextQuestion;
        this.isLastAnswer = true;
        this.finalAnswer = finalAnswer;
    }

    public Answer(String content, Question nextQuestion) {
        this.content = content;
        this.nextQuestion = nextQuestion;
        this.isLastAnswer = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getNextQuestion() {
        return nextQuestion;
    }

    public void setNextQuestion(Question nextQuestion) {
        this.nextQuestion = nextQuestion;
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