package model.moods;

public class Content extends AllTypesOfMoods implements Mood {
    int moodNum;
    String moodName;
    String soundMood;
    String announcement;


    public Content() {
        super("content", 4);
        this.moodName = "content";
        this.moodNum = 4;
        this.colourMood("sky blue");
    }

    // getters
    public String getMoodName() {
        return moodName;
    }

    public int getMoodNum() {
        return moodNum;
    }



    // setters

    public String getSoundMood() {
        return soundMood;
    }

    public String getAnnouncement() {
        return announcement;
    }

    @Override
    // MODIFIES: this
    // EFFECTS: sets soundMood to Hmmmm!
    public void soundMood() {
        this.soundMood = "Hmmmm!";
    }

    @Override
    // MODIFIES: this
    // EFFECTS: sets announceMood to I am feeling content!
    public void announceMood() {
        this.announcement = "I am feeling content!";

    }


}
