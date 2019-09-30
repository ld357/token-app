package model.moods;

public class Content implements Moods {
    int moodNum;
    String moodName;


    public Content() {
        this.moodNum = 4;
        this.moodName = "content";
    }

    // getters
    public String getMoodName() {
        return moodName;
    }

    public int getMoodNum() {
        return moodNum;
    }

    @Override
    public void addMood() {

    }

    @Override
    public void changeMood() {

    }

    @Override
    public void removeMood() {

    }


    // MODIFIES: this
    // EFFECTS: sets data for content mood

}
