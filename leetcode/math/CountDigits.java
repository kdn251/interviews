/**
 * CountDigits
 */
// Given a non negative integer number, question is to find number of digits in the non negative integer.

// Example :- num = 9235 , O/P = 4
//            num = 38 , O/P = 2
//            num = 7 , O/P = 1
import java.util.*;
public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int num = sc.nextInt();
        System.out.println("Numbers of didgits in entered number is = "+algo(num));
    }
    static int algo(int number){
        int count = 0;
        while (number > 0) {
            count++;
            number = number/10;
        }
        return count;
    }
}