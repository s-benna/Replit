package for_While;

import java.util.Scanner;

/*

        Ask the user to enter a name and a character,
        then check how many times the character is repeated in the name using loops.


        Name = John came late
        Expected Output:
             Number of a = 2

 */
public class For_While01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter characters: ");
        char check = sc.next().charAt(0);


        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == check)
                counter++;
        }
        System.out.println("Number of "+check+ " = "+counter);

    }
}

