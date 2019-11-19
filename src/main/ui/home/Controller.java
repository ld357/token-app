package ui.home;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import model.activities.*;
import ui.CuriosityEntry;
import ui.sample.Main;

import java.awt.event.TextEvent;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Controller {
    ActivityReminder activityReminder = new ActivityReminder();
    Activity breathe;
    Activity exercise;
    Activity hydrate;
    Activity inspire;
    Activity interact;
    Activity refresh;
    Activity rest;
    Activity revitalize;



    @FXML Pane breathePane;
    @FXML Pane exercisePane;
    @FXML Pane hydratePane;
    @FXML Pane inspirePane;
    @FXML Pane interactPane;
    @FXML Pane refreshPane;
    @FXML Pane restPane;
    @FXML Pane revitalizePane;
    @FXML Text breatheNYC;
    @FXML Button thoughtButton;
    @FXML Button quoteButton;
    @FXML Button moodButton;


    public void breathePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Breathe activity selected");
        breathe = new Breathe();
        activityReminder.addActivity(breathe);
        activityReminder.checkIn(breathe);
        activityReminder.setStatus();
    }

    public void exercisePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Exercise activity selected");
        exercise = new Exercise();
        activityReminder.addActivity(exercise);
        activityReminder.checkIn(exercise);
        activityReminder.setStatus();
    }

    public void hydratePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Hydrate activity selected");
        hydrate = new Hydrate();
        activityReminder.addActivity(hydrate);
        activityReminder.checkIn(hydrate);
        activityReminder.setStatus();
    }

    public void inspirePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Inspire activity selected");
        inspire = new Inspire();
        activityReminder.addActivity(inspire);
        activityReminder.checkIn(inspire);
        activityReminder.setStatus();
    }

    public void interactPaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Interact activity selected");
        interact = new Interact();
        activityReminder.addActivity(interact);
        activityReminder.checkIn(interact);
        activityReminder.setStatus();
    }

    public void refreshPaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Refresh activity selected");
        refresh = new Refresh();
        activityReminder.addActivity(refresh);
        activityReminder.checkIn(refresh);
        activityReminder.setStatus();
    }

    public void restPaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Rest activity selected");
        rest = new Rest();
        activityReminder.addActivity(rest);
        activityReminder.checkIn(rest);
        activityReminder.setStatus();
    }


    public void revitalizePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("Revitalize activity selected");
        revitalize = new Revitalize();
        activityReminder.addActivity(revitalize);
        activityReminder.checkIn(revitalize);
        activityReminder.setStatus();
    }

    public void thoughtButtonClicked() {

    }

    public void moodButtonClicked() {

    }


    public void quoteButtonClicked() throws Exception {
     //   Main mn = new Main();
     //   mn.main(null);
    }



}
