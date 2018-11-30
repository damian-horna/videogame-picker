package pl.poznan.put.cs;

public class Question {
    private String content;
    private Answer[] answers;
    private boolean answered;

    private Answer chosenAnswer;

    public Question(String content, Answer[] answers) {
        this.content = content;
        this.answers = answers;
        this.answered = false;
    }

    public Question() {
    }

    public Answer getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(Answer chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }
}
