package NumbersTwo;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        System.out.println(numbers(a));
    }

    public static int numbers(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += StringUtils.countMatches(String.valueOf(i), "2");
        }
        return count;
    }
}
