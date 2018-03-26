package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DealDisplayController {
    @FXML
    Button btnReturn;
    public void returnLogin(ActionEvent actionEvent) throws Exception {
        //System.out.print("Reached showdeal");
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene nScene = new Scene(root);
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //primaryStage.hide();
        primaryStage.setScene(nScene);
        //primaryStage.show();
    }
}
