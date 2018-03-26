package sample;

import java.util.List;

public class Catalogue {

    private static Catalogue instance = new Catalogue();

    private static List<Establishment> establishmentList;

    private Catalogue() {

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
        Establishment est = new Establishment(name, description);
        establishmentList.add(est);
    }
}
