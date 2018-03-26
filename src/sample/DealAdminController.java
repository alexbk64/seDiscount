package sample;

import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;

public class DealAdminController {
    @FXML
    Button btnLoginP;
    @FXML
    TextField txtEstabName;
    @FXML
    TextField txtDealName;
    @FXML
    DatePicker StartDate;
    @FXML
    DatePicker EndDate;
    @FXML
    TextArea txtSummary;
    @FXML
    TextField txtPromoCode;
    @FXML
    CheckBox chkNewEstab;
    @FXML
    AnchorPane addEstabPop;
    @FXML
    TextField txtAddEstabName;
    @FXML
    TextField txtAddEstabDesc;
    @FXML
    Button loadDeals;
    @FXML
    AnchorPane loadPop;
    @FXML
    TextField loadName;
    @FXML
    Button findDeals;
    //ArrayList<Text> descs = new ArrayList<Text>();
    @FXML
    Text desc1, desc2, desc3, desc4, desc5, desc6, desc7, desc8;
    //ArrayList<Button> btns = new ArrayList<Button>();
    @FXML
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;


    public void btnSubmitDeal(ActionEvent actionEvent) throws IOException {
    if(chkNewEstab.isSelected()) {
        addNewEstab();
        chkNewEstab.setSelected(false);
        return;}
    LocalDate sDate = StartDate.getValue();
    Calendar c1 = Calendar.getInstance();
    c1.set(sDate.getYear(),sDate.getMonthValue()-1,sDate.getDayOfMonth());
    Date start = c1.getTime();
    //System.out.println(c1.getTime());
    LocalDate eDate = EndDate.getValue();
    Calendar c2 = Calendar.getInstance();
    //System.out.println(c2.getTime());
    c2.set(eDate.getYear(),eDate.getMonthValue()-1,eDate.getDayOfMonth());
    Date end = c2.getTime();

    Deal nDeal = new Deal(txtDealName.getText(),start,end,txtPromoCode.getText(),txtSummary.getText(),txtEstabName.getText());
        File f = new File("src/test/"+txtDealName.getText()+".txt");
        if(f.exists()){
        PrintWriter outputStream = new PrintWriter("src/test/"+txtDealName.getText()+".txt","UTF-8");
        outputStream.println(txtDealName.getText());
        outputStream.println(txtSummary.getText());
        outputStream.println(txtPromoCode.getText());
        outputStream.println(start);
        outputStream.println(end);
        outputStream.close(); }
        else {
            File newF = new File("src/test/"+txtDealName.getText()+".txt");
            newF.createNewFile();
            PrintWriter outputStream = new PrintWriter("src/test/"+txtDealName.getText()+".txt","UTF-8");
            outputStream.println(txtDealName.getText());
            outputStream.println(txtSummary.getText());
            outputStream.println(txtPromoCode.getText());
            outputStream.println(start);
            outputStream.println(end);
            outputStream.close();
        }
    System.out.println("Submitted");
    }

    public void addNewEstab(){
        addEstabPop.setVisible(true);
    }

    public void submitNewEstab(ActionEvent actionEvent) throws IOException{
        //System.out.println("REached");
        Catalogue cat = Catalogue.getInstance();
        //System.out.println("REached2");
        cat.addEstablishment(txtAddEstabName.getText(), txtAddEstabDesc.getText());
        //System.out.println("REached4");
        addEstabPop.setVisible(false);
        //System.out.println("REached5");
    }

    public void btnLoadDeals(){
        loadPop.setVisible(true);
    }

    public void btnFindDeals(){
        loadPop.setVisible(false);
        Catalogue cat = Catalogue.getInstance();
        Establishment est = cat.findEstablishmentByName(loadName.getText());
        ArrayList<Deal> deals = est.getDeals();
        if(deals.size()>0){
            int x =0;
            for(Deal d: deals) {
                x = deals.indexOf(d);
                switch (x+1) {
                    case 1:
                        desc1.setText(d.getName());
                        break;
                    case 2:
                        desc2.setText(d.getName());
                        break;
                    case 3:
                        desc3.setText(d.getName());
                        break;
                    case 4:
                        desc4.setText(d.getName());
                        break;
                    case 5:
                        desc5.setText(d.getName());
                        break;
                    case 6:
                        desc6.setText(d.getName());
                        break;
                    case 7:
                        desc7.setText(d.getName());
                        break;
                    case 8:
                        desc8.setText(d.getName());
                        break;
                }
            }
        }
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
