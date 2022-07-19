package SortChar;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scan.nextLine();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(!hashMap.containsKey(c)){
                hashMap.put(c,1);
            }else {
                Integer integer = hashMap.get(c);
                integer++;
                hashMap.put(c,integer);
            }
        }
        System.out.println(hashMap);
    }
}
