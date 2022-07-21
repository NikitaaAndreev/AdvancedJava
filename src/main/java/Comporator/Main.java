package Comporator;

import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Personal> personals = new ArrayList<>(List.of(
                Personal.of("Вася", 25, 140000, 18),
                Personal.of("Дима", 28, 80000, 10),
                Personal.of("Женя", 35, 150000, 20),
                Personal.of("Гоша", 38, 200000, 24),
                Personal.of("Ваня", 34, 65000, 8),
                Personal.of("Петя", 45, 90000, 12)

        ));

        Comparator<Personal> comparatorByAge = Comparator.comparing(Personal -> Personal.getAge());
        Comparator<Personal> comparatorBySalary = (o1, o2) -> new CompareToBuilder().append(o1.getSalary(), o2.getSalary()).toComparison();
        Comparator<Personal> comparatorByRanked = (o1, o2) -> new CompareToBuilder().append(o1.getRanked(), o2.getRanked()).toComparison();
        Comparator<Personal> comparatorByName = (o1, o2) -> new CompareToBuilder().append(o1.getName(), o2.getName()).toComparison();

        List<Personal> getSalary = personals.stream().filter( a -> a.getSalary() > 100000).collect(Collectors.toList());

        int getSumSalary = personals.stream().mapToInt(a -> a.getSalary()).sum();
        List<Integer> getListSalary = personals.stream().map(Personal::getSalary).toList();
        List<String> getNames = personals.stream().map(Personal::getName).toList();


        System.out.println(getListSalary);
        System.out.println(getNames);

        personals.sort(comparatorByAge);
        System.out.println(personals);

        personals.sort(comparatorBySalary);
        System.out.println(personals);

        personals.sort(comparatorByRanked);
        System.out.println(personals);

        personals.sort(comparatorByName);
        System.out.println(getSalary);

        System.out.println(getSumSalary);
    }

}
