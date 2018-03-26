package sample;

import java.util.*;

public class Catalogue {

    private static Catalogue instance = new Catalogue();

    private static ArrayList<Establishment> establishmentList;

    private Catalogue() {
        establishmentList = new ArrayList<Establishment>();
    }

    public static Catalogue getInstance() {
        return instance;
    }

    public Establishment findEstablishmentByName(String name){
        for(Establishment est : establishmentList){
            if(est.getName().equals(name)){
                return est;
            }
        }
        throw new UnsupportedOperationException();
    }

    public void deleteEstablishment(String name){
        int count = 0;
        for(Establishment est : establishmentList){
            if(est.getName().equals(name)){

                return;
            }
        }
        throw new UnsupportedOperationException();
    }

    public void addEstablishment(String name, String description){
        //System.out.println("problem1");
        Establishment est = new Establishment(name, description);
        //System.out.println("problem2");
        establishmentList.add(est);
        //System.out.println("problem3");
    }
}
