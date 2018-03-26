package sample;

import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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

public void btnSubmitDeal(ActionEvent actionEvent){
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
}
}
