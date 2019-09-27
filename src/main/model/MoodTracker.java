package model;

import java.util.ArrayList;

public class MoodTracker {
    private int moodNum;
    private String moodName;
    private MoodTracker moodChoice;
    private ArrayList<MoodTracker> allMoods;
    private ArrayList<MoodTracker> homepagedata;


    public MoodTracker() {
        allMoods = new ArrayList<MoodTracker>();
        System.out.println("How are you feeling today?");
        homepagedata = new ArrayList<MoodTracker>();

    }

    // getters
    public String getMoodName() {
        return moodName;
    }

    public int getMoodNum() {
        return moodNum;
    }

    public MoodTracker getMoodChoice() {
        return moodChoice;
    }

    public ArrayList<MoodTracker> getHD() {
        return homepagedata;
    }



    // MODIFIES: this
    // EFFECTS: sets data for amazing mood
    public void amazing() {
        MoodTracker amazing = new MoodTracker();
        addMood(amazing);
        this.moodChoice = amazing;
        this.moodNum = 5;
        System.out.println(this.moodName = "amazing");
    }

    // MODIFIES: this
    // EFFECTS: sets data for content mood
    public void content() {
        MoodTracker content = new MoodTracker();
        addMood(content);
        this.moodChoice = content;
        this.moodNum = 4;
        this.moodName = "content";
    }

    // MODIFIES: this
    // EFFECTS: sets data for meh mood
    public void meh() {
        MoodTracker meh = new MoodTracker();
        addMood(meh);
        this.moodChoice = meh;
        this.moodNum = 3;
        this.moodName = "meh";
    }

    // MODIFIES: this
    // EFFECTS: sets data for bad mood
    public void bad() {
        MoodTracker bad = new MoodTracker();
        addMood(bad);
        this.moodChoice = bad;
        this.moodNum = 2;
        this.moodName = "bad";
    }

    // MODIFIES: this
    // EFFECTS: sets data for terrible mood
    public void terrible() {
        MoodTracker terrible = new MoodTracker();
        addMood(terrible);
        this.moodChoice = terrible;
        this.moodNum = 1;
        this.moodName = "terrible";
    }

    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: mood is added to the list if it's not
    // already in the list
    public void addMood(MoodTracker moodChoice) {
        homepagedata.add(moodChoice);
    }

    // REQUIRES: a mood has already been chosen
    // MODIFIES: this
    // EFFECTS: changes mood to different mood
    public void changeMood(MoodTracker moodChoice) {
        this.moodChoice = moodChoice;
    }

}
