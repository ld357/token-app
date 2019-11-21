package ui.home;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.quotes.Collection;

import java.awt.*;
import java.io.IOException;

public class QuoteController {


    @FXML Text quote1Text;
    @FXML Text author1Text;
    @FXML Text quote2Text;
    @FXML Text author2Text;
    @FXML Text quote3Text;
    @FXML Text author3Text;
    @FXML Text quote4Text;
    @FXML Text author4Text;
    @FXML AnchorPane rootPane;


    // TODO: Figure out how to display LATEST quote and change text, and keep updating it
    // TODO: addFavourite/removeButton functions

    public void addFavouriteButtonClicked() {

    }

    public void removeButtonClicked() {

    }

    public void homeButtonClicked() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("home.fxml"));
        rootPane.getChildren().setAll(pane);

    }

}
