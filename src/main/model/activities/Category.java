package model.activities;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private int activeLevel;
    private boolean needsPeople;
    private List<Category> categories;

    public Category(String name, int activeLevel, boolean needsPeople) {
        this.name = name;
        this.activeLevel = activeLevel;
        this.needsPeople = needsPeople;
        categories = new ArrayList<>();
    }

    // getters
    public String getName() {
        return name;
    }


    public int getActiveLevel() {
        return activeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Category category = (Category) o;

        if (activeLevel != category.activeLevel) {
            return false;
        }
        if (needsPeople != category.needsPeople) {
            return false;
        }
        if (!name.equals(category.name)) {
            return false;
        }
        return categories.equals(category.categories);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + activeLevel;
        result = 31 * result + (needsPeople ? 1 : 0);
        result = 31 * result + categories.hashCode();
        return result;
    }
}
