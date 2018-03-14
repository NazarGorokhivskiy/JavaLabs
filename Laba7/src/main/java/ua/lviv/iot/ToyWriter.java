package ua.lviv.iot;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ToyWriter {
    public void writeToFile(List<Toy> toys) {
        try (PrintWriter writer = new PrintWriter("file.csv")) {

            for (Toy toy: toys) {
                writer.println(toy.toCSV());
                writer.println(toy.getHeaders());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
