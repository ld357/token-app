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


    @Override
    public void soundMood() {
        System.out.println("Yayyy!");
    }

    @Override
    public void announceMood() {
        System.out.println("I am feeling amazing!");
    }

}
