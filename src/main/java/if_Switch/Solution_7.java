package if_Switch;

import java.util.Scanner;
/*
2 kelime oluşturun: isim1 ve isim2

        isim1 çift sayıda karakter içeriyorsa, isim2' yi, isim1' in ortasına yerleştirin.

        ilk kelime tek sayida karakter iceriyorsa, “isim1, isim2 ye eklenemiyor” yazdırın.

    If name1 contains an even number of characters, place the second word in the middle of the first name.
    If the first word contains an odd number of characters, print "Cannot add name1 to name2".

        Örneğin:        isim1= mehmet
                        isim2= ahmet
                        Yazdır ==> mehahmetmet


                        isim1= memet
                        isim2= ahmet
                        Yazdır ==> isim1, isim2 ye eklenemiyor
 */
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
