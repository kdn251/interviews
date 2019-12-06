// There is a town with N citizens. It is known that some pairs of people are friends. According to the
// famous saying that “The friends of my friends are my friends, too” it follows that if A and B are friends
// and B and C are friends then A and C are friends, too.
// Your task is to count how many people there are in the largest group of friends.

// Input
//     Input consists of several datasets. The first line of the input consists of a line with the number of test
//     cases to follow.
//     The first line of each dataset contains tho numbers N and M, where N is the number of town’s
//     citizens (1 ≤ N ≤ 30000) and M is the number of pairs of people (0 ≤ M ≤ 500000), which are known
//     to be friends. Each of the following M lines consists of two integers A and B (1 ≤ A ≤ N, 1 ≤ B ≤ N,
//     A ̸= B) which describe that A and B are friends. There could be repetitions among the given pairs

// Output
//     The output for each test case should contain (on a line by itself) one number denoting how many people
//     there are in the largest group of friends on a line by itself.

// Sample Input
// 2
// 3 2
// 1 2
// 2 3
// 10 12
// 1 2
// 3 1
// 3 4
// 5 4
// 3 5
// 4 6
// 5 2
// 2 1
// 7 1
// 1 2
// 9 10
// 8 9
// Sample Output
// 3
// 7

import java.io.*;
import java.util.*;

/**
 * Created by kdn251 on 2/15/17.
 */

public class Friends {

    //initialize globals to track each individual person and their relationships
    public static int[] people = new int[30001];
    public static int[] relationships = new int[50001];

    public static void main(String args[]) throws Exception {

        //initialize buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        //store number of test cases
        int testCases = Integer.parseInt(line);

        for(int i = 0; i < testCases; i++) {

            //determine number of people and pairs of people (N and M)
            String[] info = br.readLine().split(" ");
            int numberOfPeople = Integer.parseInt(info[0]);
            int numberOfRelationship = Integer.parseInt(info[1]);

            startUnion(numberOfPeople, people, relationships);

            //iterate through all relationships
            for(int j = 0; j < numberOfRelationship ; j++) {

                //split current line to determine person and friend
                String[] currentLine = br.readLine().split(" ");
                int person = Integer.parseInt(currentLine[0]);
                int friend = Integer.parseInt(currentLine[1]);
                union(person, friend);

            }

            //initialize maxGroup to one because each group has one person initially
            int maxGroup = 1;

            //iterate through relationships to find the largest group
            for(int j = 0; j <= numberOfPeople; j++) {

                //update max as needed
                maxGroup = relationships[j] > maxGroup ? relationships[j] : maxGroup;

            }

            //print result
            System.out.println(maxGroup);

        }

    }

    public static void startUnion(int numberOfPeople, int[] people, int[] relationships) {

        for(int i = 0; i <= numberOfPeople; i++) {

            //initialize each individual person
            people[i] = i;

            //each person initially has a group of one (themselves)
            relationships[i] = 1;

        }

    }

    public static void union(int person, int friend) {

        //find parents in tree
        person = find(person);
        friend = find(friend);

        if(person != friend) {

            //add connection between person and friend
            join(person, friend);

        }

    }

    public static int find(int person) {

        //traverse parents of tree if possible
        if(people[person] != person) {

            people[person] = find(people[person]);

        }

        return people[person];

    }

    public static void join(int person, int friend) {

        //find larger group of the two and make sure both person and friend point to it
        if(relationships[person] > relationships[friend]) {

            relationships[person] += relationships[friend];
            people[friend] = person;

        }

        else {

            relationships[friend] += relationships[person];
            people[person] = friend;

        }

    }

}

//source: https://github.com/morris821028/UVa/blob/master/volume106/10608%20-%20Friends.cpp#L27



