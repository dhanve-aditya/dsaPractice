package InterviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeloitteInterview {
    public static void main(String[] args) {
        String s = "Hi, myname i57s Aditya1200Dhanve";
        processString(s);
    }

    public static void processString(String inputString) {
        Matcher m1 = Pattern.compile("\\d+").matcher(inputString);
        int sumResult = 0;
        while (m1.find()) {
            sumResult += Integer.parseInt(m1.group());
        }
        System.out.println(sumResult);
        String cleaned = inputString.replaceAll("\\d+","").replaceAll("\\s+"," ");

        String name = inputString.replaceAll("$","");



    }


}
