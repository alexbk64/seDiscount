package sample;

import java.util.Date;
import java.util.List;

public class Deal  {


    private String name;
    private String summary;
    private List<String> reviews;
    private String promoCode;
    private Date validStart;
    private Date validEnd;

    public Deal(String name){
        this.name = name;
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

    public boolean expireDeal(Deal deal){
        Date currentDate = new Date();
        if(currentDate.compareTo(deal.getValidEnd())>0){
            return false; //currentDate after validEnd
        }else if(currentDate.compareTo(deal.getValidStart())<0){
            return false;//currentDate before validStart
        }else
            return true;

    }

    public void setValidEnd(Date validEnd) {
        this.validEnd = validEnd;
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
}
