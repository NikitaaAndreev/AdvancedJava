package Exercise3_Students;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "of")
public class Students {
    String name;
    int age;
    String gender;
}
