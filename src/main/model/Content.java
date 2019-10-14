package model;

public class Content extends AllMoods implements Moods {
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
    // EFFECTS: sets soundMood
    public void soundMood() {
        this.soundMood = "Hmmmm!";
    }

    @Override
    // EFFECTS: sets announceMood
    public void announceMood() {
        this.announcement = "I am feeling content!";

    }


}
