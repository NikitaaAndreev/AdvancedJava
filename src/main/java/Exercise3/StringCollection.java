package Exercise3;

import java.awt.*;
import java.util.List;

public class StringCollection {
    public static void main(String[] args) {
        List<String> listOfStr = List.of("a1", "a4", "a3", "a2", "a1", "a4");

        System.out.println(getSortedValue(listOfStr));
        System.out.println(getAddValue(listOfStr));
        System.out.println(getInteger(listOfStr));
        System.out.println(getRemoveDublicete(listOfStr));
    }

    public static List<String> getSortedValue ( List<String> listOfStr ) {
         return listOfStr.stream().sorted().toList();
    }

    public static List<String> getAddValue ( List<String> listOfStr ) {
        return listOfStr.stream().map(a -> a + "_1").toList();
    }

    public static List<Integer> getInteger ( List<String> listOfStr) {
        return listOfStr.stream().map(a -> a.replace("a", "0")).mapToInt(num -> Integer.parseInt(num)).boxed().toList();
    }

    public static  List<String> getRemoveDublicete ( List<String> listOfStr) {
        return listOfStr.stream().sorted().distinct().toList();
    }
}
