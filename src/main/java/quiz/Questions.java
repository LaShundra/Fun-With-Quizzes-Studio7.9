package quiz;

public class Questions {
    private final String topic;
    private final boolean correct;
    public Questions(String topic, boolean correct){
        this.topic = topic;
        this.correct = correct;
    }
    public Questions(String topic){
        this(topic, false);
    }

    public String getTopic() {
        return topic;
    }

    public boolean isCorrect() {
        return correct;
    }

}
