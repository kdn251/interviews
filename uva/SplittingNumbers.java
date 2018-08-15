// We define the operation of splitting
// a binary number n into two numbers
// a(n), b(n) as follows. Let 0 ≤ i1 < i2 <
// . . . < ik be the indices of the bits (with
// the least significant bit having index 0) in
// n that are 1. Then the indices of the bits
// of a(n) that are 1 are i1, i3, i5, . . . and the
// indices of the bits of b(n) that are 1 are
// i2, i4, i6, . . .
// For example, if n is 110110101 in binary
// then, again in binary, we have a =
// 010010001 and b = 100100100.

// Input
    // Each test case consists of a single integer
    // n between 1 and 231 − 1 written in standard decimal (base 10) format on a single line. Input is
    // terminated by a line containing ‘0’ which should not be processed.

// Output
    // The output for each test case consists of a single line, containing the integers a(n) and b(n) separated
    // by a single space. Both a(n) and b(n) should be written in decimal format.

// Sample Input
// 6
// 7
// 13
// 0
// Sample Output
// 2 4
// 5 2
// 9 4

/**
 * Created by kdn251 on 2/10/17.
 */

import java.util.*;
import java.io.*;

public class SplittingNumbers {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = br.readLine()) != null) {

            //read number
            int number = Integer.parseInt(line);

            //terminate if number is zero
            if(number == 0) break;

            //intialize variables
            int count = 0;
            int a = 0;
            int b = 0;

            while(number > 0) {


                //get lowest set bit
                int currentBit = number ^ (number & (number - 1));


                //if count is even or a with current bit
                if(count % 2 == 0) {

                    a |= currentBit;

                }

                //if count is odd or b with current bit
                else {

                    b |= currentBit;

                }

                //increment count
                count++;

                //clear lowest set bit for next iteration
                number &= (number - 1);

            }

            //print a and b
            System.out.println(a + " " + b);

        }


    }

}
