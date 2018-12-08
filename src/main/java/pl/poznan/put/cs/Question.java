package pl.poznan.put.cs;

public class Question {
    private String content;
    private String[] answers;
    private boolean answered;

    private String chosenAnswer;

    public Question(String content, String[] answers) {
        this.content = content;
        this.answers = answers;
        this.answered = false;
    }

    public Question() {
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(String chosenAnswer) {
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
}
