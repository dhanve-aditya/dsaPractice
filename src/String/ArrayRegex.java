package String;

import java.io.*;
import java.util.*;

public class ArrayRegex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);


        MyRegex myR = new MyRegex();
        while (sc.hasNextLine()) {
            System.out.println(myR.checkIp(sc.nextLine().trim()));
        }
        sc.close();
    }

}


class MyRegex {

    public String checkIp(String s) {
        for (String porC : s.split("\\.")) {
            if (s.length() == 4)
                if (porC.matches("\\d{3}"))
                    if (Integer.parseInt(porC) > 0 && Integer.parseInt(porC) <= 255)
                        return "true";
        }
        return "false";
    }
}