package PracticeImpDSA;

import java.util.HashSet;
import java.util.TreeMap;

public class Pangrams {

    // A string or sentence is known as Pangram if it covers all the 26 characters of Alphabet
    // Use a set and check if length == 26
    // You can use Map to read a string and store the number of occurence of each character, length should be == 26


    public static void main(String[] args) {
    //check pangram using set, if size == 26 then true else false
//        pangramCheckSet();

     //check pangram and retunr the repetitions using TreeMap
//        pangramCheckAndCount();

     //check the characters missing in the pangram
        pangramGiveMissingCharacters();
    }

    public static void pangramCheckSet() {
        String s = "We promptly judged antique ivory buckles for the next prize";
        HashSet<Character> ct = new HashSet<>();
        s = s.toLowerCase().replaceAll("\\s+", "");

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                ct.add(c);
            }
        }

        String result = ct.size() == 26 ? "Pangram" : "Not Pangram";
        System.out.println(result);
    }


    public static void pangramCheckAndCount() {
        String s = "We promptly judged antique ivory buckles for the next prize";
       TreeMap<Character, Integer> tMap = new TreeMap<>();
        s = s.toLowerCase().replaceAll("\\s+", "");

        for (char c : s.toCharArray()) {
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }

        String result = tMap.size() == 26 ? "Pangram" : "Not Pangram";
        System.out.println(result);

        for(char c : tMap.keySet()){
            System.out.println(c +"-->"+tMap.get(c));
        }
    }


    public static void pangramGiveMissingCharacters() {
        String s = "We promptly judged ntique ivory buckles for the next prize";
        HashSet<Character> ct = new HashSet<>();
        s = s.toLowerCase().replaceAll("\\s+", "");

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                ct.add(c);
            }
        }

        StringBuilder st = new StringBuilder();
        if(ct.size()!=26){
            for (char start= 'a';start<='z';start++){
                if(!ct.contains(start))
                    st.append(start);
            }
        }

        System.out.println(st);
    }
}
