package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOfInt = List.of(1, 2, 1, 3, 4, 5, 5, 1);
        List<String> listOfStr = List.of("A", "B", "C", "A", "F");

        System.out.println(listOfInt);
        System.out.println(toSet(listOfInt));

        System.out.println(listOfStr);
        System.out.println(toSet(listOfStr));

        aboba();
    }

    private static void aboba(int ... a) {
        System.err.println("Size - " + a.length);
        for (int arrEl:
             a) {
            System.err.print(arrEl + " ");
        }
    }

    private static Set<?> toSet(Collection<?> collection) {
        return new HashSet<>(collection);
    }
}
