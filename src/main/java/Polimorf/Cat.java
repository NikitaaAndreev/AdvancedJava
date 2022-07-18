package Polimorf;

public class Cat extends Animals {

    int tail;

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public Cat(String name, int age, int tail) {
        super(name, age);
        this.tail = tail;
    }

    @Override
    public void voice(){
        System.out.println("Мяу");
    }

}
