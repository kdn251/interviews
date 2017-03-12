// An army of ants walk on a horizontal pole of length l cm, each with a constant speed of 1 cm/s. When
// a walking ant reaches an end of the pole, it immediatelly falls off it. When two ants meet they turn
// back and start walking in opposite directions. We know the original positions of ants on the pole,
// unfortunately, we do not know the directions in which the ants are walking. Your task is to compute
// the earliest and the latest possible times needed for all ants to fall off the pole.

// Input
//     The first line of input contains one integer giving the number of cases that follow. The data for each
//     case start with two integer numbers: the length of the pole (in cm) and n, the number of ants residing
//     on the pole. These two numbers are followed by n integers giving the position of each ant on the pole
//     as the distance measured from the left end of the pole, in no particular order. All input integers are
//     not bigger than 1000000 and they are separated by whitespace.

// Output
//     For each case of input, output two numbers separated by a single space. The first number is the earliest
//     possible time when all ants fall off the pole (if the directions of their walks are chosen appropriately)
//     and the second number is the latest possible such time.

// Sample Input
// 2
// 10 3
// 2 6 7
// 214 7
// 11 12 7 13 176 23 191
// Sample Output
// 4 8
// 38 207

import java.util.Scanner;

/**
 * Created by kdn251 on 2/22/17.
 */
public class Ants {

    public static void main(String args[]) throws Exception {

        //initialize buffered reader
        Scanner sc = new Scanner(System.in);

        //initialize test cases
        int testCases = sc.nextInt();

        //declare current ant
        int currentAnt;

        while(testCases > 0) {

            //initialize length of rod and number of ants
            int length = sc.nextInt();
            int numberOfAnts = sc.nextInt();

            //initialize min and max to zero
            int min = 0;
            int max = 0;

            //iterate while there are still remaining ants to process
            while(numberOfAnts > 0) {

                //read in current ant
                currentAnt = sc.nextInt();

                //calculate whether ant is closer to left side of rod or right side of rod
                currentAnt = currentAnt < length - currentAnt ? currentAnt : length - currentAnt;

                //update minimum time to most restrictive ant minimum time
                if(currentAnt > min) {

                    min = currentAnt;

                }

                //update maximum time to most restrictive ant maximum time
                if(length - currentAnt > max) {

                    max = length - currentAnt;

                }

                //decrement number of ants remaining
                numberOfAnts--;

            }

            //print min and max of current test case
            System.out.println(min + " " + max);

            //decrement number of test cases remaining
            testCases--;

        }

    }

}

//source: https://github.com/morris821028/UVa/blob/master/volume107/10714%20-%20Ants.cpp