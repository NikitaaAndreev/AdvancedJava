package Space;

public class Main {

    public static void main(String[] args) {
        space("Hello  world    man person");
    }

    public static void space(String str) {
            String word = str.replaceAll(" {2,}"," ");
            str = word;
        System.out.println(str);
    }
}
