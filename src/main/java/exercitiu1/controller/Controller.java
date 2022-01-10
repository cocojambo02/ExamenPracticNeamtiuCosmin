package exercitiu1.controller;

import exercitiu1.model.Offerte;
import exercitiu1.model.Ort;
import exercitiu1.repository.ReadWriteRepo;
import org.javatuples.Pair;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    ReadWriteRepo repository = new ReadWriteRepo("C:\\personal\\an2\\map\\ExamenPracticNeamtiuCosmin\\src\\main\\java\\exercitiu1\\repository\\offerten.txt",
            "C:\\personal\\an2\\map\\ExamenPracticNeamtiuCosmin\\src\\main\\java\\exercitiu1\\repository\\offertensortiert.txt",
            "&");

    public List<Offerte> offersSortedDescendingByPrice(){
        List<Offerte> sortThisList;
        try {
            sortThisList = repository.getAllOffers();
            Collections.sort(sortThisList);
            Collections.reverse(sortThisList);

            return sortThisList;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void statistic(){
        Pair<Ort, Integer> thurgau = new Pair<>(Ort.valueOf("Thurgau"), 0);
        Pair<Ort, Integer> zurich = new Pair<>(Ort.valueOf("Zürich"), 0);
        Pair<Ort, Integer> stGallen = new Pair<>(Ort.valueOf("StGallen"), 0);


        try {
            List<Offerte> allOffers = repository.getAllOffers();
            for(Offerte offerte : allOffers){
                if(offerte.getOrt() == thurgau.getValue0()){
                    thurgau = thurgau.setAt1(thurgau.getValue1() + offerte.getPrice());
                }
                if(offerte.getOrt() == zurich.getValue0()){
                    zurich = zurich.setAt1(zurich.getValue1() + offerte.getPrice());
                }
                if(offerte.getOrt() == Ort.StGallen){
                    stGallen = stGallen.setAt1(stGallen.getValue1() + offerte.getPrice());
                }
            }

            List<Pair<Ort, Integer>> myTuples = new ArrayList<>();
            myTuples.add(thurgau);
            myTuples.add(zurich);
            myTuples.add(stGallen);

            myTuples.sort((place1, place2) -> {
                if (place1.getValue1() > place2.getValue1()) {
                    return -1;
                } else if (place1.getValue1().equals(place2.getValue1())) {
                    return 0; // You can change this to make it then look at the
                    //words alphabetical order
                } else {
                    return 1;
                }
            });


            System.out.println(myTuples);


            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\personal\\an2\\map\\ExamenPracticNeamtiuCosmin\\src\\main\\java\\exercitiu1\\repository\\ statistik.txt"));

            for(Pair<Ort, Integer> tuple : myTuples){
                String line = tuple.getValue0() + ": " + tuple.getValue1();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
