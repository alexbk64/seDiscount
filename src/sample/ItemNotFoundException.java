package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException() {
        super();
        /*//System.out.print("Reached showdeal");
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene nScene = new Scene(root);
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //primaryStage.hide();
        primaryStage.setScene(nScene);
        //primaryStage.show();*/
    }
}
