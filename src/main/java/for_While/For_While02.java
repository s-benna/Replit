package for_While;

import java.util.Scanner;

/*
        Ask the user to enter 2 integers and then find
        the GCD (Greatest Common Divider)[EBOB] and LCM (Least Common Multiple)[EKOK].

        Input:
        30
        40

        Expected Output:
        GCD = 10 for 30 and 40
        LCM for 30 and 40 = 120

 */
public class For_While02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Tamsayi giriniz: ");
        int num1 = input.nextInt();

        System.out.print("Farkli tamsayi giriniz: ");
        int num2 = input.nextInt();

        int gcd = calucationGCD(num1, num2);
        int lcm = calucationLCM(num1, num2, gcd);

        System.out.println("GCD= "+gcd+" for "+num1+" and "+num2);
        System.out.println("LCM= "+lcm+" for "+num1+" and "+num2);

    }
    public static int calucationGCD(int a, int b){
        if (b==0){
            return a;
        }
        if (a==0){
            return b;
        }
        return calucationGCD(b, b%a);
    }

    public static int calucationLCM(int a, int b, int gcd){
        return (a*b)/gcd;
    }

}
