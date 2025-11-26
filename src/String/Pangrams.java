package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Pangrams {

    public static void main(String[] args) {
        processString();
    }


    public static void processString(){

        //string should be lower case, remove spaces and puctutaions and it should be alphannumeric
        //hashmap wher key can be [a-zA-Z0-9]

        String s ="abc01 ? 23dea";
        s= s.replaceAll("[^a-zA-Z0-9]","").replaceAll("\\s+","").toLowerCase();
        LinkedHashMap<Character, Integer> resultMap = new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            resultMap.put(c,resultMap.getOrDefault(c,0)+1);
        }
        HashMap<Character, Integer> duplicates = new HashMap<>();

        for (Character c : resultMap.keySet()) {
            System.out.println(c +"--"+ resultMap.get(c));
        }




    }
}
