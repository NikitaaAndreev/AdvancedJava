package Polimorf;

public class Mouse extends Animals{

    int head;

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public Mouse(String name, int age, int head) {
        super(name, age);
        this.head = head;
    }

    @Override
    public void voice() {
        System.out.println("Пищание");
    }
}
