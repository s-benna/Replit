package for_While;
/*
    (ENG)   Write java code checking the number is Perfect number or not.
            Any number can be a Java Perfect Number if the sum of its positive divisors excluding
            the number itself is equal to that number.

    (TR)    Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
            Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
            sayı Mükemmel Sayı olarak bilinir.

            Input :6
            Output:6 is Perfect Number

            Input :7
            Output:7 is not Perfect Number
 */
import java.util.Scanner;

public class For_While07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPerfectNumber(num)) {
            System.out.println(num + " is Perfect Number");
        } else {
            System.out.println(num + " is not Perfect Number");
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
