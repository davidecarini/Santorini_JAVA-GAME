package it.polimi.ingsw.Le_Bestie.View.ViewController;

import it.polimi.ingsw.Le_Bestie.View.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class LostController {
    @FXML
    AnchorPane lostPane;


    public void pressRejoin(ActionEvent actionEvent) {
        Stage stage = (Stage) lostPane.getScene().getWindow();
        stage.close();
        Stage connectionMenu= new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/fxml/ConnectionStage.fxml"));
        }
        catch (Exception e){

        }
        Scene scene = new Scene(root);
        connectionMenu.setTitle("MENU");
        connectionMenu.setScene(scene);
        connectionMenu.setResizable(false);
        connectionMenu.show();
    }


    public void pressQuit(ActionEvent actionEvent) {
        System.exit(0);
    }
}