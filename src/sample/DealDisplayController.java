package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.*;

public class DealDisplayController {
    @FXML
    Button btnReturn;
    @FXML
    TextField txtEstabName;
    @FXML
    TextField txtEstabDesc;
    @FXML
    ImageView imgEstabLogo;
    @FXML
    AnchorPane anchDeal;
    @FXML
    AnchorPane anchDealList;
    @FXML
    Button btnShowDeals;
    @FXML
    Button btnRedeem;
    Deal crtDeal;
    @FXML
    Label l1;
    @FXML
    Label l2;
    @FXML
    Button viewDrink;
    @FXML
    Button viewFood;
    @FXML
    TextArea taView;

    public void returnLogin(ActionEvent actionEvent) throws Exception {
        //System.out.print("Reached showdeal");
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene nScene = new Scene(root);
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //primaryStage.hide();
        primaryStage.setScene(nScene);
        //primaryStage.show();
    }

    public void displayAll(ActionEvent actionEvent) throws Exception {
        l1.setText("drink");
        viewDrink.setVisible(true);
        l2.setText("food");
        viewFood.setVisible(true);
    }

    public void viewDrinkDeal() throws IOException{
        taView.setText("");
        BufferedReader inStream = new BufferedReader(new FileReader("src/test/drink.txt"));
        String d = "";
        for(int i=1;i<=5;i++) {d += inStream.readLine() + "\n";}
        inStream.close();
        taView.setText(d);
    }

    public void viewFoodDeal()throws IOException{
        taView.setText("");
        BufferedReader inStream = new BufferedReader(new FileReader("src/test/food.txt"));
        String d = "";
        for(int i=1;i<=5;i++) {d += inStream.readLine() + "\n";}
        inStream.close();
        taView.setText(d);
    }

    public void redeemDeal(ActionEvent actionEvent) throws Exception {
        Catalogue cat = Catalogue.getInstance();
        Establishment est = cat.findEstablishmentByName("test");
        if(taView.getText().startsWith("drink")){
            Deal d = est.searchDeal("drink");
            if(!(d == null)){
            d.redeem();
            est.removeDeal(d); }
        }
        else{
            Deal d = est.searchDeal("food");
            if(!(d == null)){
            d.redeem();
            est.removeDeal(d); }
        }
    }

}