# Interviews
> Your personal guide to Software Engineering technical interviews.
>
> Maintainer - [Kevin Naughton Jr.](https://github.com/kdn251)

## Translations

- [简体中文](./README-zh-cn.md)

## Table of Contents
- [Online Judges](#online-judges)
- [Live Coding Practice](#live-coding-practice)
- [Data Structures](#data-structures)
- [Algorithms](#algorithms)
- [Greedy Algorithms](#greedy-algorithms)
- [Bitmasks](#bitmasks)
- [Runtime Analysis](#runtime-analysis)
- [Video Lectures](#video-lectures)
- [Interview Books](#interview-books)
- [Computer Science News](#computer-science-news)
- [Directory Tree](#directory-tree)

## Online Judges
* [LeetCode](https://leetcode.com/)
* [Virtual Judge](https://vjudge.net/)
* [CareerCup](https://www.careercup.com/)
* [HackerRank](https://www.hackerrank.com/)
* [CodeFights](https://codefights.com/)
* [Kattis](https://open.kattis.com/)
* [HackerEarth](https://www.hackerearth.com)
* [Codility](https://codility.com/programmers/lessons/1-iterations/)
* [Code Forces](http://codeforces.com/)
* [Code Chef](https://www.codechef.com/)
* [Sphere Online Judge - SPOJ](http://www.spoj.com/)

## Live Coding Practice
* [Gainlo](http://www.gainlo.co/#!/)
* [Refdash](https://refdash.com/)

## Data Structures
### Linked List
 * A *Linked List* is a linear collection of data elements, called nodes, each
   pointing to the next node by means of a pointer. It is a data structure
   consisting of a group of nodes which together represent a sequence.
 * **Singly-linked list**: linked list in which each node points to the next node and the last node points to null
 * **Doubly-linked list**: linked list in which each node has two pointers p, n such that p points to the previous node and n points to the next node; the last node's n pointer points to null
 * **Circular-linked list**: linked list in which each node points to the next node and the last node points back to the first node
 * Time Complexity:
   * Access: `O(n)`
   * Search: `O(n)`
   * Insert: `O(1)`
   * Remove: `O(1)`

### Stack
 * A *Stack* is a collection of elements, with two principle operations: *push*, which adds to the collection, and
   *pop*, which removes the most recently added element
 * Last in, first out data structure (LIFO)
 * Time Complexity:
  * Access: `O(n)`
  * Search: `O(n)`
  * Insert: `O(1)`
  * Remove: `O(1)`

### Queue
 * A *Queue* is a collection of elements, supporting two principle operations: *enqueue*, which inserts an element
   into the queue, and *dequeue*, which removes an element from the queue
 * First in, first out data structure (FIFO)
 * Time Complexity:
  * Access: `O(n)`
  * Search: `O(n)`
  * Insert: `O(1)`
  * Remove: `O(1)`

### Tree
 * A *Tree* is an undirected, connected, acyclic graph

### Binary Tree
 * A *Binary Tree* is a tree data structure in which each node has at most two children, which are referred to as
   the *left child* and *right child*
 * **Full Tree**: a tree in which every node has either 0 or 2 children
 * **Perfect Binary Tree**: a binary tree in which all interior nodes have two children and all leave have the same depth
 * **Complete Tree**: a binary tree in which every level *except possibly the last* is full and all nodes in the last
   level are as far left as possible

### Binary Search Tree
 * A binary search tree, sometimes called BST, is a type of binary tree which maintains the property that the value in each
   node must be greater than or equal to any value stored in the left sub-tree, and less than or equal to any value stored
   in the right sub-tree
 * Time Complexity:
  * Access: `O(log(n))`
  * Search: `O(log(n))`
  * Insert: `O(log(n))`
  * Remove: `O(log(n))`

<img src="/Images/BST.png?raw=true" alt="Binary Search Tree" width="400" height="500">

### Trie
* A trie, sometimes called a radix or prefix tree, is a kind of search tree that is used to store a dynamic set or associative
  array where the keys are usually Strings. No node in the tree stores the key associated with that node; instead, its position 
  in the tree defines the key with which it is associated. All the descendants of a node have a common prefix of the String associated 
  with that node, and the root is associated with the empty String.

![Alt text](/Images/trie.png?raw=true "Trie")

### Fenwick Tree
* A Fenwick tree, sometimes called a binary indexed tree, is a tree in concept, but in practice is implemented as an implicit data
  structure using an array. Given an index in the array representing a vertex, the index of a vertex's parent or child is calculated
  through bitwise operations on the binary representation of its index. Each element of the array contains the pre-calculated sum of
  a range of values, and by combining that sum with additional ranges encountered during an upward traversal to the root, the prefix
  sum is calculated
* Time Complexity:
 * Range Sum: `O(log(n))`
 * Update: `O(log(n))`

![Alt text](/Images/fenwickTree.png?raw=true "Fenwick Tree")

### Segment Tree
* A Segment tree, is a tree data structure for storing intervals, or segments. It allows querying which of the stored segments contain
  a given point
* Time Complexity:
 * Range Query: `O(log(n))`
 * Update: `O(log(n))`

![Alt text](/Images/segmentTree.png?raw=true "Segment Tree")

### Heap
* A *Heap* is a specialized tree based structure data structure that satisfies the *heap* property: if A is a parent node of
B, then the key (the value) of node A is ordered with respect to the key of node B with the same ordering applying across the entire heap.
A heap can be classified further as either a "max heap" or a "min heap". In a max heap, the keys of parent nodes are always greater
than or equal to those of the children and the highest key is in the root node. In a min heap, the keys of parent nodes are less than
or equal to those of the children and the lowest key is in the root node
* Time Complexity:
 * Access: `O(log(n))`
 * Search: `O(log(n))`
 * Insert: `O(log(n))`
 * Remove: `O(log(n))`
 * Remove Max / Min: `O(1)`

<img src="/Images/heap.png?raw=true" alt="Max Heap" width="400" height="500">


### Hashing
* *Hashing* is used to map data of an arbitrary size to data of a fixed size. The values return by a hash
  function are called hash values, hash codes, or simply hashes. If two keys map to the same value, a collision occurs
* **Hash Map**: a *hash map* is a structure that can map keys to values. A hash map uses a hash function to compute
  an index into an array of buckets or slots, from which the desired value can be found.
* Collision Resolution
 * **Separate Chaining**: in *separate chaining*, each bucket is independent, and contains a list of entries for each index. The
 time for hash map operations is the time to find the bucket (constant time), plus the time to iterate through the list
 * **Open Addressing**: in *open addressing*, when a new entry is inserted, the buckets are examined, starting with the
 hashed-to-slot and proceeding in some sequence, until an unoccupied slot is found. The name open addressing refers to
 the fact that the location of an item is not always determined by its hash value


![Alt text](/Images/hash.png?raw=true "Hashing")

### Graph
* A *Graph* is an ordered pair of G = (V, E) comprising a set V of vertices or nodes together with a set E of edges or arcs,
  which are 2-element subsets of V (i.e. an edge is associated with two vertices, and that association takes the form of the
  unordered pair comprising those two vertices)
 * **Undirected Graph**: a graph in which the adjacency relation is symmetric. So if there exists an edge from node u to node
 v (u -> v), then it is also the case that there exists an edge from node v to node u (v -> u)
 * **Directed Graph**: a graph in which the adjacency relation is not symmetric. So if there exists an edge from node u to node v
 (u -> v), this does *not* imply that there exists an edge from node v to node u (v -> u)


<img src="/Images/graph.png?raw=true" alt="Graph" width="400" height="500">

## Algorithms

### Sorting

#### Quicksort
* Stable: `No`
* Time Complexity:
 * Best Case: `O(nlog(n))`
 * Worst Case: `O(n^2)`
 * Average Case: `O(nlog(n))`

![Alt text](/Images/quicksort.gif?raw=true "Quicksort")

#### Mergesort
* *Mergesort* is also a divide and conquer algorithm. It continuously divides an array into two halves, recurses on both the
  left subarray and right subarray and then merges the two sorted halves
* Stable: `Yes`
* Time Complexity:
 * Best Case: `O(nlog(n))`
 * Worst Case: `O(nlog(n))`
 * Average Case: `O(nlog(n))`

![Alt text](/Images/mergesort.gif?raw=true "Mergesort")

#### Bucket Sort
* *Bucket Sort* is a sorting algorithm that works by distributing the elements of an array into a number of buckets. Each bucket
  is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sorting algorithm
* Time Complexity:
 * Best Case: `Ω(n + k)`
 * Worst Case: `O(n^2)`
 * Average Case:`Θ(n + k)`

![Alt text](/Images/bucketsort.png?raw=true "Bucket Sort")

#### Radix Sort
* *Radix Sort* is a sorting algorithm that like bucket sort, distributes elements of an array into a number of buckets. However, radix
  sort differs from bucket sort by 're-bucketing' the array after the initial pass as opposed to sorting each bucket and merging
* Time Complexity:
 * Best Case: `Ω(nk)`
 * Worst Case: `O(nk)`
 * Average Case: `Θ(nk)`

### Graph Algorithms

#### Depth First Search
* *Depth First Search* is a graph traversal algorithm which explores as far as possible along each branch before backtracking
* Time Complexity: `O(|V| + |E|)`

![Alt text](/Images/dfsbfs.gif?raw=true "DFS / BFS Traversal")

#### Breadth First Search
* *Breadth First Search* is a graph traversal algorithm which explores the neighbor nodes first, before moving to the next
  level neighbors
* Time Complexity: `O(|V| + |E|)`

![Alt text](/Images/dfsbfs.gif?raw=true "DFS / BFS Traversal")

#### Topological Sort
* *Topological Sort* is the linear ordering of a directed graph's nodes such that for every edge from node u to node v, u
  comes before v in the ordering
* Time Complexity: `O(|V| + |E|)`

#### Dijkstra's Algorithm
* *Dijkstra's Algorithm* is an algorithm for finding the shortest path between nodes in a graph
* Time Complexity: `O(|V|^2)`

![Alt text](/Images/dijkstra.gif?raw=true "Dijkstra's")

#### Bellman-Ford Algorithm
* *Bellman-Ford Algorithm* is an algorithm that computes the shortest paths from a single source node to all other nodes in a weighted graph
* Although it is slower than Dijkstra's, it is more versatile, as it is capable of handling graphs in which some of the edge weights are
  negative numbers
* Time Complexity:
 * Best Case: `O(|E|)`
 * Worst Case: `O(|V||E|)`

![Alt text](/Images/bellman-ford.gif?raw=true "Bellman-Ford")

#### Floyd-Warshall Algorithm
* *Floyd-Warshall Algorithm* is an algorithm for finding the shortest paths in a weighted graph with positive or negative edge weights, but
  no negative cycles
* A single execution of the algorithm will find the lengths (summed weights) of the shortest paths between *all* pairs of nodes
* Time Complexity:
 * Best Case: `O(|V|^3)`
 * Worst Case: `O(|V|^3)`
 * Average Case: `O(|V|^3)`

#### Prim's Algorithm
* *Prim's Algorithm* is a greedy algorithm that finds a minimum spanning tree for a weighted undirected graph. In other words, Prim's find a
  subset of edges that forms a tree that includes every node in the graph
* Time Complexity: `O(|V|^2)`

![Alt text](/Images/prim.gif?raw=true "Prim's Algorithm")

#### Kruskal's Algorithm
* *Kruskal's Algorithm* is also a greedy algorithm that finds a minimum spanning tree in a graph. However, in Kruskal's, the graph does not
  have to be connected
* Time Complexity: `O(|E|log|V|)`

![Alt text](/Images/kruskal.gif?raw=true "Kruskal's Algorithm")

## Greedy Algorithms
* *Greedy Algorithms* are algorithms that make locally optimal choices at each step in the hope of eventually reaching the globally optimal solution
* Problems must exhibit two properties in order to implement a Greedy solution:
 * Optimal Substructure
    * An optimal solution to the problem contains optimal solutions to the given problem's subproblems
 * The Greedy Property
    * An optimal solution is reached by "greedily" choosing the locally optimal choice without ever reconsidering previous choices
* Example - Coin Change
    * Given a target amount V cents and a list of denominations of n coins, i.e. we have coinValue[i] (in cents) for coin types i from [0...n - 1],
      what is the minimum number of coins that we must use to represent amount V? Assume that we have an unlimited supply of coins of any type
    * Coins - Penny (1 cent), Nickel (5 cents), Dime (10 cents), Quarter (25 cents)
    * Assume V = 43. We can use the Greedy algorithm of continuously selecting the largest coin denomination less than or equal to V, subtract that
      coin's value from V, and repeat.
    * V = 41 | 0 coins used
    * V = 16 | 1 coin used (41 - 25 = 16)
    * V = 6  | 2 coins used (16 - 10 = 6)
    * V = 1  | 3 coins used (6 - 5 = 1)
    * V = 0  | 4 coins used (1 - 1 = 0)
    * Using this algorithm, we arrive at a total of 4 coins which is optimal

## Bitmasks
* Bitmasking is a technique used to perform operations at the bit level. Leveraging bitmasks often leads to faster runtime complexity and
  helps limit memory usage
* Test kth bit: `s & (1 << k);`
* Set kth bit: `s |= (1 << k);`
* Turn off kth bit: `s &= ~(1 << k);`
* Toggle kth bit: `s ^= (1 << k);`
* Multiple by 2<sup>n</sup>: `s << n;`
* Divide by 2<sup>n</sup>: `s >> n;`
* Intersection: `s & t;`
* Union: `s | t;`
* Set Subtraction: `s & ~t;`
* Extract lowest set bit: `s & (-s);`
* Extract lowest unset bit: `~s & (s + 1);`
* Swap Values:
             ```
                x ^= y;
                y ^= x;
                x ^= y;
             ```

## Runtime Analysis

#### Big O Notation
* *Big O Notation* is used to describe the upper bound of a particular algorithm. Big O is used to describe worst case scenarios

![Alt text](/Images/bigO.png?raw=true "Theta Notation")

#### Little O Notation
* *Little O Notation* is also used to describe an upper bound of a particular algorithm; however, Little O provides a bound
  that is not asymptotically tight

#### Big Ω Omega Notation
* *Big Omega Notation* is used to provide an asymptotic lower bound on a particular algorithm

![Alt text](/Images/bigOmega.png?raw=true "Theta Notation")

#### Little ω Omega Notation
* *Little Omega Notation* is used to provide a lower bound on a particular algorithm that is not asymptotically tight

#### Theta Θ Notation
* *Theta Notation* is used to provide a bound on a particular algorithm such that it can be "sandwiched" between
  two constants (one for an upper limit and one for a lower limit) for sufficiently large values

![Alt text](/Images/theta.png?raw=true "Theta Notation")

## Video Lectures
* Data Structures
    * [UC Berkeley Data Structures](https://www.youtube.com/watch?v=mFPmKGIrQs4&index=1&list=PL-XXv-cvA_iAlnI-BQr9hjqADPBtujFJd)
    * [MIT Advanced Data Structures](https://www.youtube.com/watch?v=T0yzrZL1py0&list=PLUl4u3cNGP61hsJNdULdudlRL493b-XZf&index=1)
* Algorithms
    * [MIT Introduction to Algorithms](https://www.youtube.com/watch?v=HtSuA80QTyo&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=1)
    * [MIT Advanced Algorithms](https://www.youtube.com/playlist?list=PL6ogFv-ieghdoGKGg2Bik3Gl1glBTEu8c)

## Interview Books
* [Competitive Programming 3 - Steven Halim & Felix Halim](https://www.amazon.com/Competitive-Programming-3rd-Steven-Halim/dp/B00FG8MNN8) 
* [Cracking The Coding Interview - Gayle Laakmann McDowell](https://www.amazon.com/Cracking-Coding-Interview-Programming-Questions/dp/0984782850/ref=sr_1_1?s=books&ie=UTF8)
* [Cracking The PM Interview - Gayle Laakmann McDowell & Jackie Bavaro](https://www.amazon.com/Cracking-PM-Interview-Product-Technology-ebook/dp/B00ISYMUR6/ref=sr_1_1?s=books&ie=UTF8)
* [Introduction to Algorithms -  Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest & Clifford Stein](https://www.amazon.com/Introduction-Algorithms-3rd-MIT-Press/dp/0262033844/ref=sr_1_1?ie=UTF8&qid=1490295989&sr=8-1&keywords=Introduction+to+Algorithms)

## Computer Science News
* [Hacker News](https://news.ycombinator.com/)
* [Lobsters](https://lobste.rs/)

# Directory Tree

## Airbnb
- [addTwoNumbers.java](Company/Airbnb/addTwoNumbers.java)
- [convertSortedArrayToBinarySearchTree.java](Company/Airbnb/convertSortedArrayToBinarySearchTree.java)
- [houseRobber.java](Company/Airbnb/houseRobber.java)
- [mergeKSortedLists.java](Company/Airbnb/mergeKSortedLists.java)
- [regularExpressionMatching.java](Company/Airbnb/regularExpressionMatching.java)
- [twoSum.java](Company/Airbnb/twoSum.java)
- [validParentheses.java](Company/Airbnb/validParentheses.java)

## Amazon
- [3Sum.java](Company/Amazon/3Sum.java)
- [addTwoNumbers.java](Company/Amazon/addTwoNumbers.java)
- [bestTimeToBuyAndSellStock.java](Company/Amazon/bestTimeToBuyAndSellStock.java)
- [binaryTreeLevelOrderTraversal.java](Company/Amazon/binaryTreeLevelOrderTraversal.java)
- [groupAnagrams.java](Company/Amazon/groupAnagrams.java)
- [kthLargestElementInAnArray.java](Company/Amazon/kthLargestElementInAnArray.java)
- [letterCombinationsOfAPhoneNumber.java](Company/Amazon/letterCombinationsOfAPhoneNumber.java)
- [lowestCommonAncestorOfABinaryTree.java](Company/Amazon/lowestCommonAncestorOfABinaryTree.java)
- [mergeKSortedLists.java](Company/Amazon/mergeKSortedLists.java)
- [numberOfIslands.java](Company/Amazon/numberOfIslands.java)
- [palindromeLinkedList.java](Company/Amazon/palindromeLinkedList.java)
- [productOfArrayExceptSelf.java](Company/Amazon/productOfArrayExceptSelf.java)
- [reverseLinkedList.java](Company/Amazon/reverseLinkedList.java)
- [rotateImage.java](Company/Amazon/rotateImage.java)
- [subsets.java](Company/Amazon/subsets.java)
- [trappingRainWater.java](Company/Amazon/trappingRainWater.java)
- [twoSum.java](Company/Amazon/twoSum.java)
- [validateBinarySearchTree.java](Company/Amazon/validateBinarySearchTree.java)
- [validParentheses.java](Company/Amazon/validParentheses.java)
- [wordBreak.java](Company/Amazon/wordBreak.java)

## Facebook
- [3Sum.java](Company/Facebook/3Sum.java)
- [addAndSearchWordDataStructureDesign.java](Company/Facebook/addAndSearchWordDataStructureDesign.java)
- [addBinary.java](Company/Facebook/addBinary.java)
- [bestTimeToBuyAndSellStock.java](Company/Facebook/bestTimeToBuyAndSellStock.java)
- [binarySearchTreeIterator.java](Company/Facebook/binarySearchTreeIterator.java)
- [binaryTreeLevelOrderTraversal.java](Company/Facebook/binaryTreeLevelOrderTraversal.java)
- [binaryTreePaths.java](Company/Facebook/binaryTreePaths.java)
- [binaryTreeVerticalOrderTraversal.java](Company/Facebook/binaryTreeVerticalOrderTraversal.java)
- [cloneGraph.java](Company/Facebook/cloneGraph.java)
- [combinationSumIV.java](Company/Facebook/combinationSumIV.java)
- [countAndSay.java](Company/Facebook/countAndSay.java)
- [decodeWays.java](Company/Facebook/decodeWays.java)
- [expressionAddOperators.java](Company/Facebook/expressionAddOperators.java)
- [findTheCelebrity.java](Company/Facebook/findTheCelebrity.java)
- [firstBadVersion.java](Company/Facebook/firstBadVersion.java)
- [flattenNestedListIterator.java](Company/Facebook/flattenNestedListIterator.java)
- [groupAnagrams.java](Company/Facebook/groupAnagrams.java)
- [hammingDistance.java](Company/Facebook/hammingDistance.java)
- [implementTrie.java](Company/Facebook/implementTrie.java)
- [inorderSuccessorInBST.java](Company/Facebook/inorderSuccessorInBST.java)
- [insertInterval.java](Company/Facebook/insertInterval.java)
- [integerToEnglishWords.java](Company/Facebook/integerToEnglishWords.java)
- [kthLargestElementInAnArray.java](Company/Facebook/kthLargestElementInAnArray.java)
- [letterCombinationsOfAPhoneNumber.java](Company/Facebook/letterCombinationsOfAPhoneNumber.java)
- [longestConsecutiveSequence.java](Company/Facebook/longestConsecutiveSequence.java)
- [lowestCommonAncestorOfABinaryTree.java](Company/Facebook/lowestCommonAncestorOfABinaryTree.java)
- [maximumSizeSubarraySumEqualsK.java](Company/Facebook/maximumSizeSubarraySumEqualsK.java)
- [meetingRooms.java](Company/Facebook/meetingRooms.java)
- [mergeIntervals.java](Company/Facebook/mergeIntervals.java)
- [mergeKSortedLists.java](Company/Facebook/mergeKSortedLists.java)
- [mergeSortedArray.java](Company/Facebook/mergeSortedArray.java)
- [minimumSizeSubarraySum.java](Company/Facebook/minimumSizeSubarraySum.java)
- [minimumWindowSubstring.java](Company/Facebook/minimumWindowSubstring.java)
- [moveZeros.java](Company/Facebook/moveZeros.java)
- [multiplyStrings.java](Company/Facebook/multiplyStrings.java)
- [numberOfIslands.java](Company/Facebook/numberOfIslands.java)
- [oneEditDistance.java](Company/Facebook/oneEditDistance.java)
- [paintHouseII.java](Company/Facebook/paintHouseII.java)
- [palindromeLinkedList.java](Company/Facebook/palindromeLinkedList.java)
- [pow(x,n).java](Company/Facebook/pow(x,n).java)
- [productOfArrayExceptSelf.java](Company/Facebook/productOfArrayExceptSelf.java)
- [regularExpressionMatching.java](Company/Facebook/regularExpressionMatching.java)
- [removeDuplicatesFromSortedArray.java](Company/Facebook/removeDuplicatesFromSortedArray.java)
- [removeInvalidParentheses.java](Company/Facebook/removeInvalidParentheses.java)
- [reverseLinkedList.java](Company/Facebook/reverseLinkedList.java)
- [romanToInteger.java](Company/Facebook/romanToInteger.java)
- [searchInRotatedSortedArray.java](Company/Facebook/searchInRotatedSortedArray.java)
- [sortColors.java](Company/Facebook/sortColors.java)
- [sparseMatrixMultiplication.java](Company/Facebook/sparseMatrixMultiplication.java)
- [sqrt(x).java](Company/Facebook/sqrt(x).java)
- [subsetsII.java](Company/Facebook/subsetsII.java)
- [subsets.java](Company/Facebook/subsets.java)
- [sumOfLeftLeaves.java](Company/Facebook/sumOfLeftLeaves.java)
- [twoSum.java](Company/Facebook/twoSum.java)
- [validateBinarySearchTree.java](Company/Facebook/validateBinarySearchTree.java)
- [validPalindrome.java](Company/Facebook/validPalindrome.java)
- [validParentheses.java](Company/Facebook/validParentheses.java)
- [wallsAndGates.java](Company/Facebook/wallsAndGates.java)
- [wordBreak.java](Company/Facebook/wordBreak.java)
- [wordSearch.java](Company/Facebook/wordSearch.java)

## Google
- [3SumSmaller.java](Company/Google/3SumSmaller.java)
- [androidUnlockPatterns.java](Company/Google/androidUnlockPatterns.java)
- [binarySearchTreeIterator.java](Company/Google/binarySearchTreeIterator.java)
- [binaryTreePaths.java](Company/Google/binaryTreePaths.java)
- [binaryTreeVerticalOrderTraversal.java](Company/Google/binaryTreeVerticalOrderTraversal.java)
- [binaryWatch.java](Company/Google/binaryWatch.java)
- [bombEnemy.java](Company/Google/bombEnemy.java)
- [cloneGraph.java](Company/Google/cloneGraph.java)
- [closestBinarySearchTreeValue.java](Company/Google/closestBinarySearchTreeValue.java)
- [combinationSumIV.java](Company/Google/combinationSumIV.java)
- [decodeString.java](Company/Google/decodeString.java)
- [expressionAddOperators.java](Company/Google/expressionAddOperators.java)
- [findTheDifference.java](Company/Google/findTheDifference.java)
- [flattenNestedListIterator.java](Company/Google/flattenNestedListIterator.java)
- [gameOfLife.java](Company/Google/gameOfLife.java)
- [generalizedAbbreviation.java](Company/Google/generalizedAbbreviation.java)
- [groupShiftedStrings.java](Company/Google/groupShiftedStrings.java)
- [guessNumberHigherOrLower.java](Company/Google/guessNumberHigherOrLower.java)
- [implementTrie.java](Company/Google/implementTrie.java)
- [insertInterval.java](Company/Google/insertInterval.java)
- [islandPerimeter.java](Company/Google/islandPerimeter.java)
- [letterCombinationsOfAPhoneNumber.java](Company/Google/letterCombinationsOfAPhoneNumber.java)
- [loggerRateLimiter.java](Company/Google/loggerRateLimiter.java)
- [longestConsecutiveSequence.java](Company/Google/longestConsecutiveSequence.java)
- [longestSubstringWithAtMostKDistinctCharacters.java](Company/Google/longestSubstringWithAtMostKDistinctCharacters.java)
- [maximumProductOfWordLengths.java](Company/Google/maximumProductOfWordLengths.java)
- [mergeIntervals.java](Company/Google/mergeIntervals.java)
- [missingRanges.java](Company/Google/missingRanges.java)
- [movingAverageFromDataStream.java](Company/Google/movingAverageFromDataStream.java)
- [numberOfIslands.java](Company/Google/numberOfIslands.java)
- [pacificAtlanticWaterFlow.java](Company/Google/pacificAtlanticWaterFlow.java)
- [paintFence.java](Company/Google/paintFence.java)
- [plusOneLinkedList.java](Company/Google/plusOneLinkedList.java)
- [pow(x,n).java](Company/Google/pow(x,n).java)
- [regularExpressionMatching.java](Company/Google/regularExpressionMatching.java)
- [reverseVowelsOfAString.java](Company/Google/reverseVowelsOfAString.java)
- [sentenceScreenFitting.java](Company/Google/sentenceScreenFitting.java)
- [shortestDistanceFromAllBuildings.java](Company/Google/shortestDistanceFromAllBuildings.java)
- [strobogrammaticNumber.java](Company/Google/strobogrammaticNumber.java)
- [summaryRanges.java](Company/Google/summaryRanges.java)
- [trappingRainWater.java](Company/Google/trappingRainWater.java)
- [uniqueWordAbbreviation.java](Company/Google/uniqueWordAbbreviation.java)
- [utf-8Validation.java](Company/Google/utf-8Validation.java)
- [validParentheses.java](Company/Google/validParentheses.java)
- [wallsAndGates.java](Company/Google/wallsAndGates.java)
- [wiggleSort.java](Company/Google/wiggleSort.java)
- [wordBreak.java](Company/Google/wordBreak.java)
- [wordSquares.java](Company/Google/wordSquares.java)
- [zigzagIterator.java](Company/Google/zigzagIterator.java)

## LinkedIn
- [binarySearchTreeIterator.java](Company/LinkedIn/binarySearchTreeIterator.java)
- [binaryTreeLevelOrderTraversal.java](Company/LinkedIn/binaryTreeLevelOrderTraversal.java)
- [findTheCelebrity.java](Company/LinkedIn/findTheCelebrity.java)
- [houseRobber.java](Company/LinkedIn/houseRobber.java)
- [insertInterval.java](Company/LinkedIn/insertInterval.java)
- [lowestCommonAncestorOfABinaryTree.java](Company/LinkedIn/lowestCommonAncestorOfABinaryTree.java)
- [maximumDepthOfABinaryTree.java](Company/LinkedIn/maximumDepthOfABinaryTree.java)
- [maximumProductSubarray.java](Company/LinkedIn/maximumProductSubarray.java)
- [maximumSubarray.java](Company/LinkedIn/maximumSubarray.java)
- [mergeIntervals.java](Company/LinkedIn/mergeIntervals.java)
- [mergeKSortedLists.java](Company/LinkedIn/mergeKSortedLists.java)
- [minimumWindowSubstring.java](Company/LinkedIn/minimumWindowSubstring.java)
- [pow(x,n).java](Company/LinkedIn/pow(x,n).java)
- [productOfArrayExceptSelf.java](Company/LinkedIn/productOfArrayExceptSelf.java)
- [searchInRotatedSortedArray.java](Company/LinkedIn/searchInRotatedSortedArray.java)
- [sparseMatrixMultiplication.java](Company/LinkedIn/sparseMatrixMultiplication.java)
- [symmetricTree.java](Company/LinkedIn/symmetricTree.java)
- [twoSum.java](Company/LinkedIn/twoSum.java)

## Twitter
- [flattenNestedListIterator.java](Company/Twitter/flattenNestedListIterator.java)
- [implementTrie.java](Company/Twitter/implementTrie.java)
- [lowestCommonAncestorOfABinaryTree.java](Company/Twitter/lowestCommonAncestorOfABinaryTree.java)
- [mergeIntervals.java](Company/Twitter/.mergeIntervalsjava)
- [mergeKSortedLists.java](Company/Twitter/mergeKSortedLists.java)
- [multiplyStrings.java](Company/Twitter/multiplyStrings.java)
- [oneEditDistance.java](Company/Twitter/oneEditDistance.java)
- [regularExpressionMatching.java](Company/Twitter/regularExpressionMatching.java)
- [reverseLinkedList.java](Company/Twitter/reverseLinkedList.java)
- [trappingRainWater.java](Company/Twitter/trappingRainWater.java)
- [validParentheses.java](Company/Twitter/validParentheses.java)

## Uber
- [bestTimeToBuyAndSellStock.java](Company/Uber/bestTimeToBuyAndSellStock.java)
- [cloneGraph.java](Company/Uber/cloneGraph.java)
- [decodeWays.java](Company/Uber/decodeWays.java)
- [groupAnagrams.java](Company/Uber/groupAnagrams.java)
- [groupShiftedStrings.java](Company/Uber/groupShiftedStrings.java)
- [implementTrie.java](Company/Uber/implementTrie.java)
- [letterCombinationsOfAPhoneNumber.java](Company/Uber/letterCombinationsOfAPhoneNumber.java)
- [maximumDepthOfABinaryTree.java](Company/Uber/maximumDepthOfABinaryTree.java)
- [mergeKSortedLists.java](Company/Uber/mergeKSortedLists.java)
- [minimumWindowSubstring.java](Company/Uber/minimumWindowSubstring.java)
- [oneEditDistance.java](Company/Uber/oneEditDistance.java)
- [palindromePermutation.java](Company/Uber/palindromePermutation.java)
- [regularExpressionMatching.java](Company/Uber/regularExpressionMatching.java)
- [reverseLinkedList.java](Company/Uber/reverseLinkedList.java)
- [romanToInteger.java](Company/Uber/romanToInteger.java)
- [searchInRotatedSortedArray.java](Company/Uber/searchInRotatedSortedArray.java)
- [subsets.java](Company/Uber/subsets.java)
- [twoSum.java](Company/Uber/twoSum.java)
- [validPalindrome.java](Company/Uber/validPalindrome.java)
- [wordBreak.java](Company/Uber/wordBreak.java)

## Cracking TheCodingInterview
### Chapter1ArraysAndStrings
- [DeleteDups.java](Company/CrackingTheCodingInterview/Chapter1ArraysAndStrings/DeleteDups.java)
- [IsRotation.java](Company/CrackingTheCodingInterview/Chapter1ArraysAndStrings/IsRotation.java)
- [IsUniqueChars.java](Company/CrackingTheCodingInterview/Chapter1ArraysAndStrings/IsUniqueChars.java)
- [NthToLast.java](Company/CrackingTheCodingInterview/Chapter1ArraysAndStrings/NthToLast.java)
- [Permutation.java](Company/CrackingTheCodingInterview/Chapter1ArraysAndStrings/Permutation.java)
- [ReplaceSpaces.java](Company/CrackingTheCodingInterview/Chapter1ArraysAndStrings/ReplaceSpaces.java)

### Chapter2LinkedLists
- [DeleteDups.java](Company/CrackingTheCodingInterview/Chapter2LinkedLists/DeleteDups.java)
- [DeleteNode.java](Company/CrackingTheCodingInterview/Chapter2LinkedLists/DeleteNode.java)
- [FindBeginning.java](Company/CrackingTheCodingInterview/Chapter2LinkedLists/FindBeginning.java)
- [IsPalindrome.java](Company/CrackingTheCodingInterview/Chapter2LinkedLists/.java)
- [NthToLast.java](Company/CrackingTheCodingInterview/Chapter2LinkedLists/IsPalindrome.java)
- [Partition.java](Company/CrackingTheCodingInterview/Chapter2LinkedLists/Partition.java)

### Chapter3StacksAndQueues
- [BinaryTreeIsBalanced.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/BinaryTreeIsBalanced.java)
- [MyQueue.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/MyQueue.java)
- [MyQUeue.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/MyQUeue.java)
- [QueueUsingTwoStacks.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/QueueUsingTwoStacks.java)
- [SetOfStacks.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/SetOfStacks.java)
- [SortStack.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/SortStack.java)
- [StackWithMin.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/StackWithMin.java)
- [ThreeStacks.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/ThreeStacks.java)
- [TowersOfHanoi.java](Company/CrackingTheCodingInterview/Chapter3StacksAndQueues/TowersOfHanoi.java)

### Chapter4TreesAndGraphs
- [BinaryTreeIsBalanced.java](Company/CrackingTheCodingInterview/Chapter4TreesAndGraphs/BinaryTreeIsBalanced.java)
- [CreateBinarySearchTree.java](Company/CrackingTheCodingInterview/Chapter4TreesAndGraphs/CreateBinarySearchTree.java)
- [CreateLinkedListForEachLevel.java](Company/CrackingTheCodingInterview/Chapter4TreesAndGraphs/CreateLinkedListForEachLevel.java)
- [FindPath.java](Company/CrackingTheCodingInterview/Chapter4TreesAndGraphs/FindPath.java)
- [IsSubtree.java](Company/CrackingTheCodingInterview/Chapter4TreesAndGraphs/IsSubtree.java)
- [PrintPaths.java](Company/CrackingTheCodingInterview/Chapter4TreesAndGraphs/PrintPaths.java)
- [ValidBinarySearchTree.java](Company/CrackingTheCodingInterview/Chapter4TreesAndGraphs/ValidBinarySearchTree.java)

### Chapter5BitManipulation
- [BinaryRepresentation.java](Company/CrackingTheCodingInterview/hapter5BitManipulation/BinaryRepresentation.java)
- [FindMissingInteger.java](Company/CrackingTheCodingInterview/hapter5BitManipulation/FindMissingInteger.java)
- [InsertMIntoN.java](Company/CrackingTheCodingInterview/hapter5BitManipulation/InsertMIntoN.java)
- [SwapBits.java](Company/CrackingTheCodingInterview/hapter5BitManipulation/SwapBits.java)

### Chapter7MathematicsAndProbability
- [Operations.java](Company/CrackingTheCodingInterview/Chapter7MathematicsAndProbability/Operations.java)
- [WouldIntersect.java](Company/CrackingTheCodingInterview/Chapter7MathematicsAndProbability/WorstIntersect.java)

### Chapter9RecursionAndDynamicProgramming
- [AllPermutations.java](Company/CrackingTheCodingInterview/Chapter9RecursionAndDynamicProgramming/AllPermutations.java)
- [AllSubsets.java](Company/CrackingTheCodingInterview/Chapter9RecursionAndDynamicProgramming/AllSubsets.java)
- [EightQueens.java](Company/CrackingTheCodingInterview/Chapter9RecursionAndDynamicProgramming/EightQueens.java)
- [MagicIndex.java](Company/CrackingTheCodingInterview/Chapter9RecursionAndDynamicProgramming/MagicIndex.java)
- [RepresentingNCents.java](Company/CrackingTheCodingInterview/Chapter9RecursionAndDynamicProgramming/RepresentingNCents.java)
- [StackBoxes.java](Company/CrackingTheCodingInterview/Chapter9RecursionAndDynamicProgramming/StackBoxes.java)
- [Staircase.java](Company/CrackingTheCodingInterview/Chapter9RecursionAndDynamicProgramming/Staircase.java)

## UVa 
- [Ants.java](Company/UVa/Ants.java)
- [BasicRemains.java](Company/UVa/BasicRemains.java)
- [Friends.java](Company/UVa/Friends.java)
- [GoogleIsFeelingLucky.java](Company/UVa/GoogleIsFeelingLucky.java)
- [ICanGuessTheDataStructure.java](Company/UVa/ICanGuessTheDataStructure.java)
- [JollyJumpers.java](Company/UVa/JollyJumpers.java)
- [Newspaper.java](Company/UVa/Newspaper.java)
- [OpenSource.java](Company/UVa/OpenSource.java)
- [PeskyPalindromes.java](Company/UVa/PeskyPalindromes.java)
- [PrimeFactors.java](Company/UVa/PrimeFactors.java)
- [SplittingNumbers.java](Company/UVa/SplittingNumbers.java)
- [TheLastNonZeroDigit.java](Company/UVa/TheLastNonZeroDigit.java)
- [TheSettlersOfCatan.java](Company/UVa/TheSettlersOfCatan.java)
- [VirtualFriends.java](Company/UVa/VirtualFriends.java)

## LeetCode

### Array
 - [bestTimeToBuyAndSellStock.java](LeetCode/Array/bestTimeToBuyAndSellStock.java)
 - [findTheCelebrity.java](LeetCode/Array/findTheCelebrity.java)
 - [gameOfLife.java](LeetCode/Array/ArraygameOfLife/.java)
 - [increasingTripletSubsequence.java](LeetCode/Array/increasingTripletSubsequence.java)
 - [insertInterval.java](LeetCode/Array/insertInterval.java)
 - [longestConsecutiveSequence.java](LeetCode/Array/longestConsecutiveSequence.java)
 - [maximumProductSubarray.java](LeetCode/Array/maximumProductSubarray.java)
 - [maximumSubarray.java](LeetCode/Array/maximumSubarray.java)
 - [mergeIntervals.java](LeetCode/Array/ArraymergeIntervals/.java)
 - [missingRanges.java](LeetCode/Array/missingRanges.java)
 - [productOfArrayExceptSelf.java](LeetCode/Array/productOfArrayExceptSelf.java)
 - [rotateImage.java](LeetCode/Array/rotateImage.java)
 - [searchInRotatedSortedArray.java](LeetCode/Array/searchInRotatedSortedArray.java)
 - [spiralMatrixII.java](LeetCode/Array/spiralMatrixII.java)
 - [subsetsII.java](LeetCode/Array/subsetsII.java)
 - [subsets.java](LeetCode/Array/subsets.java)
 - [summaryRanges.java](LeetCode/Array/summaryRanges.java)
 - [wiggleSort.java](LeetCode/Array/wiggleSort.java)
 - [wordSearch.java](LeetCode/Array/wordSearch.java)

### Backtracking

 - [androidUnlockPatterns.java](LeetCode/Backtracking/androidUnlockPatterns.java)
 - [generalizedAbbreviation.java](LeetCode/Backtracking/generalizedAbbreviation.java)
 - [letterCombinationsOfAPhoneNumber.java](LeetCode/Backtracking/letterCombinationsOfAPhoneNumber.java)

### Binary Search

 - [closestBinarySearchTreeValue.java](LeetCode/BinarySearch/closestBinarySearchTreeValue.java)
 - [firstBadVersion.java](LeetCode/BinarySearch/firstBadVersion.java)
 - [guessNumberHigherOrLower.java](LeetCode/BinarySearch/guessNumberHigherOrLower.java)
 - [pow(x,n).java](LeetCode/BinarySearch/pow(x,n).java)
 - [sqrt(x).java](LeetCode/BinarySearch/sqrt(x).java)

### Bit Manipulation

 - [binaryWatch.java](LeetCode/BitManipulation/binaryWatch.java)
 - [countingBits.java](LeetCode/BitManipulation/countingBits.java)
 - [hammingDistance.java](LeetCode/BitManipulation/hammingDistance.java)
 - [maximumProductOfWordLengths.java](LeetCode/BitManipulation/maximumProductOfWordLengths.java)
 - [numberOf1Bits.java](LeetCode/BitManipulation/numberOf1Bits.java)
 - [sumOfTwoIntegers.java](LeetCode/BitManipulation/sumOfTwoIntegers.java)
 - [utf-8Validation.java](LeetCode/BitManipulation/utf-8Validation.java)

### Breadth First Search

 - [binaryTreeLevelOrderTraversal.java](LeetCode/BreadthFirstSearch/binaryTreeLevelOrderTraversal.java)
 - [cloneGraph.java](LeetCode/BreadthFirstSearch/cloneGraph.java)
 - [pacificAtlanticWaterFlow.java](LeetCode/BreadthFirstSearch/pacificAtlanticWaterFlow.java)
 - [removeInvalidParentheses.java](LeetCode/BreadthFirstSearch/removeInvalidParentheses.java)
 - [shortestDistanceFromAllBuildings.java](LeetCode/BreadthFirstSearch/shortestDistanceFromAllBuildings.java)
 - [symmetricTree.java](LeetCode/BreadthFirstSearch/symmetricTree.java)
 - [wallsAndGates.java](LeetCode/BreadthFirstSearch/wallsAndGates.java)

### Depth First Search
 
 - [balancedBinaryTree.java](LeetCode/DepthFirstSearch/balancedBinaryTree.java)
 - [battleshipsInABoard.java](LeetCode/DepthFirstSearch/battleshipsInABoard.java)
 - [convertSortedArrayToBinarySearchTree.java](LeetCode/DepthFirstSearch/convertSortedArrayToBinarySearchTree.java)
 - [maximumDepthOfABinaryTree.java](LeetCode/DepthFirstSearch/maximumDepthOfABinaryTree.java)
 - [numberOfIslands.java](LeetCode/DepthFirstSearch/numberOfIslands.java)
 - [populatingNextRightPointersInEachNode.java](LeetCode/DepthFirstSearch/populatingNextRightPointersInEachNode.java)
 - [sameTree.java](LeetCode/DepthFirstSearch/sameTree.java)
 
### Design

 - [zigzagIterator.java](LeetCode/Design/zigzagIterator.java)

### Divide And Conquer

 - [expressionAddOperators.java](LeetCode/DivideAndConquer/expressionAddOperators.java)
 - [kthLargestElementInAnArray.java](LeetCode/DivideAndConquer/kthLargestElementInAnArray.java)

### Dynamic Programming

 - [bombEnemy.java](LeetCode/DynamicProgramming/bombEnemy.java)
 - [climbingStairs.java](LeetCode/DynamicProgramming/climbingStairs.java)
 - [combinationSumIV.java](LeetCode/DynamicProgramming/combinationSumIV.java)
 - [countingBits.java](LeetCode/DynamicProgramming/countingBits.java)
 - [editDistance.java](LeetCode/DynamicProgramming/editDistance.java)
 - [houseRobber.java](LeetCode/DynamicProgramming/houseRobber.java)
 - [paintFence.java](LeetCode/DynamicProgramming/paintFence.java)
 - [paintHouseII.java](LeetCode/DynamicProgramming/paintHouseII.java)
 - [regularExpressionMatching.java](LeetCode/DynamicProgramming/regularExpressionMatching.java)
 - [sentenceScreenFitting.java](LeetCode/DynamicProgramming/sentenceScreenFitting.java)
 - [uniqueBinarySearchTrees.java](LeetCode/DynamicProgramming/uniqueBinarySearchTrees.java)
 - [wordBreak.java](LeetCode/DynamicProgramming/wordBreak.java)

### HashTable

 - [binaryTreeVerticalOrderTraversal.java](LeetCode/HashTable/binaryTreeVerticalOrderTraversal.java)
 - [findTheDifference.java](LeetCode/HashTable/findTheDifference.java)
 - [groupAnagrams.java](LeetCode/HashTable/groupAnagrams.java)
 - [groupShiftedStrings.java](LeetCode/HashTable/groupShiftedStrings.java)
 - [islandPerimeter.java](LeetCode/HashTable/islandPerimeter.java)
 - [loggerRateLimiter.java](LeetCode/HashTable/loggerRateLimiter.java)
 - [maximumSizeSubarraySumEqualsK.java](LeetCode/HashTable/maximumSizeSubarraySumEqualsK.java)
 - [minimumWindowSubstring.java](LeetCode/HashTable/minimumWindowSubstring.java)
 - [sparseMatrixMultiplication.java](LeetCode/HashTable/sparseMatrixMultiplication.java)
 - [strobogrammaticNumber.java](LeetCode/HashTable/strobogrammaticNumber.java)
 - [twoSum.java](LeetCode/HashTable/twoSum.java)
 - [uniqueWordAbbreviation.java](LeetCode/HashTable/uniqueWordAbbreviation.java)

### LinkedList

 - [addTwoNumbers.java](LeetCode/LinkedList/addTwoNumbers.java)
 - [deleteNodeInALinkedList.java](LeetCode/LinkedList/deleteNodeInALinkedList.java)
 - [mergeKSortedLists.java](LeetCode/LinkedList/mergeKSortedLists.java)
 - [palindromeLinkedList.java](LeetCode/LinkedList/palindromeLinkedList.java)
 - [plusOneLinkedList.java](LeetCode/LinkedList/plusOneLinkedList.java)
 - [README.md.java](LeetCode/LinkedList/README.java)
 - [reverseLinkedList.java](LeetCode/LinkedList/reverseLinkedList.java)

### Queue

 - [movingAverageFromDataStream.java](LeetCode/Queue/movingAverageFromDataStream.java)
 - [README.md.java](LeetCode/Queue/README.java)

### Sort

 - [meetingRoomsII.java](LeetCode/Sort/meetingRoomsII.java)
 - [meetingRooms.java](LeetCode/Sort/meetingRooms.java)

### Stack

 - [binarySearchTreeIterator.java](LeetCode/Stack/binarySearchTreeIterator.java)
 - [decodeString.java](LeetCode/Stack/decodeString.java)
 - [flattenNestedListIterator.java](LeetCode/Stack/flattenNestedListIterator.java)
 - [trappingRainWater.java](LeetCode/Stack/trappingRainWater.java)

### String

 - [addBinary.java](LeetCode/String/addBinary.java)
 - [countAndSay.java](LeetCode/String/countAndSay.java)
 - [decodeWays.java](LeetCode/String/decodeWays.java)
 - [editDistance.java](LeetCode/String/editDistance.java)
 - [integerToEnglishWords.java](LeetCode/String/integerToEnglishWords.java)
 - [longestPalindrome.java](LeetCode/String/longestPalindrome.java)
 - [longestSubstringWithAtMostKDistinctCharacters.java](LeetCode/String/longestSubstringWithAtMostKDistinctCharacters.java)
 - [minimumWindowSubstring.java](LeetCode/String/minimumWindowSubstring.java)
 - [multiplyString.java](LeetCode/String/multiplyString.java)
 - [oneEditDistance.java](LeetCode/String/oneEditDistance.java)
 - [palindromePermutation.java](LeetCode/String/palindromePermutation.java)
 - [README.md.java](LeetCode/String/README.java)
 - [reverseVowelsOfAString.java](LeetCode/String/reverseVowelsOfAString.java)
 - [romanToInteger.java](LeetCode/String/romanToInteger.java)
 - [validPalindrome.java](LeetCode/String/validPalindrome.java)
 - [validParentheses.java](LeetCode/String/validParentheses.java)

### Tree

 - [binaryTreeMaximumPathSum.java](LeetCode/Tree/binaryTreeMaximumPathSum.java)
 - [binaryTreePaths.java](LeetCode/Tree/binaryTreePaths.java)
 - [inorderSuccessorInBST.java](LeetCode/Tree/inorderSuccessorInBST.java)
 - [invertBinaryTree.java](LeetCode/Tree/invertBinaryTree.java)
 - [lowestCommonAncestorOfABinaryTree.java](LeetCode/Tree/lowestCommonAncestorOfABinaryTree.java)
 - [sumOfLeftLeaves.java](LeetCode/Tree/sumOfLeftLeaves.java)
 - [validateBinarySearchTree.java](LeetCode/Tree/validateBinarySearchTree.java)

### Trie

 - [addAndSearchWordDataStructureDesign.java](LeetCode/Trie/addAndSearchWordDataStructureDesign.java)
 - [implementTrie.java](LeetCode/Trie/implementTrie.java)
 - [wordSquares.java](LeetCode/Trie/wordSquares.java)

### Two Pointers
 
 - [3Sum.java](LeetCode/Facebook/3Sum.java)
 - [3SumSmaller.java](LeetCode/TwoPointers/3SumSmaller.java)
 - [mergeSortedArray.java](LeetCode/TwoPointers/mergeSortedArray.java)
 - [minimumSizeSubarraySum.java](LeetCode/TwoPointers/minimumSizeSubarraySum.java)
 - [moveZeros.java](LeetCode/Facebook/moveZeros.java)
 - [removeDuplicatesFromSortedArray.java](LeetCode/TwoPointers/removeDuplicatesFromSortedArray.java)
 - [reverseString.java](LeetCode/TwoPointers/reverseString.java)
 - [sortColors.java](LeetCode/TwoPointers/sortColors.java)