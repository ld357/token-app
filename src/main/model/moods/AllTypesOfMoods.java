package model.moods;

public abstract class AllTypesOfMoods implements Mood {
    protected String colour;
    protected String moodName;
    protected int moodNum;


    public AllTypesOfMoods(String moodName, int moodNum) {
        this.moodName = moodName;
        this.moodNum = moodNum;
    }


    public void colourMood(String colour) {
        this.colour = colour;
    }

    protected abstract void soundMood();

    protected abstract void announceMood();


}
