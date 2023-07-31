package for_While;

/*
    (ENG)   Print even numbers from 20 to 0 but don't use decrement (i--).
    (TR)    20'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

    OUTPUT  : Even Numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
*/
public class For_While05 {

    public static void main(String[] args) {
        int num =20;
        while (num>=0){
            System.out.print(num+" ");
            num -=2;
        }

    }

}
