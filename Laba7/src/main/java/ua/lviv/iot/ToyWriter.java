package ua.lviv.iot;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyWriter {
    public void writeToFile(List<Toy> toys) {
        try {
            FileWriter fileWriter = new FileWriter("file.csv");
            FileWriter headersFileWritter = new FileWriter("headersFile.csv");
            for (Toy toy: toys) {
                fileWriter.write(toy.toCSV());
                headersFileWritter.write(toy.getHeaders());
            }
            fileWriter.close();
            headersFileWritter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
