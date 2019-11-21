package ui.home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import model.activities.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class HomeController {
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
    @FXML AnchorPane rootPane;

    // TODO: Need to figure out how to change "not yet completed" to "today" and change icons to black?
    // TODO: Adding message bar at the top?

    public void breathePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Breathe activity selected");
        breathe = new Breathe();
        activityReminder.addActivity(breathe);
        activityReminder.checkIn(breathe);
        activityReminder.setStatus();
    }

    public void exercisePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Exercise activity selected");
        exercise = new Exercise();
        activityReminder.addActivity(exercise);
        activityReminder.checkIn(exercise);
        activityReminder.setStatus();
    }

    public void hydratePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Hydrate activity selected");
        hydrate = new Hydrate();
        activityReminder.addActivity(hydrate);
        activityReminder.checkIn(hydrate);
        activityReminder.setStatus();
    }

    public void inspirePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Inspire activity selected");
        inspire = new Inspire();
        activityReminder.addActivity(inspire);
        activityReminder.checkIn(inspire);
        activityReminder.setStatus();
    }

    public void interactPaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Interact activity selected");
        interact = new Interact();
        activityReminder.addActivity(interact);
        activityReminder.checkIn(interact);
        activityReminder.setStatus();
    }

    public void refreshPaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Refresh activity selected");
        refresh = new Refresh();
        activityReminder.addActivity(refresh);
        activityReminder.checkIn(refresh);
        activityReminder.setStatus();
    }

    public void restPaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Rest activity selected");
        rest = new Rest();
        activityReminder.addActivity(rest);
        activityReminder.checkIn(rest);
        activityReminder.setStatus();
    }


    public void revitalizePaneClicked() throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(activityReminder.savedActivities);
        System.out.println("Revitalize activity selected");
        revitalize = new Revitalize();
        activityReminder.addActivity(revitalize);
        activityReminder.checkIn(revitalize);
        activityReminder.setStatus();
    }

    public void thoughtButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("thoughts.fxml"));
        rootPane.getChildren().setAll(pane);


    }

    public void moodButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("moods.fxml"));
        rootPane.getChildren().setAll(pane);

    }


    public void quoteButtonClicked() throws Exception {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("quotes.fxml"));
        rootPane.getChildren().setAll(pane);

    }



}
