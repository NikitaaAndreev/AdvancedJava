package Comporator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.Comparator;

@Data
@AllArgsConstructor(staticName = "of")
public class Personal {
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", ranked=" + ranked;
    }

    String name;
    int age;
    int salary;
    int ranked;

}
