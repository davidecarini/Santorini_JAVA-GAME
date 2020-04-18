package it.polimi.ingsw.Le_Bestie.View;

import it.polimi.ingsw.Le_Bestie.Network.Client.Client;
import it.polimi.ingsw.Le_Bestie.Network.Messages.C2S.SendUsername;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ModifyUsernameController {

    @FXML
    public Button btnSendCorrectedUsername;
    @FXML
    public TextField txtUsernameModified;

    public void pressSendCorrectedUsername(ActionEvent actionEvent) {
        String text= txtUsernameModified.getText();
        if(text.length()!=0){
            Client.getInstance().sendMessage(new SendUsername(text));

            Node source = (Node)  actionEvent.getSource();
            Stage stage  = (Stage) source.getScene().getWindow();
            stage.close();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Modify Username");
            alert.setHeaderText(null);
            alert.setContentText("Empty Username");

            alert.showAndWait();
        }
    }
}
