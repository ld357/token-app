package model.activities;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ActivityReminder {
    private String name;
    private String status;
    private ArrayList<Activities> selectionD;
    private Activities actChoice;
    private ArrayList<Activities> homepageD;
    private Map<Category, ArrayList<String>> categoryTags = new HashMap<>();


    public ActivityReminder() {
        this.name = "";
        this.status = "not yet completed";

        selectionD = new ArrayList<>();
        Activities breathe = new Breathe();
        Activities exercise = new Exercise();
        Activities hydrate = new Hydrate();
        Activities inspire = new Inspire();
        Activities interact = new Interact();
        Activities refresh = new Refresh();
        Activities rest = new Rest();
        Activities revitalize = new Revitalize();


        selectionD.add(breathe);
        selectionD.add(exercise);
        selectionD.add(hydrate);
        selectionD.add(inspire);
        selectionD.add(interact);
        selectionD.add(refresh);
        selectionD.add(rest);
        selectionD.add(revitalize);


        homepageD = new ArrayList<Activities>();
        System.out.println("What would you like to remind yourself to do?");


        Category highActive = new Category("High Active",5,false);
        Category mediumActive = new Category("Medium Active",3,false);
        Category lowActive = new Category("Low Active",1,false);
        Category selfDevelopment = new Category("Self Development", 0, false);
        Category selfPractice = new Category("Self Practice", 0, false);

        addCategory(highActive);
        addCategory(mediumActive);
        addCategory(lowActive);
        addCategory(selfDevelopment);
        addCategory(selfPractice);

        addTag(highActive,"#fit");
        addTag(highActive,"#physicalgrowth");
        addTag(highActive,"#strength");
        addTag(selfDevelopment, "#mentalmind");
        addTag(selfDevelopment,"#selflove");
        addTag(selfPractice, "#meditation");




    }

    // getters

    public Activities getActChoice(Activities actChoice) {
        return actChoice;
    }

    public ArrayList<Activities> getSelectionData() {
        return selectionD;
    }

    public ArrayList<Activities> getHomepageData() {
        return homepageD;
    }


    // MODIFIES: this
    // EFFECTS: changes status of activity to "today"
    public void checkIn(Activities actChoice) {
        this.status = "today";
    }

    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: activity is added to the list if it's not
    // already in the list
    public void addActivity(Activities actChoice) {
        homepageD.add(actChoice);

    }

    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeActivity(Activities actChoice) {
        homepageD.remove(actChoice);
    }

    public void provideTags(Category category) {
        ArrayList<String> names = categoryTags.get(category);
        for (String name: names) {
            System.out.println(name + ",");
        }
    }

    private void addCategory(Category category) {
        categoryTags.put(category, new ArrayList<>());
    }

    private void addTag(Category c, String tag) {
        ArrayList<String> tags = categoryTags.get(c);
        tags.add(tag);
    }


}
