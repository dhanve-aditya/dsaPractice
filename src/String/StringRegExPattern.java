package String;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// INterview Questions
// 1. find duplicate words
// 2. find ip address
// 3. Validate date

class StringRegExPattern {

    /**
     * regex meta characters
     * . > any character except new line
     * \d > digit 0-9
     * \D > non-digit
     * \w > word char (a-zA-Z0-9_)
     * \W > non-word characters (special characters)
     * \s > whitespaces and tabs
     * \S > non - space
     * + > 1 or more
     * > 0 or more
     * ? > 0 or 1
     * {n,m} > range > e,g, \d{2} [2 digits]
     * [] > character class > [a-z]
     * () > grouping e.g.(ab)+ > pattern ab, abab...
     * ` ` > OR
     * ^ > start of string
     * $ > end of string
     */

    public static void main(String[] args) {
//        regexMethods();

        matcherAndPattern();
    }

    // Hi myname is'123 Aditya45671Dhanve
    // Hi my name is Aditya Dhanve 45794

    public static void regexMethods() {
        String input = "123Aditoya123";

        //matches() > macthes the whole string
        // for partial match use find() with matcher
        //email@asfk.com

        String email = "dhanve.aditya@outlook.in";
        String phoneNumer = "9664020858";
        System.out.println("email check " + email.matches("[a-zA-Z0-9._]+@[a-z]+[.]\\D+"));
        System.out.println("phone check " + phoneNumer.matches("\\d{10}"));


        System.out.println(input.matches("\\w+"));

        // replaceAll()
        String replacedAll = input.replaceAll("\\d", "");
        System.out.println(replacedAll);
        System.out.println(input);
        //split()
        String splitMe = "123:4567;8080,93";
        String[] splitDone = splitMe.split("\\W+");
        System.out.println(splitDone.length);
        System.out.println(Arrays.toString(splitDone));
    }

    /**
     * use the pattern class and matcher class
     */
    public static void matcherAndPattern() {
        String inputString = "input@123.omo78";

        String inputString2 = "12456";

        Matcher mtr = Pattern.compile("\\d+").matcher(inputString2);

        Matcher mtr2 = Pattern.compile("\\d+").matcher(inputString);
        int count
                = 1;
        while (mtr2.find()) {
            System.out.println(count);
            System.out.println(mtr2.group());
            count++;
        }

        System.out.println(mtr.matches());

    }


}
