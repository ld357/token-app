package model.moods;

public class Amazing extends AllMoods implements Moods {
    int moodNum;
    String moodName;

    public Amazing() {
        super("amazing", 5);
        this.moodName = "amazing";
        this.moodNum = 5;
        this.colourMood("yellow");
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
    public void soundMood() {
        System.out.println("Yayyy!");
    }

    @Override
    public void announceMood() {
        System.out.println("I am feeling amazing!");
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

}
