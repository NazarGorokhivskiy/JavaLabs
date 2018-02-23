package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class StringProcessor {

    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        return br.readLine();
    }

    public String processText(String inputText) {
        String regexp = "\\w[\\s+\\.!?]";
        StringBuilder finalString = new StringBuilder(inputText); 
        
        Matcher matcher = Pattern.compile(regexp).matcher(inputText);
        
        while (matcher.find()) {
            String lastLetter = inputText.substring(matcher.start(), matcher.start() + 1);
            finalString.replace(matcher.start(), matcher.start() + 1, lastLetter.toUpperCase());
        }
        
        //firstly checks if string length isn't less that 2,
        //then, makes last letter upperCase
        if (finalString.length() <= 1) {
            return finalString.toString().toUpperCase();
        }
        
        int lastElementIndex = finalString.length() - 1;
        String lastSymbol = finalString.substring(lastElementIndex);
        finalString.replace(lastElementIndex, lastElementIndex + 1, lastSymbol.toUpperCase());
        
        
        return finalString.toString();
    }

    public void showResult(String resultText) {
        System.out.println("\nYour string:\n" + resultText);
    }

}
