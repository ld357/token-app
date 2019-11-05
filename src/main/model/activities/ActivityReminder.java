package model.activities;

import java.util.ArrayList;

public class ActivityReminder {
    protected String name;
    protected String status;
    protected ArrayList<Activity> selectionD;
    protected Activity actChoice;
    protected ArrayList<Activity> homepageD;
    Tag tag = new Tag();


    public ActivityReminder() {
        this.name = "";
        this.status = "not yet completed";

        selectionD = new ArrayList<>();
        Activity breathe = new Breathe();
        Activity exercise = new Exercise();
        Activity hydrate = new Hydrate();
        Activity inspire = new Inspire();
        Activity interact = new Interact();
        Activity rest = new Rest();
        Activity revitalize  = new Revitalize();
        Activity refresh = new Refresh();


        selectionD.add(breathe);
        selectionD.add(exercise);
        selectionD.add(hydrate);
        selectionD.add(inspire);
        selectionD.add(interact);
        selectionD.add(rest);
        selectionD.add(revitalize);
        selectionD.add(refresh);

        homepageD = new ArrayList<Activity>();
        System.out.println("What would you like to remind yourself to do?");

    }

    // MODIFIES: this
    // EFFECTS: changes status of activity to "today"
    public void checkIn(Activity actChoice) {
        this.status = "today";
    }


    // MODIFIES: this (  // modifies the set in which the object is called by the method)
    // EFFECTS: activity is added to the list if it's not
    // already in the list
    public void addActivity(Activity actChoice) {
        homepageD.add(actChoice);

    }

    // REQUIRES: activity is an element of the list
    // MODIFIES: this
    // EFFECTS: activity is removed from the list
    public void removeActivity(Activity actChoice) {
        homepageD.remove(actChoice);
    }

    public void provideTags(Category category) {
        tag.provideTags(category);
    }

    public void addCategory(Category category) {
        tag.addCategory(category);
    }

    public void addTag(Category c, String taglabel) {
        tag.addTag(c, taglabel);
    }

}




//  public Map<Category, ArrayList<String>> categoryTags;
//  categoryTags = new HashMap<>();
//        Category highActive = new Category("High Active",5,false);
//        Category mediumActive = new Category("Medium Active",3,false);
//        Category lowActive = new Category("Low Active",1,false);
//        Category selfDevelopment = new Category("Self Development", 0, false);
//        Category selfPractice = new Category("Self Practice", 0, false);
//
//        addCategory(highActive);
//        addCategory(mediumActive);
//        addCategory(lowActive);
//        addCategory(selfDevelopment);
//        addCategory(selfPractice);
//
//        addTag(highActive,"#fit");
//        addTag(highActive,"#physicalgrowth");
//        addTag(highActive,"#strength");
//        addTag(selfDevelopment, "#mentalmind");
//        addTag(selfDevelopment,"#selflove");
//        addTag(selfPractice, "#meditation");


//        ArrayList<String> names = categoryTags.get(category);
//        for (String name: names) {
//            System.out.println(name + ",");
//        }

//        categoryTags.put(category, new ArrayList<>());

//        ArrayList<String> tags = categoryTags.get(c);
//        tags.add(tag);