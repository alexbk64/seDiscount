package sample;

import java.util.*;
import java.util.Date;
import java.util.List;

public class Deal {

    Catalogue cat = Catalogue.getInstance();
    private String name;
    private String summary;
    private List<String> reviews;
    private String promoCode;
    private Date validStart;
    private Date validEnd;
    private boolean valid;

    public Deal(String name, Date sDate, Date eDate, String pCode, String summary, String estab){
        this.name = name;
        this.summary = summary;
        promoCode = pCode;
        validStart = sDate;
        validEnd = eDate;
        expireDeal(this);
        Establishment est = cat.findEstablishmentByName(estab);
        est.addDeal(this);
    }

    public void expireDeal(Deal deal){
        Date currentDate = new Date();
        if(currentDate.compareTo(deal.getValidEnd())>0){
            this.valid = false;
            return ; //currentDate after validEnd
        }else if(currentDate.compareTo(deal.getValidStart())<0){
            this.valid = false;
            return;//currentDate before validStart
        }else {
            this.valid = true;
            return;
        }


    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public Date getValidEnd() {
        return validEnd;
    }

    public Date getValidStart() {
        return validStart;
    }

    public void setValidStart(Date validStart) {
        this.validStart = validStart;
    }

    public void setValidEnd(Date validEnd) {
        this.validEnd = validEnd;
    }

}
