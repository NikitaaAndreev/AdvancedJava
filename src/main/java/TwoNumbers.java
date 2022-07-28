import java.util.Scanner;

public class TwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        int n = scan.nextInt();
//        System.out.println(num(n));
        String b = scan.nextLine();
        System.out.println(nums(b));

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

    public static int nums(String str) {
        int count = 0;
        char [] numsChar = str.toCharArray();
        for(char i : numsChar) {
            if(i == '2'){
                count++;
            }
        }
        return count;
    }

}
