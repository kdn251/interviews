# Entrevistas
> Aprueba tus entrevistas de codificación con [The Daily Byte](https://thedailybyte.dev/?ref=kevin)  
> [Más de 30,000 ingenieros de software han confiado en nosotros para su preparación de entrevistas](https://thedailybyte.dev/?ref=kevin).
<a href="" style="display:block;"><img src="/images/the-daily-byte.png?raw=true"></a>
>
> Mantenedor - [Kevin Naughton Jr.](https://github.com/kdn251)

## Traducciones

- [简体中文](./README-zh-cn.md)

## Tabla de contenidos
- [YouTube](#youtube)
- [The Daily Byte](#the-daily-byte)
- [Instagram](#instagram)
- [Artículos](#artículos)
- [Jueces en línea](#jueces-en-línea)
- [Práctica de Live Coding](#práctica-de-live-coding)
- [Estructuras de datos](#estructuras-de-datos)
- [Algoritmos](#algoritmos)
- [Algoritmos codiciosos](#algoritmos-codiciosos)
- [Bitmasks](#bitmasks)
- [Análisis de complejidad](#análisis-de-complejidad)
- [Video lecciones](#video-lecciones)
- [Libros de entrevistas](#libros-de-entrevistas)
- [Noticias de informática](#noticias-de-informática)
- [Árbol de directorios](#árbol-de-directorios)

## YouTube
* [Kevin Naughton Jr.](https://www.youtube.com/channel/UCKvwPt6BifPP54yzH99ff1g)

## The Daily Byte
* [Preparación para entrevistas FAANG](https://thedailybyte.dev/?ref=kevin)

## Instagram 
* [Kevin Naughton Jr.](https://www.instagram.com/kevinnaughtonjr)

## Jueces en línea
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
* [InterviewBit](https://www.interviewbit.com/)

## Entrevistas simuladas en vivo
* [The Daily Byte](https://thedailybyte.dev/mock-interview)

## Práctica de Live Coding
* [The Daily Byte](https://thedailybyte.dev/?ref=kevin)
* [Pramp](https://www.pramp.com/ref/gt4)
* [Gainlo](http://www.gainlo.co/#!/)
* [Refdash](https://refdash.com/)
* [Interviewing.io](https://www.interviewing.io/)

## Estructuras de datos
### Lista enlazada (Linked List)
 * Una lista enlazada es una colección lineal de elementos de datos, llamados nodos, cada uno
   apuntando al siguiente nodo mediante un puntero. Es una estructura de datos
   que consiste en un grupo de nodos que juntos representan una secuencia.
 * **Lista simplemente enlazada**: cada nodo apunta al siguiente nodo y el último nodo apunta a null
 * **Lista doblemente enlazada**: cada nodo tiene dos punteros, p y n, tal que p apunta al nodo anterior y n al siguiente; el puntero n del último nodo apunta a null
 * **Lista circular**: cada nodo apunta al siguiente y el último nodo apunta de vuelta al primero
 * Complejidad temporal:
   * Acceso: `O(n)`
   * Búsqueda: `O(n)`
   * Inserción: `O(1)`
   * Eliminación: `O(1)`

### Pila (Stack)
 * Una pila es una colección de elementos con dos operaciones principales: push (agregar) y
   pop (eliminar el elemento agregado más recientemente)
 * **LIFO (último en entrar, primero en salir)**: el objeto agregado más recientemente es el primero en eliminarse
 * Complejidad temporal:
   * Acceso: `O(n)`
   * Búsqueda: `O(n)`
   * Inserción: `O(1)`
   * Eliminación: `O(1)`

### Cola (Queue)
 * Una cola es una colección de elementos con dos operaciones principales: enqueue (insertar)
   y dequeue (eliminar)
 * **FIFO (primero en entrar, primero en salir)**: el objeto más antiguo agregado es el primero en eliminarse
 * Complejidad temporal:
   * Acceso: `O(n)`
   * Búsqueda: `O(n)`
   * Inserción: `O(1)`
   * Eliminación: `O(1)`

### Árbol
 * Un árbol es un grafo no dirigido, conectado y acíclico

### Árbol binario
 * Un árbol binario es una estructura de datos en la que cada nodo tiene como máximo dos hijos, llamados
   hijo izquierdo e hijo derecho
 * **Árbol completo (Full)**: cada nodo tiene 0 o 2 hijos
 * **Árbol perfecto**: todos los nodos internos tienen dos hijos y todas las hojas tienen la misma profundidad
 * **Árbol completo (Complete)**: todos los niveles, excepto posiblemente el último, están completos y todas las hojas del último nivel están lo más a la izquierda posible

### Árbol binario de búsqueda (BST)
 * Mantiene la propiedad de que el valor en cada nodo es mayor o igual que cualquier valor almacenado en el subárbol izquierdo, y menor o igual que cualquier valor en el subárbol derecho
 * Complejidad temporal:
   * Acceso: `O(log(n))`
   * Búsqueda: `O(log(n))`
   * Inserción: `O(log(n))`
   * Eliminación: `O(log(n))`

<img src="/images/BST.png?raw=true" alt="Árbol Binario de Búsqueda" width="400" height="500">

### Trie
* Un trie, a veces llamado árbol de prefijos o radix, es una estructura de búsqueda usada para almacenar un conjunto dinámico o un arreglo asociativo donde las claves suelen ser cadenas. Ningún nodo almacena la clave asociada con ese nodo; su posición en el árbol define la clave con la que se asocia. Todos los descendientes de un nodo comparten un prefijo común de la cadena asociada con ese nodo, y la raíz se asocia con la cadena vacía.

![Alt text](/images/trie.png?raw=true "Trie")

### Árbol de Fenwick
* Un árbol de Fenwick, también llamado árbol binario indexado, es un árbol en concepto, pero en la práctica se implementa como una estructura implícita usando un arreglo. Dado un índice del arreglo que representa un vértice, el índice del padre o del hijo se calcula mediante operaciones de bits sobre la representación binaria del índice. Cada elemento del arreglo contiene la suma precalculada de un rango de valores, y combinando esa suma con rangos adicionales durante un recorrido hacia la raíz, se calcula la suma prefijo.
* Complejidad temporal:
  * Suma de rango: `O(log(n))`
  * Actualización: `O(log(n))`

![Alt text](/images/fenwickTree.png?raw=true "Árbol de Fenwick")

### Árbol de segmentos
* Estructura para almacenar intervalos o segmentos. Permite consultar qué segmentos almacenados contienen un punto dado
* Complejidad temporal:
  * Consulta de rango: `O(log(n))`
  * Actualización: `O(log(n))`

![Alt text](/images/segmentTree.png?raw=true "Árbol de segmentos")

### Montículo (Heap)
* Un montículo es una estructura de datos basada en árbol que satisface la propiedad de montículo: si A es el padre de B, entonces la clave de A está ordenada respecto a la de B con el mismo orden en todo el montículo. Puede ser un "max heap" o un "min heap".
* Complejidad temporal:
  * Acceder Máx/ Mín: `O(1)`
  * Inserción: `O(log(n))`
  * Eliminación Máx/ Mín: `O(log(n))`

<img src="/images/heap.png?raw=true" alt="Montículo máximo" width="400" height="500">

### Hashing
* El hashing se utiliza para mapear datos de tamaño arbitrario a datos de tamaño fijo. Los valores devueltos por una función hash se llaman valores hash o códigos hash. Si dos claves mapean al mismo valor, ocurre una colisión.
* **Hash Map**: estructura que mapea claves a valores usando una función hash para computar un índice en un arreglo de buckets o ranuras.
* Resolución de colisiones
 * **Encadenamiento separado**: cada bucket es independiente y contiene una lista de entradas para ese índice.
 * **Direcciones abiertas (Open Addressing)**: al insertar, se examinan buckets según una secuencia hasta encontrar un hueco libre.

![Alt text](/images/hash.png?raw=true "Hashing")

### Grafo
* Un grafo es un par ordenado G = (V, E) con un conjunto V de vértices o nodos y un conjunto E de aristas o arcos, que son subconjuntos de 2 elementos de V.
 * **Grafo no dirigido**: la relación de adyacencia es simétrica (si u -> v, entonces v -> u).
 * **Grafo dirigido**: la relación no es simétrica (si u -> v, no implica v -> u).

<img src="/images/graph.png?raw=true" alt="Grafo" width="400" height="500">

## Algoritmos

### Ordenamiento

#### Quicksort
* Estable: `No`
* Complejidad temporal:
  * Mejor caso: `O(nlog(n))`
  * Peor caso: `O(n^2)`
  * Caso promedio: `O(nlog(n))`

![Alt text](/images/quicksort.gif?raw=true "Quicksort")

#### Mergesort
* Divide y vencerás: divide el arreglo en dos mitades, recurre en ambas y luego fusiona las dos mitades ordenadas
* Estable: `Sí`
* Complejidad temporal:
  * Mejor caso: `O(nlog(n))`
  * Peor caso: `O(nlog(n))`
  * Caso promedio: `O(nlog(n))`

![Alt text](/images/mergesort.gif?raw=true "Mergesort")

#### Bucket Sort
* Distribuye los elementos en varios buckets; cada bucket se ordena individualmente (con otro algoritmo o recursivamente)
* Complejidad temporal:
  * Mejor caso: `Ω(n + k)`
  * Peor caso: `O(n^2)`
  * Promedio: `Θ(n + k)`

![Alt text](/images/bucketsort.png?raw=true "Bucket Sort")

#### Radix Sort
* Similar a bucket sort, pero reagrupa (re-bucketing) tras el primer paso en lugar de ordenar y fusionar los buckets
* Complejidad temporal:
  * Mejor caso: `Ω(nk)`
  * Peor caso: `O(nk)`
  * Promedio: `Θ(nk)`

### Algoritmos de grafos

#### Búsqueda en profundidad (DFS)
* Recorre el grafo explorando lo más lejos posible en cada rama antes de retroceder
* Complejidad: `O(|V| + |E|)`

![Alt text](/images/dfsbfs.gif?raw=true "Recorridos DFS / BFS")

#### Búsqueda en anchura (BFS)
* Recorre los nodos vecinos primero, antes de pasar al siguiente nivel
* Complejidad: `O(|V| + |E|)`

![Alt text](/images/dfsbfs.gif?raw=true "Recorridos DFS / BFS")

#### Orden topológico
* Orden lineal de los nodos de un grafo dirigido tal que para cada arista u -> v, u aparece antes que v
* Complejidad: `O(|V| + |E|)`

#### Algoritmo de Dijkstra
* Encuentra el camino más corto entre nodos en un grafo con pesos no negativos
* Complejidad: `O(|V|^2)`

![Alt text](/images/dijkstra.gif?raw=true "Dijkstra")

#### Algoritmo de Bellman-Ford
* Calcula caminos más cortos desde una sola fuente a todos los nodos; maneja aristas con pesos negativos
* Complejidad:
  * Mejor caso: `O(|E|)`
  * Peor caso: `O(|V||E|)`

![Alt text](/images/bellman-ford.gif?raw=true "Bellman-Ford")

#### Algoritmo de Floyd-Warshall
* Encuentra los caminos más cortos entre todos los pares de nodos en un grafo con pesos positivos o negativos, sin ciclos negativos
* Complejidad:
  * Mejor caso: `O(|V|^3)`
  * Peor caso: `O(|V|^3)`
  * Promedio: `O(|V|^3)`

#### Algoritmo de Prim
* Algoritmo codicioso para el árbol de expansión mínima en grafos no dirigidos y ponderados
* Complejidad: `O(|V|^2)`

![Alt text](/images/prim.gif?raw=true "Algoritmo de Prim")

#### Algoritmo de Kruskal
* Otro algoritmo codicioso para árbol de expansión mínima; el grafo no necesita ser conexo
* Complejidad: `O(|E|log|V|)`

![Alt text](/images/kruskal.gif?raw=true "Algoritmo de Kruskal")

## Algoritmos codiciosos (Greedy)
* Hacen elecciones óptimas locales en cada paso con la esperanza de alcanzar la solución global óptima
* Deben cumplir dos propiedades:
 * Estructura óptima de subproblemas
 * Propiedad codiciosa (elegir localmente lo óptimo sin reconsiderar)
* Ejemplo – Cambio de monedas: dado un monto objetivo V y denominaciones disponibles, seleccionar repetidamente la moneda más grande ≤ V hasta llegar a 0

## Bitmasks
* Técnica para operar a nivel de bits; puede mejorar complejidad temporal y uso de memoria
* Protips:
  * Probar k-ésimo bit: `s & (1 << k);`
  * Poner k-ésimo bit: `s |= (1 << k);`
  * Apagar k-ésimo bit: `s &= ~(1 << k);`
  * Alternar k-ésimo bit: `s ^= (1 << k);`
  * Multiplicar por 2^n: `s << n;`
  * Dividir por 2^n: `s >> n;`
  * Intersección: `s & t;`
  * Unión: `s | t;`
  * Resta de conjuntos: `s & ~t;`
  * Extraer bit encendido más bajo: `s & (-s);`
  * Extraer bit apagado más bajo: `~s & (s + 1);`
  * Intercambiar valores:

```
x ^= y;
y ^= x;
x ^= y;
```

## Análisis de complejidad

#### Notación Big O
* Describe la cota superior (peor caso) de un algoritmo

![Alt text](/images/bigO.png?raw=true "Notación Theta")

#### Notación o minúscula
* También describe una cota superior, pero no ajustada asintóticamente

#### Notación Big Ω (Omega)
* Proporciona una cota inferior asintótica

![Alt text](/images/bigOmega.png?raw=true "Notación Theta")

#### Notación ω minúscula
* Cota inferior no ajustada asintóticamente

#### Notación Θ (Theta)
* Cota tal que el algoritmo queda "encerrado" entre una cota superior e inferior para valores suficientemente grandes

![Alt text](/images/theta.png?raw=true "Notación Theta")

## Video lecciones
* Estructuras de datos
    * [UC Berkeley Data Structures](https://archive.org/details/ucberkeley-webcast?&and[]=subject%3A%22Computer%20Science%22&and[]=subject%3A%22CS%22)
    * [MIT Advanced Data Structures](https://www.youtube.com/watch?v=T0yzrZL1py0&list=PLUl4u3cNGP61hsJNdULdudlRL493b-XZf&index=1)
* Algoritmos
    * [MIT Introduction to Algorithms](https://www.youtube.com/watch?v=HtSuA80QTyo&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=1)
    * [MIT Advanced Algorithms](https://www.youtube.com/playlist?list=PL6ogFv-ieghdoGKGg2Bik3Gl1glBTEu8c)
    * [UC Berkeley Algorithms](https://archive.org/details/ucberkeley-webcast?&and[]=subject%3A%22Computer%20Science%22&and[]=subject%3A%22CS%22)

## Libros de entrevistas
* [Competitive Programming 3 - Steven Halim & Felix Halim](https://www.amazon.com/Competitive-Programming-3rd-Steven-Halim/dp/B00FG8MNN8) 
* [Cracking The Coding Interview - Gayle Laakmann McDowell](https://www.amazon.com/Cracking-Coding-Interview-Programming-Questions/dp/0984782850/ref=sr_1_1?s=books&ie=UTF8)
* [Cracking The PM Interview - Gayle Laakmann McDowell & Jackie Bavaro](https://www.amazon.com/Cracking-PM-Interview-Product-Technology-ebook/dp/B00ISYMUR6/ref=sr_1_1?s=books&ie=UTF8)
* [Introduction to Algorithms -  Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest & Clifford Stein](https://www.amazon.com/Introduction-Algorithms-3rd-MIT-Press/dp/0262033844/ref=sr_1_1?ie=UTF8&qid=1490295989&sr=8-1&keywords=Introduction+to+Algorithms)

## Noticias de informática
* [Hacker News](https://news.ycombinator.com/)
* [Lobsters](https://lobste.rs/)

## Árbol de directorios

```
.
├── Array
│   ├── bestTimeToBuyAndSellStock.java
│   ├── findTheCelebrity.java
│   ├── gameOfLife.java
│   ├── increasingTripletSubsequence.java
│   ├── insertInterval.java
│   ├── longestConsecutiveSequence.java
│   ├── maximumProductSubarray.java
│   ├── maximumSubarray.java
│   ├── mergeIntervals.java
│   ├── missingRanges.java
│   ├── productOfArrayExceptSelf.java
│   ├── rotateImage.java
│   ├── searchInRotatedSortedArray.java
│   ├── spiralMatrixII.java
│   ├── subsetsII.java
│   ├── subsets.java
│   ├── summaryRanges.java
│   ├── wiggleSort.java
│   └── wordSearch.java
├── Backtracking
│   ├── androidUnlockPatterns.java
│   ├── generalizedAbbreviation.java
│   └── letterCombinationsOfAPhoneNumber.java
├── BinarySearch
│   ├── closestBinarySearchTreeValue.java
│   ├── firstBadVersion.java
│   ├── guessNumberHigherOrLower.java
│   ├── pow(x,n).java
│   └── sqrt(x).java
├── BitManipulation
│   ├── binaryWatch.java
│   ├── countingBits.java
│   ├── hammingDistance.java
│   ├── maximumProductOfWordLengths.java
│   ├── numberOf1Bits.java
│   ├── sumOfTwoIntegers.java
│   └── utf-8Validation.java
├── BreadthFirstSearch
│   ├── binaryTreeLevelOrderTraversal.java
│   ├── cloneGraph.java
│   ├── pacificAtlanticWaterFlow.java
│   ├── removeInvalidParentheses.java
│   ├── shortestDistanceFromAllBuildings.java
│   ├── symmetricTree.java
│   └── wallsAndGates.java
├── DepthFirstSearch
│   ├── balancedBinaryTree.java
│   ├── battleshipsInABoard.java
│   ├── convertSortedArrayToBinarySearchTree.java
│   ├── maximumDepthOfABinaryTree.java
│   ├── numberOfIslands.java
│   ├── populatingNextRightPointersInEachNode.java
│   └── sameTree.java
├── Design
│   └── zigzagIterator.java
├── DivideAndConquer
│   ├── expressionAddOperators.java
│   └── kthLargestElementInAnArray.java
├── DynamicProgramming
│   ├── bombEnemy.java
│   ├── climbingStairs.java
│   ├── combinationSumIV.java
│   ├── countingBits.java
│   ├── editDistance.java
│   ├── houseRobber.java
│   ├── paintFence.java
│   ├── paintHouseII.java
│   ├── regularExpressionMatching.java
│   ├── sentenceScreenFitting.java
│   ├── uniqueBinarySearchTrees.java
│   └── wordBreak.java
├── HashTable
│   ├── binaryTreeVerticalOrderTraversal.java
│   ├── findTheDifference.java
│   ├── groupAnagrams.java
│   ├── groupShiftedStrings.java
│   ├── islandPerimeter.java
│   ├── loggerRateLimiter.java
│   ├── maximumSizeSubarraySumEqualsK.java
│   ├── minimumWindowSubstring.java
│   ├── sparseMatrixMultiplication.java
│   ├── strobogrammaticNumber.java
│   ├── twoSum.java
│   └── uniqueWordAbbreviation.java
├── LinkedList
│   ├── addTwoNumbers.java
│   ├── deleteNodeInALinkedList.java
│   ├── mergeKSortedLists.java
│   ├── palindromeLinkedList.java
│   ├── plusOneLinkedList.java
│   ├── README.md
│   └── reverseLinkedList.java
├── Queue
│   └── movingAverageFromDataStream.java
├── README.md
├── Sort
│   ├── meetingRoomsII.java
│   └── meetingRooms.java
├── Stack
│   ├── binarySearchTreeIterator.java
│   ├── decodeString.java
│   ├── flattenNestedListIterator.java
│   └── trappingRainWater.java
├── String
│   ├── addBinary.java
│   ├── countAndSay.java
│   ├── decodeWays.java
│   ├── editDistance.java
│   ├── integerToEnglishWords.java
│   ├── longestPalindrome.java
│   ├── longestSubstringWithAtMostKDistinctCharacters.java
│   ├── minimumWindowSubstring.java
│   ├── multiplyString.java
│   ├── oneEditDistance.java
│   ├── palindromePermutation.java
│   ├── README.md
│   ├── reverseVowelsOfAString.java
│   ├── romanToInteger.java
│   ├── validPalindrome.java
│   └── validParentheses.java
├── Tree
│   ├── binaryTreeMaximumPathSum.java
│   ├── binaryTreePaths.java
│   ├── inorderSuccessorInBST.java
│   ├── invertBinaryTree.java
│   ├── lowestCommonAncestorOfABinaryTree.java
│   ├── sumOfLeftLeaves.java
│   └── validateBinarySearchTree.java
├── Trie
│   ├── addAndSearchWordDataStructureDesign.java
│   ├── implementTrie.java
│   └── wordSquares.java
└── TwoPointers
    ├── 3Sum.java
    ├── 3SumSmaller.java
    ├── mergeSortedArray.java
    ├── minimumSizeSubarraySum.java
    ├── moveZeros.java
    ├── removeDuplicatesFromSortedArray.java
    ├── reverseString.java
    └── sortColors.java

18 directories, 124 files
```


