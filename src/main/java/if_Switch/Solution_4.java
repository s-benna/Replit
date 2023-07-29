package if_Switch;

import java.util.Scanner;

public class Solution_4 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter letters: ");
        String ch = inp.nextLine();

        switch (ch){
            case "a":
                System.out.println("Your request is being processed");
                break;
            case "b":
                System.out.println("Thank you for your interest anyway");
                break;
            case "c":
                System.out.println("Sorry, no help available at this time");
                break;
            default:
                System.out.println("Invalid login, please try again!");
                break;
        }
    }
}
