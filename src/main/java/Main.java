import exercitiu1.controller.Controller;
import exercitiu1.repository.ReadWriteRepo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ReadWriteRepo readWriteRepo = new ReadWriteRepo("C:\\personal\\an2\\map\\ExamenPracticNeamtiuCosmin\\src\\main\\java\\exercitiu1\\repository\\offerten.txt",
                "C:\\personal\\an2\\map\\ExamenPracticNeamtiuCosmin\\src\\main\\java\\exercitiu1\\repository\\offertensortiert.txt",
                "&");
        try {
            System.out.println(readWriteRepo.getAllOffers());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Controller controller = new Controller();
        System.out.println(controller.offersSortedDescendingByPrice());

        try {
            readWriteRepo.writeOffersToFile(controller.offersSortedDescendingByPrice());
        } catch (IOException e) {
            e.printStackTrace();
        }

        controller.statistic();
    }
}
