package Comporator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.Comparator;

@Data
@AllArgsConstructor(staticName = "of")
public class Personal  {
    String name;
    int age;
    int salary;
    int ranked;
}
