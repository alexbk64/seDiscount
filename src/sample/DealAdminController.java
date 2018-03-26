package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DealAdminController {
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

    //Deal nDeal = new Deal(txtDealName.getText(),StartDate.getValue(),EndDate.getValue(),txtPromoCode.getText(),txtSummary.getText());
}
}
