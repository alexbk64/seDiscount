package sample;

import java.util.*;

public class Establishment {
    private ArrayList<Deal> deals;
    private String name;
    private String description;
    private boolean verified;

    public Establishment(String name,String description) {
        this.name = name;
        this.description = description;
        this.deals = new ArrayList<Deal>();
    }

    public void updateDealSummary(String summary, Deal deal){
        for(Deal name : deals){
            if(name.getName().equals(deal.getName())){
                name.setSummary(summary);
            }
        }

    }
    public void addDeal(Deal deal){
        deals.add(deal);

    }
    public void removeDeal(Deal deal){
        deals.remove(deal);
    }
    public Deal searchDeal(String name){
        for(Deal deal : deals){
            if(deal.getName().equals(name)){
                return deal;
            }
        }
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }
}
