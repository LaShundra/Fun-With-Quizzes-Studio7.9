package quiz;

public class Checkbox extends MultipleQuestion{
    public Checkbox(String multipleQuestion, Questions[] questionsArray) {
        super(multipleQuestion, questionsArray);
    }

    @Override
    public String toString() {
        return "\nPICK ONE OR MORE: \n" +
                super.getMultipleQuestion() + "\n" +
                super.getFormattedQuestions();
    }
}
