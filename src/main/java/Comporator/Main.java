package Comporator;

import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personal> personals = new java.util.ArrayList<>(List.of(
                Personal.of("Вася", 25, 140000, 18),
                Personal.of("Дима", 28, 80000, 10),
                Personal.of("Женя", 35, 150000, 20),
                Personal.of("Гоша", 38, 200000, 24),
                Personal.of("Ваня", 34, 65000, 8),
                Personal.of("Петя", 45, 90000, 12)

        ));

        Comparator<Personal> comparatorByAge = (o1, o2) -> new CompareToBuilder().append(o1.getAge(), o2.getAge()).toComparison();
        Comparator<Personal> comparatorBySalary = (o1, o2) -> new CompareToBuilder().append(o1.getSalary(), o2.getSalary()).toComparison();
        Comparator<Personal> comparatorByRanked = (o1, o2) -> new CompareToBuilder().append(o1.getRanked(), o2.getRanked()).toComparison();

        personals.sort(comparatorByAge);
        System.out.println(personals);

        personals.sort(comparatorBySalary);
        System.out.println(personals);

        personals.sort(comparatorByRanked);
        System.out.println(personals);

    }

}
