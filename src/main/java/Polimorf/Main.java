package Polimorf;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Kit ", 21, 9);
        cat.voice();
        System.out.println(cat.getName() + cat.getAge() + " " + cat.getTail());

        Dog dog = new Dog("Sobaka ", 58, 3);
        dog.voice();
        System.out.println(dog.getName() + dog.getAge() + " " + dog.getNose());

        Mouse mouse = new Mouse("Jerry ", 19, 2);
        mouse.voice();
        System.out.println(mouse.getName() + mouse.getAge()+ " " + mouse.getHead());
    }
}
