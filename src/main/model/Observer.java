package model;

import model.activities.Activity;

public interface Observer {

    void update(Activity activity);
}
