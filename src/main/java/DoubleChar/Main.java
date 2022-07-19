package DoubleChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void maxValue(String str) {

        LinkedHashMap<Character, Integer> hash = new LinkedHashMap();
        for(int i = 0; i < str.length();i++) {
            char ch = str.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch, (hash.get(ch)+1));
            } else {
                hash.put(ch, 1);
            }
        }

        Map.Entry<Character, Integer> maxEntry = null;
        for(Map.Entry<Character,Integer> entry : hash.entrySet())
        {
            if(maxEntry == null) {
                maxEntry = entry;
            } else if(maxEntry.getValue() < entry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey());


    }
    public static void main(String[] args) {
        maxValue("dfdfsdsgrtetreaaaa");
    }
}
