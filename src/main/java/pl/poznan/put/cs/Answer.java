package pl.poznan.put.cs;

public class Answer {
    private String content;
    private Question nextQuestion;
    private boolean isLastAnswer;
    private String finalAnswer;

    public Answer(String content, Question nextQuestion, String finalAnswer) {
        this.content = content;
        this.nextQuestion = nextQuestion;
        this.isLastAnswer = true;
        this.finalAnswer = finalAnswer;
    }

    public Answer() {
    }

    public Answer(String content, Question nextQuestion) {
        this.content = content;
        this.nextQuestion = nextQuestion;
        this.isLastAnswer = false;
        this.finalAnswer = "";
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

    public String getFinalAnswer() {
        return finalAnswer;
    }

    public void setFinalAnswer(String finalAnswer) {
        this.finalAnswer = finalAnswer;
    }
}
