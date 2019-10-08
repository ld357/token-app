package model.moods;

public abstract class AllMoods implements Moods {
    protected String colour;
    protected String valence;
    protected String moodName;
    protected int moodNum;


    public AllMoods(String moodName, int moodNum) {
        this.moodName = moodName;
        this.moodNum = moodNum;
    }


    public void colourMood(String colour) {
        this.colour = colour;
    }

    protected abstract void soundMood();

    protected abstract void announceMood();


}
