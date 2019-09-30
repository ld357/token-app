package model.moods;

public class Bad implements Moods {
    int moodNum;
    String moodName;

    public Bad() {
        this.moodNum = 2;
        this.moodName = "bad";
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
    // EFFECTS: sets data for bad mood

}
