package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    private final ArrayList<MultipleQuestion> multipleQuestions = new ArrayList<>();
    private int numCorrect = 0;
    public ArrayList<MultipleQuestion> getMultipleQuestions(){
        return multipleQuestions;
    }
    public int getNumCorrect() {
        return numCorrect;
    }

    public void addMultipleQuestions(MultipleQuestion[] multipleQuestionsArray) {
        Collections.addAll(multipleQuestions, multipleQuestionsArray);
    }
    public void updateCorrectAnswers(){
        numCorrect++;
    }
    public void runQuiz() {
        Scanner input = new Scanner(System.in);
        Collections.shuffle(multipleQuestions);

        for (MultipleQuestion multipleQuestion : multipleQuestions) {
            //Print choices and questions
            System.out.println(multipleQuestion);
            //determine # of correct responses
            ArrayList<Integer> responses = new ArrayList<>();
            for (int questionNum : multipleQuestion.getQuestionsHashMap().keySet()){
                if(multipleQuestion.getQuestionsHashMap().get(questionNum).isCorrect()) {
                    responses.add(questionNum);
                }
            }

            ArrayList<Integer> userResponse = new ArrayList<>();
            int i = 0;
            while(i < responses.size()) {
                System.out.println("Please enter a number: ");
                int userResponses = input.nextInt();
                if (userResponse.contains(userResponses)){
                    System.out.println("You already gave that answer!");
                } else if (!responses.contains(userResponses)){
                    System.out.println("Sorry, that is incorrect. The correct answer is: ");
                    for(int resp : responses) {
                        System.out.println(multipleQuestion.getQuestionsHashMap().get(resp).getTopic());
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponse.add(userResponses);
                    if(i == responses.size() - 1) {
                        updateCorrectAnswers();
                    }
                    i++;
                }

            }

        }

        input.close();
    }

}
