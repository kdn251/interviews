// Within Settlers of Catan, the 1995 German game of the year, players attempt to dominate an island
// by building roads, settlements and cities across its uncharted wilderness.
// You are employed by a software company that just has decided to develop a computer version of
// this game, and you are chosen to implement one of the game’s special rules:
// When the game ends, the player who built the longest road gains two extra victory points.
// The problem here is that the players usually build complex road networks and not just one linear
// path. Therefore, determining the longest road is not trivial (although human players usually see it
// immediately).
// Compared to the original game, we will solve a simplified problem here: You are given a set of nodes
// (cities) and a set of edges (road segments) of length 1 connecting the nodes.
// The longest road is defined as the longest path within the network that doesn’t use an edge twice.
// Nodes may be visited more than once, though.

// Input
//     The input file will contain one or more test cases.
//     The first line of each test case contains two integers: the number of nodes n (2 ≤ n ≤ 25) and the
//     number of edges m (1 ≤ m ≤ 25). The next m lines describe the m edges. Each edge is given by the
//     numbers of the two nodes connected by it. Nodes are numbered from 0 to n − 1. Edges are undirected.
//     Nodes have degrees of three or less. The network is not neccessarily connected.
//     Input will be terminated by two values of 0 for n and m.

// Output
//     For each test case, print the length of the longest road on a single line.

// Sample Input
// 3 2
// 0 1
// 1 2
// 15 16
// 0 2
// 1 2
// 2 3
// 3 4
// 3 5
// 4 6
// 5 7
// 6 8
// 7 8
// 7 9
// 8 10
// 9 11
// 10 12
// 11 12
// 10 13
// 12 14
// 0 0
// Sample Output
// 2
// 12

import java.io.*;

/**
 * Created by kdn251 on 2/20/17.
 */
public class TheSettlersOfCatan {

    public static int[][] matrix = new int[30][30];
    public static int answer;

    public static void main(String args[]) throws Exception {

        //initialize buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        //iterate while current line is not equal to 0 0
        while(!(line = br.readLine()).equals("0 0")) {

            //initialize number of nodes and edges
            int nodes = Integer.parseInt(line.split(" ")[0]);
            int edges = Integer.parseInt(line.split(" ")[1]);

            //iterate through all edges
            for(int i = 0; i < edges; i++) {

                //get edge between node x and node y
                String[] current = br.readLine().split(" ");
                int x = Integer.parseInt(current[0]);
                int y = Integer.parseInt(current[1]);

                //mark edge
                matrix[x][y] = 1;
                matrix[y][x] = 1;

            }

            //initialize answer to zero
            answer = 0;

            //dfs on every node
            for(int i = 0; i < nodes; i++) {

                dfs(i, 0, nodes);

            }

            //print answer
            System.out.println(answer);

            //reset graph
            matrix = new int[30][30];

        }

    }

    public static void dfs(int nd, int l, int nodes) {

        //update answer if l is larger than current answer
        if(l > answer) {

            answer = l;

        }

        for(int i = 0; i < nodes; i++) {

            if(matrix[nd][i] > 0) {
                //ensure that edge is not counted twice (like marking as "visited")
                matrix[nd][i] = 0;
                matrix[i][nd] = 0;
                //continue traversing graph and add 1 to count
                dfs(i, l + 1, nodes);
                //set current edge again in case node further into graph can reach it
                matrix[nd][i] = 1;
                matrix[i][nd] = 1;

            }

        }

    }

}

//source: https://github.com/morris821028/UVa/blob/master/volume005/539%20-%20The%20Settlers%20of%20Catan.cpp
