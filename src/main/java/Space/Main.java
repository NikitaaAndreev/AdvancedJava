package Space;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        space(str);
    }

    public static void space(String str) {
        String word = str.replaceAll(" {2,}"," ");
        str = word;
        System.out.println(str);
    }
}

