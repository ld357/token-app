package model.moods;

public class Meh implements Moods {
    int moodNum;
    String moodName;

    public Meh() {
        this.moodNum = 3;
        this.moodName = "meh";
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
    // EFFECTS: sets data for meh mood
}
