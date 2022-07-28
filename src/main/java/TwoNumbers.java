import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(num(n));

    }

    public static int num(int n) {
        int count = 0;
        while (n > 0) {
            if ((n % 10) == 2)
                count ++;
            n /=10;
        }
        System.out.println(count);

        return count;
    }

}
