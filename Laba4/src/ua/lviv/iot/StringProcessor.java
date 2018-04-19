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
        String regexp = "\\w+\\sN\\s\\d{2}\\.\\d{2}'\\d{2}\"\\sE\\s\\d{2}\\.\\d{2}'\\d{2}\"";
        StringBuilder finalString = new StringBuilder("");
        
        Matcher m = Pattern.compile(regexp).matcher(inputText);
        
        while (m.find()) {
            Matcher nameMatcher = Pattern.compile("\\w+\\s").matcher(m.group());
            nameMatcher.find();
            finalString.append(m.group().substring(nameMatcher.end()));
            finalString.append(" ");
        }

        
        return finalString.toString();
    }

    public void showResult(String resultText) {
        System.out.println("\nYour string:\n" + resultText);
    }

}
