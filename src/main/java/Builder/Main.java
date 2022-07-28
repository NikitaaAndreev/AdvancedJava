package Builder;

public class Main {
    public static void main(String[] args) {
        Person newPerson = new Person.Builder().withAge(14).withName("Vasya").withSurname("ivanov").withHeight(182).build();
        System.out.println(newPerson);
    }
}
