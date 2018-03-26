package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField txtUname;
    @FXML
    private PasswordField txtPwd;
    @FXML
    private Label lgnFail;

    public void btnLogin(javafx.event.ActionEvent actionEvent) throws Exception {
        if(txtUname.getText().equals("user") && txtPwd.getText().equals("123")) {
           Parent root = FXMLLoader.load(getClass().getResource("Map.fxml"));
           Scene nScene = new Scene(root);
           Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
           //primaryStage.hide();
           primaryStage.setScene(nScene);
           //primaryStage.show();
        }
        else if(txtUname.getText().equals("estab") && txtPwd.getText().equals("456")) {
            Parent root = FXMLLoader.load(getClass().getResource("DealAdmin.fxml"));
            Scene nScene = new Scene(root);
            Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            //primaryStage.hide();
            primaryStage.setScene(nScene);
            //primaryStage.show();
        }
        else {
            lgnFail.setVisible(true);
            //System.out.print("Failed");
        }
    }
}
