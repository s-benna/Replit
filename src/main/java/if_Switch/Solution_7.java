package if_Switch;

import java.util.Scanner;

public class Solution_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. name");
        String name1 = sc.nextLine();

        System.out.println("2. name");
        String name2 = sc.nextLine();

        int namelength1 = name1.length();
        //int name2length = name2.length();

        if (namelength1%2 == 0){
            int nameavg = namelength1/2;
            String namestart = name1.substring(0,nameavg);
            String namefinish = name1.substring(nameavg);
            System.out.println(namestart+name2+namefinish);


        } else if (namelength1%2 !=0) {
            System.out.println("Cannot add name1 to name2");
        }else {
            System.out.println("Invalid");
        }


    }
}
