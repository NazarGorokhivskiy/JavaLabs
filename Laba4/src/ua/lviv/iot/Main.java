package ua.lviv.iot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        String finalStr = "";
      
        try {
            finalStr = stringProcessor.readInputText();
        } catch(IOException e) {
            e.printStackTrace();
        }

        finalStr = stringProcessor.processText(finalStr);

        stringProcessor.showResult(finalStr);
    }
}
