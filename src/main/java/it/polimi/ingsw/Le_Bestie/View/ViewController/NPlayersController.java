package it.polimi.ingsw.Le_Bestie.View.ViewController;

import it.polimi.ingsw.Le_Bestie.Network.Client.Client;
import it.polimi.ingsw.Le_Bestie.Network.Messages.C2S.SendNumPlayers;
import it.polimi.ingsw.Le_Bestie.View.GUIController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *this class is used to manage and display window associated to the n players choice
 * @author Davide Carini
 */

public class NPlayersController {

    @FXML
    public AnchorPane playersPane;
    @FXML
    public RadioButton rdb2P;
    @FXML
    public ToggleGroup grpToggle;
    @FXML
    public RadioButton rdb3P;

    /**
     * initialize the NPlayers controller in the instance of the GUI controller
     */
    public void initialize() { GUIController.getInstance().setNPlayersController(this); }

    /**
     * this method is called when the button is pressed and controls that one of the two radio button in the toggle is selected
     * @param actionEvent
     */
    public void pressSendNumPlayers(ActionEvent actionEvent) {
        if(rdb2P.isSelected()||rdb3P.isSelected()){
            Client.getInstance().sendMessage(new SendNumPlayers(Integer.parseInt(grpToggle.getSelectedToggle().getUserData().toString())));
            GUIController.getInstance().setScene(playersPane.getScene(),"/fxml/LobbyStage.fxml");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Number of players");
            alert.setHeaderText(null);
            alert.setContentText("The number of players must be 2 or 3");
            alert.showAndWait();
        }
    }

    /**
     * this method closes the window. this method is called from the GUI controller
     */
    public void close(){
        if(playersPane.getScene()!=null) {
            Stage stage = (Stage) playersPane.getScene().getWindow();
            stage.close();
        }
    }
}
