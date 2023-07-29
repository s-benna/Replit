package if_Switch;

import java.util.Scanner;

public class Solution_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yili giriniz.");
        int yil = sc.nextInt();

        System.out.println("Ayi giriniz.");
        int num = sc.nextInt();


        if (yil%400==0 || (yil%4==0 && yil%100 !=0)  && num == 2 ){
            System.out.println("February "+ yil+ " is 29 days.");
        }else if (yil%4 !=0 && num==2){
            System.out.println("February "+ yil+ " is 28 days.");
        }

        switch (num){
            case 1:
                System.out.println("Januray "+ yil+ " is 31 days.");
                break;
            case 2:
                break;
            case 3:
                System.out.println("March "+yil+" is 31 days.");
                break;
            case 4:
                System.out.println("April "+yil+" is 30 days.");
                break;
            case 5:
                System.out.println("May "+yil+" is 31 days.");
                break;
            case 6:
                System.out.println("Juni "+yil+" is 30 days.");
                break;
            case 7:
                System.out.println("July "+yil+" is 31 days.");
                break;
            case 8:
                System.out.println("August "+yil+" is 31 days.");
                break;
            case 9:
                System.out.println("September "+yil+" is 30 days.");
                break;
            case 10:
                System.out.println("October "+yil+" is 31 days.");
                break;
            case 11:
                System.out.println("November "+yil+" is 30 days.");
                break;
            case 12:
                System.out.println("December "+yil+" is 31 days.");
                break;
            default:
                System.out.println("Gecerli sayi giriniz");


        }

    }

}
