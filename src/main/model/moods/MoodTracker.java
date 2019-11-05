package model.moods;

import model.exceptions.MoodWasNotAdded;
import model.exceptions.NoMoodChoiceSelected;

import java.util.HashSet;

public class MoodTracker {
    private Mood moodChoice;
    private HashSet<Mood> homepagedata;
    private HashSet<Mood> selectiondata;


    public MoodTracker() {
        selectiondata = new HashSet<Mood>();
        this.moodChoice = null;
        Mood amazing = new Amazing();
        Mood content = new Content();
        Mood meh = new Meh();
        Mood bad = new Bad();
        Mood terrible = new Terrible();
        selectiondata.add(amazing);
        selectiondata.add(content);
        selectiondata.add(meh);
        selectiondata.add(bad);
        selectiondata.add(terrible);


        homepagedata = new HashSet<Mood>();
        System.out.println("How are you feeling today?");

    }


    // getters
    public Mood getMoodChoice(Mood moodChoice) {
        return moodChoice;
    }

    public HashSet<Mood> getHD() {
        return homepagedata;
    }

    public void setMoodChoice(Mood moodChoice) {
        this.moodChoice = moodChoice;

    }


    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: mood is added to the list if it's not
    // already in the list
    public void addMood(Mood moodChoice) {
        homepagedata.add(moodChoice);
    }

    // MODIFIES: this
    // EFFECTS: mood is removed from list
    public void removeMood(Mood moodChoice) throws MoodWasNotAdded {
        if (!homepagedata.contains(moodChoice)) {
            throw new MoodWasNotAdded();
        }
        homepagedata.remove(moodChoice);
    }

    // MODIFIES: this
    // EFFECTS: changes mood to different mood
    public void changeMood(Mood moodChoice) throws NoMoodChoiceSelected {
        if (this.moodChoice == null) {
            throw new NoMoodChoiceSelected();
        }

        this.moodChoice = moodChoice;
    }



}
