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
        addTag(selfDevelopment, "#mentalmind");
        addTag(selfDevelopment,"#selflove");
        addTag(selfPractice, "#meditation");

    }

    public void provideTags(Category category) {
        ArrayList<String> names = categoryTags.get(category);
        for (String name: names) {
            System.out.println(name + ",");
        }
    }

    public void addCategory(Category category) {
        categoryTags.put(category, new ArrayList<>());
    }

    public void addTag(Category c, String tag) {
        ArrayList<String> tags = categoryTags.get(c);
        tags.add(tag);
    }
}
