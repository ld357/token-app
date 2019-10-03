package ui;

import model.activities.Activities;
import model.activities.ActivityReminder;

import java.io.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SaveAndLoad {

    public static void saveFile(ArrayList <Activities> act) throws IOException {

        FileOutputStream fos = new FileOutputStream(("saveInput.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Activities a : act) {
            oos.writeObject(act);

        }

        oos.flush();
        oos.close();

    }

    public static ArrayList<Activities> loadFile() throws IOException, ClassNotFoundException {
        ArrayList<Activities> a = new ArrayList<>();
        FileInputStream fis = new FileInputStream("saveInput.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Activities activities = (Activities) ois.readObject();
        a.add(activities);
        ois.close();
        return a;

    }



}
