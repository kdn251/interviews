// These days, you can do all sorts of things online. For example, you can use various websites to make
// virtual friends. For some people, growing their social network (their friends, their friends’ friends, their
// friends’ friends’ friends, and so on), has become an addictive hobby. Just as some people collect stamps,
// other people collect virtual friends.
// Your task is to observe the interactions on such a website and keep track of the size of each person’s
// network.
// Assume that every friendship is mutual. If Fred is Barney’s friend, then Barney is also Fred’s friend.

// Input
    // The first line of input contains one integer specifying the number of test cases to follow. Each test case
    // begins with a line containing an integer F, the number of friendships formed, which is no more than
    // 100 000. Each of the following F lines contains the names of two people who have just become friends,
    // separated by a space. A name is a string of 1 to 20 letters (uppercase or lowercase).

// Output
    // Whenever a friendship is formed, print a line containing one integer, the number of people in the social
    // network of the two people who have just become friends

// Sample Input
// 1
// 3
// Fred Barney
// Barney Betty
// Betty Wilma
// Sample Output
// 2
// 3
// 4

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by kdn251 on 3/7/17.
 */
public class VirtualFriends {

    public static int[] people = new int[1000001];
    public static int[] relationships = new int[1000001];

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        while(cases-- > 0) {
            startUnion(people.length);
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            int friendships = Integer.parseInt(br.readLine());
            int numberOfPeople = 0;
            for(int i = 0; i < friendships; i++) {
                String[] line = br.readLine().split("\\s+");
                String x = line[0];
                String y = line[1];
                if (x.equals(y)) {
                    System.out.println(1);
                    continue;
                }
                if (!map.containsKey(x)) {
                    map.put(x, ++numberOfPeople);
                }
                if (!map.containsKey(y)) {
                    map.put(y, ++numberOfPeople);
                }

                //print answer for current test case
                System.out.println(union(map.get(x), map.get(y)));
            }
        }
    }

    public static void startUnion(int numberOfPeople) {
        for(int i = 0; i < numberOfPeople; i++) {
            //initialize each individual person
            people[i] = i;

            //each person initially has a group of one (themselves)
            relationships[i] = 1;
        }
    }

    public static int union(int person, int friend) {
        //find parents in tree
        person = find(person);
        friend = find(friend);

        if(person != friend) {
            //add connection between person and friend
            //find larger group of the two and make sure both person and friend point to it
            if(relationships[person] > relationships[friend]) {
                relationships[person] += relationships[friend];
                people[friend] = person;
                return relationships[person];
            }

            else {
                relationships[friend] += relationships[person];
                people[person] = friend;
                return relationships[friend];
            }
        }
        return relationships[person];
    }

    public static int find(int person) {
        //traverse parents of tree if possible
        if(people[person] != person) {
            people[person] = find(people[person]);
        }
        return people[person];
    }
}

