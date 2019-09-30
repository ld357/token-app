package model.moods;

public class Amazing implements Moods {
    int moodNum;
    String moodName;

    public Amazing() {
        this.moodNum = 5;
        this.moodName = "amazing";
    }

    // getters
    public String getMoodName() {
        return moodName;
    }

    public int getMoodNum() {
        return moodNum;
    }

    // setters
    public void setMoodNum(int moodNum) {
        this.moodNum = moodNum;

    }

    public void setMoodName(String moodName) {
        this.moodName = moodName;
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
    // EFFECTS: sets data for amazing mood
}
