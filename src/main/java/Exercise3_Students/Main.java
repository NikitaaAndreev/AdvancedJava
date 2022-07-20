package Exercise3_Students;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        List<Students> allStudents = List.of(
                Students.of("Вася", 25, "man"),
                Students.of("Петя", 23, "man"),
                Students.of("Елена", 42, "woman"),
                Students.of("Дима", 62, "man"),
                Students.of("Анна", 58, "woman"),
                Students.of("Жора", 58, "man")
        );

        System.out.println(getMenFrom18to27(allStudents));
        System.out.println(getWorkForceFrom55and60(allStudents));
    }

    public static List<Students> getMenFrom18to27(final List<Students> allStudents) {
            return allStudents.stream()
                    .filter(a -> a.getGender().equals("man"))
                    .filter(a -> a.getAge() >= 18 && a.getAge() <= 27)
                    .toList();
    }

    public static long getWorkForceFrom55and60(final List<Students> allStudents) {
//        return allStudents.stream()
//                .filter(a -> a.getGender().equals("woman") && a.getAge() < 55)
//                .filter(a -> a.getGender().equals("man") && a.getAge() < 60 )
//                .toList();
        long count = allStudents.stream().filter(a -> (a.getGender().equals("man") && a.getAge() < 60) || (a.getGender().equals("woman") && a.getAge() < 55))
                //.filter(a -> a.getGender().equals("woman") && a.getAge() < 55)
                .count();

        return count;
    }
}
