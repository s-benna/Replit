package for_While;
/*


        (TR)    'a' ile 'z' arasındaki karakterlerin ascii değerlerini yazdıran bir Java programı yazın.
        (ENG)   Write a Java program that prints ascii values of characters from ‘a’ to ‘z’.

        Expected Output:

        Ascii value of a = 97
        Ascii value of b = 98
        Ascii value of c = 99
        Ascii value of d = 100
        Ascii value of e = 101
        Ascii value of f = 102
                .
                .
                .

 */
public class For_While08 {
    public static void main(String[] args) {

        char ascii =  'a';
        char ascii1 = 'z';

        for (char i = ascii; i<ascii1; i++) {

            ascii++;

            System.out.println("Ascii value of " + i + "=" + (int) i );
        }



    }
}
