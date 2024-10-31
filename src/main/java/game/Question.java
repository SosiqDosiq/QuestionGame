package game;

public class Question {
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;
    private int CORRECT_NUMBER_INDEX = 0;

    public Question(String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer) {
        this.question = question;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
    }

    public Question(int CORRECT_NUMBER_INDEX) {
        this.CORRECT_NUMBER_INDEX = CORRECT_NUMBER_INDEX;
    }

    public void setQuestion(String question) {
    }

    public void setFirstAnswer(String firstAnswer) {
    }

    public void setSecondAnswer(String secondAnswer) {
    }

    public void setThirdAnswer(String thirdAnswer) {
    }

    public void setFourthAnswer(String fourthAnswer) {
    }
}
