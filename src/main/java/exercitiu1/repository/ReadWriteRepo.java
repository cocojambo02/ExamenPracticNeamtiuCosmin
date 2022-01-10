package exercitiu1.repository;

import exercitiu1.model.Offerte;
import exercitiu1.model.Ort;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadWriteRepo {

    private final String readFrom;
    private final String separator;
    private final String writeTo;

    public ReadWriteRepo(String fileName, String writeTo, String separator) {
        this.readFrom = fileName;
        this.separator = separator;
        this.writeTo = writeTo;
    }

    public List<Offerte> getAllOffers() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(readFrom));
        String line = bufferedReader.readLine();
        List<Offerte> answer = new ArrayList<>();
        while(line != null){
            List<String> attributes = new ArrayList<>(Arrays.asList(line.split(separator)));
            Offerte newOffer = new Offerte(Integer.parseInt(attributes.get(0)),
                                           attributes.get(1),
                                           Integer.parseInt(attributes.get(2)),
                                           Double.parseDouble(attributes.get(3)),
                                           attributes.get(4),
                                           Ort.valueOf(attributes.get(5)));
            answer.add(newOffer);
            line = bufferedReader.readLine();
        }

        return answer;
    }
    public void writeOffersToFile(List<Offerte> liste) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeTo));
        for (Offerte offerte : liste) {

            String line = offerte.getId() + this.separator +
                    offerte.getUnternahmensname() + this.separator +
                    offerte.getPrice() + this.separator +
                    offerte.getMehrwertsteuer() + this.separator +
                    offerte.getAdresse() + this.separator +
                    offerte.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
