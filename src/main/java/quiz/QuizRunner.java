package quiz;

public class QuizRunner {

     public static void main(String[] args) {

         Quiz quiz = new Quiz();

         String q1 = "Which of the following are types of textures?";
         Questions[] q1Question = new Questions[]{
                 new Questions("Fluffy", true),
                 new Questions("Squishy", true),
                 new Questions("White"),
                 new Questions("Rough", true),
                 new Questions("Dark")
         };
         Checkbox question1 = new Checkbox(q1, q1Question);

         String q2 = "The color of snow is white.";
         Questions[] q2Question = new Questions[]{
                 new Questions("False"),
                 new Questions("True", true)
         };
         TrueFalse question2 = new TrueFalse(q2, q2Question);

         String q3 = "What are the colors of the rainbow?";
         Questions[] q3Question = new Questions[]{
                 new Questions("Black"),
                 new Questions("Red", true),
                 new Questions("Yellow", true),
                 new Questions("Orange", true),
                 new Questions("Teal"),
                 new Questions("Green", true),
                 new Questions("Blue", true),
                 new Questions("Indigo", true)

         };
         Choice question3 = new Choice(q3, q3Question);

         quiz.addMultipleQuestions(new MultipleQuestion[]{question1, question2, question3});
         quiz.runQuiz();

         System.out.println("\nYou answered " + quiz.getNumCorrect() + " of " + quiz.getMultipleQuestions().size() +
                 " questions correctly. Thanks for playing!");


     }
}

