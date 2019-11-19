package model.moods;

public abstract class AllTypesOfMoods implements Mood {
    protected String colour;
    protected String moodName;
    protected int moodNum;


    public AllTypesOfMoods(String moodName, int moodNum) {
        this.moodName = moodName;
        this.moodNum = moodNum;
    }


    // MODIFIES: this
    // EFFECTS: changes colour to the particular colour
    public void colourMood(String colour) {
        this.colour = colour;
    }

    // MODIFIES: Mood
    // EFFECTS: sets the sound of the mood
    protected abstract void soundMood();

    // MODIFIES: Mood
    // EFFECTS: sets the announcement of the mood
    protected abstract void announceMood();


}
