package model.moods;

public class Bad extends AllMoods implements Moods {
    int moodNum;
    String moodName;

    public Bad() {
        super("bad", 2);
        this.moodName = "bad";
        this.moodNum = 2;
        this.colourMood("medium blue");
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
        System.out.println("Ughhh!");
    }

    @Override
    public void announceMood() {
        System.out.println("I am feeling bad!");

    }


    // MODIFIES: this
    // EFFECTS: sets data for bad mood

}
