package quiz;

public class TrueFalse extends MultipleQuestion{
    public TrueFalse(String multipleQuestion, Questions[] questionsArray) {
        super(multipleQuestion, questionsArray);
    }
    @Override
    public String toString() {
        return "\nTRUE OR FALSE: \n" +
                super.getMultipleQuestion() + "\n" +
                super.getFormattedQuestions();
    }
}
