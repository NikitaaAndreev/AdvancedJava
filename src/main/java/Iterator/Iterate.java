package Iterator;

import java.util.Iterator;

public class Iterate {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 2, 3, 12, 54, 765, 234, 234, 654, 23, 21};

        Iterator<Integer> iterator = new Iterator<>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return arr.length > i;
            }

            @Override
            public Integer next() {
                return arr[i++];
            }
        };

        iterator.forEachRemaining(System.out::println);
    }
}

