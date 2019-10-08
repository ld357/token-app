package model.moods;

public class Content extends AllMoods implements Moods {
    int moodNum;
    String moodName;


    public Content() {
        super("content", 4);
        this.moodName = "content";
        this.moodNum = 4;
        this.colourMood("sky blue");
    }

    // getters
    public String getMoodName() {
        return moodName;
    }

    public int getMoodNum() {
        return moodNum;
    }


    @Override
    public void soundMood() {
        System.out.println("Hmmmm!");

    }

    @Override
    public void announceMood() {
        System.out.println("I am feeling content!");
    }


    // MODIFIES: this
    // EFFECTS: sets data for content mood

}
