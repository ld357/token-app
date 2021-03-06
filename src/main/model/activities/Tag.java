package model.activities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tag {
    public Map<Category, ArrayList<String>> categoryTags;

    public Tag() {
        categoryTags = new HashMap<>();
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
        addTag(mediumActive,"#fit");
        addTag(mediumActive,"#physicalgrowth");
        addTag(mediumActive,"#strength");
        addTag(lowActive,"#fit");
        addTag(lowActive,"#physicalgrowth");
        addTag(lowActive,"#strength");

        addTag(selfDevelopment, "#mentalmind");
        addTag(selfDevelopment,"#selflove");
        addTag(selfPractice, "#meditation");
        addTag(selfPractice, "#selfcare");

    }

    // EFFECTS: prints out categories with tags
    public void provideTags(Category category) {
        ArrayList<String> names = categoryTags.get(category);
        for (String name: names) {
            System.out.println(name + ",");
        }
    }

    // MODIFIES: this
    // EFFECTS: adds category to hashmap
    public void addCategory(Category category) {
        categoryTags.put(category, new ArrayList<>());
    }

    // MODIFIES: this
    // EFFECTS: adds tag to specific category
    public void addTag(Category c, String tag) {
        ArrayList<String> tags = categoryTags.get(c);
        tags.add(tag);
    }
}
