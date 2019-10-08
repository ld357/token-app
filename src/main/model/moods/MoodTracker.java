package model.moods;

import java.util.HashSet;

public class MoodTracker {
    private Moods moodChoice;
    private HashSet<Moods> homepagedata;
    private HashSet<Moods> selectiondata;


    public MoodTracker() {
        selectiondata = new HashSet<Moods>();
        Moods amazing = new Amazing();
        Moods content = new Content();
        Moods meh = new Meh();
        Moods bad = new Bad();
        Moods terrible = new Terrible();
        selectiondata.add(amazing);
        selectiondata.add(content);
        selectiondata.add(meh);
        selectiondata.add(bad);
        selectiondata.add(terrible);


        homepagedata = new HashSet<Moods>();
        System.out.println("How are you feeling today?");

    }


    // getters
    public Moods getMoodChoice(Moods moodChoice) {
        return moodChoice;
    }

    public HashSet<Moods> getHD() {
        return homepagedata;
    }




    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: mood is added to the list if it's not
    // already in the list
    public void addMood(Moods moodChoice) {
        homepagedata.add(moodChoice);
    }

    // REQUIRES: a mood has already been chosen
    // MODIFIES: this
    // EFFECTS: changes mood to different mood
    public void changeMood(Moods moodChoice) {
        this.moodChoice = moodChoice;
    }




}
