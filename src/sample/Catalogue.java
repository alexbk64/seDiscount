package sample;

import java.util.List;

public class Catalogue {

    private static Catalogue instance = new Catalogue();
    private static List<Establishment> establishmentList;

    public static Catalogue getInstance() {
        return instance;
    }

    private Catalogue() {

    }

    public static Establishment findEstablishmentByName(String name){
        for(Establishment est : establishmentList){
            if(est.getName().equals(name)){
                return est;
            }
        }
        throw new UnsupportedOperationException();
    }





}
