package quiz;

public class Choice extends MultipleQuestion {
    public Choice(String multipleQuestion, Questions[] questionsArray) {
        super(multipleQuestion, questionsArray);
    }
    @Override
    public String toString() {
        return "\nCHOICE: \n" +
                super.getMultipleQuestion() + "\n" +
                super.getFormattedQuestions();
    }
}
