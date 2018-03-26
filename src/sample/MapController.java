package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.ButtonBar;


public class MapController {
    @FXML
    private Button drapersIcon;
    @FXML
    private Button btnSum;
    @FXML
    private Label lblSum;
    @FXML
    private ButtonBar summary;
    @FXML
    private Button btnReturn;

    public void draperSummary(javafx.event.ActionEvent actionEvent) throws Exception{
        summary.setVisible(true);
        //System.out.println("Success");

    }

    public void showDeal(javafx.event.ActionEvent actionEvent) throws Exception {
        System.out.print("Reached showdeal");
        Parent root = FXMLLoader.load(getClass().getResource("DealDisplay.fxml"));
        Scene nScene = new Scene(root);
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //primaryStage.hide();
        primaryStage.setScene(nScene);
        //primaryStage.show();
    }

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
