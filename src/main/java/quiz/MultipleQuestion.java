package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public abstract class MultipleQuestion {
    private final String multipleQuestion;
    private HashMap<Integer, Questions> questionsHashMap;

    public MultipleQuestion(String multipleQuestion, Questions[] questionsArray){
        this.multipleQuestion = multipleQuestion;
        createRandomizedQuestionsHashMap(questionsArray);
    }
    public String getMultipleQuestion(){
        return multipleQuestion;
    }
    public HashMap<Integer, Questions> getQuestionsHashMap(){
        return questionsHashMap;
    }
    @Override
    public abstract String toString();

    void createRandomizedQuestionsHashMap(Questions[] questionsArray) {
        questionsHashMap = new HashMap<>();
        ArrayList<Questions> questionsArrayList = new ArrayList<>();
        Collections.addAll(questionsArrayList, questionsArray);
        Collections.shuffle(questionsArrayList);
        for (int i = 0; i < questionsArrayList.size(); i++) {
            questionsHashMap.put(i+1, questionsArrayList.get(i));
        }
    }
    String getFormattedQuestions(){
        StringBuilder formattedQuestions = new StringBuilder();
        for (int questionsNum : questionsHashMap.keySet()) {
            String questions = "\n" + questionsNum + " - " +
                    questionsHashMap.get(questionsNum).getTopic() + "\n";
            formattedQuestions.append(questions);
        }
        return formattedQuestions.toString();
    }
}
