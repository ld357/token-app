package model;

import model.exceptions.MoodWasNotAdded;
import model.exceptions.NoMoodChoiceSelected;

import java.util.HashSet;

public class MoodTracker {
    private Moods moodChoice;
    private HashSet<Moods> homepagedata;
    private HashSet<Moods> selectiondata;


    public MoodTracker() {
        selectiondata = new HashSet<Moods>();
        this.moodChoice = null;
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

    public void setMoodChoice(Moods moodChoice) {
        this.moodChoice = moodChoice;

    }


    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: mood is added to the list if it's not
    // already in the list
    public void addMood(Moods moodChoice) {
        homepagedata.add(moodChoice);
    }

    // MODIFIES: this
    // EFFECTS: mood is removed from list
    public void removeMood(Moods moodChoice) throws MoodWasNotAdded {
        if (!homepagedata.contains(moodChoice)) {
            throw new MoodWasNotAdded();
        }
        homepagedata.remove(moodChoice);
    }

    // MODIFIES: this
    // EFFECTS: changes mood to different mood
    public void changeMood(Moods moodChoice) throws NoMoodChoiceSelected {
        if (this.moodChoice == null) {
            throw new NoMoodChoiceSelected();
        }

        this.moodChoice = moodChoice;
    }




}
