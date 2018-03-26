package sample;

import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;

public class DealAdminController {
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
    @FXML
    Text desc1, desc2, desc3, desc4, desc5, desc6, desc7, desc8;


    public void btnSubmitDeal(ActionEvent actionEvent){
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
    System.out.println("Submitted");
    }

    public void addNewEstab(){
        addEstabPop.setVisible(true);
    }

    public void submitNewEstab(ActionEvent actionEvent){
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

    }
}
