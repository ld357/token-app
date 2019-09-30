package model.moods;

public class Terrible implements Moods {
    int moodNum;
    String moodName;

    public Terrible() {
        this.moodNum = 1;
        this.moodName = "terrible";
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
    // EFFECTS: sets data for terrible mood
}
