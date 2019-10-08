package model.moods;

public class Terrible extends AllMoods implements Moods {
    int moodNum;
    String moodName;

    public Terrible() {
        super("terrible", 1);
        this.moodName = "terrible";
        this.moodNum = 1;
        this.colourMood("dark blue");
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

    @Override
    public void soundMood() {
        System.out.println("DARNN...");
    }

    @Override
    public void announceMood() {
        System.out.println("I am feeling terrible!");

    }


    // MODIFIES: this
    // EFFECTS: sets data for terrible mood
}
