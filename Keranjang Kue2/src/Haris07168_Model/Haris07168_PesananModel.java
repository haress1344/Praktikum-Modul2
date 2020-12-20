package Haris07168_Model;

import Haris07168_Entity.*;
import java.util.ArrayList;

/**
 *
 * @author Haress
 */
public class Haris07168_PesananModel implements Haris07168_KeranjangInterface {

    private ArrayList<Haris07168_Datakue> Datakue;
    private ArrayList<Haris07168_Hargakue> Hargakue;
    
    public Haris07168_PesananModel() {
        Datakue = new ArrayList();
        Hargakue = new ArrayList();
    }

    public void insert_data(Haris07168_Datakue kue) {
        Datakue.add(kue);
    }

    @Override
    public ArrayList<Haris07168_Datakue> getDatakue() {
        return Datakue;
    }
    @Override
    public ArrayList<Haris07168_Hargakue> getHargakue(){
        return Hargakue;
    }

}
