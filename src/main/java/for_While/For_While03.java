package for_While;

import java.util.Scanner;

/*
            (TR)    Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(Mülakat Sorusu)

            (ENG)   Write a code that returns repeating characters in a String. (Interview Question)

            Input:
            String str=“Javaisalsoeasy”
            Output: a, s


 */
public class For_While03 {
    public static void main(String[] args) {
        System.out.println("Bir ifade giriniz");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        String sonuc="";
        int counter=0;
        while (counter<st.length()){
            char ch = st.charAt(counter);
            if (st.indexOf(ch)!=st.lastIndexOf(ch)){
                sonuc=sonuc+ch;
            }
           counter++;
        }
        System.out.println(sonuc);


    }

}
