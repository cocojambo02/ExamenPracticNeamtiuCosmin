package exercitiu1.controller;

import exercitiu1.model.Offerte;
import exercitiu1.repository.ReadWriteRepo;

import java.io.IOException;
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
}
