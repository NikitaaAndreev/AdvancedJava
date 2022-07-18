package Polimorf;

public class Dog extends Animals {

    int nose;

    public Dog(String name, int age, int nose) {
        super(name, age);
        this.nose = nose;
    }

    public int getNose() {
        return nose;
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    @Override
    public void voice(){
        System.out.println("Гав");
    }
}
