> * Todo el material compartido a excepción de este, en el repositorio únicamente se encuentra en inglés.
> * Dirección original：[github.com/kdn251/interviews](https://github.com/kdn251/interviews)
> * Use este [enlace](https://github.com/xitu/interviews/compare/master...kdn251:master) para ver si hay alguna diferencia entre esta traducción y la versión en inglés ( si no ve un cambio en README.md, eso significa que esta traducción está actualizada ).

# Entrevistas
> Una guía personal para entrevistas técnicas de ingeniería de software.
>
> Actualizado Por: [Kevin Naughton Jr.](https://github.com/kdn251)

## Traducciones actualmente disponibles

- [English](./README.md)
- [Chino simplificado](./README-zh-cn.md)

## Tabla de contenido
- [YouTube](#youtube)
- [The Daily Byte](#the-daily-byte)
- [Artículos](#artículos)
- [Prácticas de codificación](#Prácticas-de-codificación)
- [Prácticas de codificación en vivo](#prácticas-de-codificación-en-vivo)
- [Estructuras de datos (Data Structures)](#Estructuras-de-datos)
- [Algoritmos (Algorithms)](#algoritmos)
- [Algoritmos Voraces (Greedy Algorithms)](#Algoritmos-Voraces)
- [Máscaras de bits (Bitmasks)](#Máscaras-de-Bits)
- [Análisis de tiempo de ejecución (Runtime Analysis)](#Análisis-de-tiempo-de-ejecución)
- [Videoconferencias](#videoconferencias)
- [Libros sobre entrevistas](#libros-sobre-entrevistas)
- [Noticias de informática](#noticias-de-informática)
- [Árbol de directorios](#árbol-de-directorios)

## YouTube
* [Kevin Naughton Jr.](https://www.youtube.com/channel/UCKvwPt6BifPP54yzH99ff1g)

## The Daily Byte
* [FAANG Interview Prep](https://bit.ly/2BaaSaK)

## Artículos
* [Starting Work](https://medium.com/@Naughton/starting-work-b06e10f6007e)

## Prácticas de codificación
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

## Prácticas de codificación en vivo
* [Pramp](https://www.pramp.com/ref/gt4)
* [Gainlo](http://www.gainlo.co/#!/)
* [Refdash](https://refdash.com/)
* [Interviewing.io](https://www.interviewing.io/)

## Estructuras de datos
### Listas Enlazadas (Linked List)
 * Una *Listas Enlazadas* o *Linked List* es una colección lineal de elementos de datos, llamados nodos, 
   cada uno de los cuales apunta al siguiente nodo mediante un puntero. 
   Es una estructura de datos que consiste en un grupo de nodos que juntos representan una secuencia.
 * **Lista Simplemente Enlazada (Singly-Linked List)**: Es aquella en la cual cada nodo contiene un enlace al siguiente nodo y último nodo contiene un enlace apunta a nulo.
 * **Lista Doblemente Enlazada (Doubly-Linked List)**: Es aquella en la cual cada nodo tiene dos punteros, p y n, tal que p (previous) apunta al nodo anterior y n (next) apunta al siguiente nodo; el puntero n (next) del último nodo apunta a nulo.
 * **Lista Enlazada Circular (Circular-Linked List)**: Es aquella en la cual cada nodo apunta al siguiente nodo y el último nodo apunta al primer nodo.
 * Complejidad temporal:
   * Acceso: `O(n)`
   * Búsqueda: `O(n)`
   * Inserción: `O(1)`
   * Eliminación: `O(1)`

### Pila (Stack)
 * Una *Pila* o *Stack* es una colección de elementos, con dos operaciones principales: *push*, que inserta un valor ala colección, and
   *pop*, que elimina el elemento agregado más recientemente.
 * **El último que entra es el primero en salir (LIFO)**: El objeto agregado más recientemente es el primero en ser eliminado
 * Complejidad temporal:
   * Acceso: `O(n)`
   * Búsqueda: `O(n)`
   * Inserción: `O(1)`
   * Eliminación: `O(1)`

### Cola (Queue)
 * Una *Cola* o *Queue* es una colección de elementos que admite dos operaciones principales: *enqueue*, que inserta un elemento en la cola, 
   y *dequeue*, que elimina un elemento de la cola.
 * **Primero en entrar, primero en salir (FIFO)**: El objeto agregado más antiguo es el primero en ser eliminado.
 * Complejidad temporal:
   * Acceso: `O(n)`
   * Búsqueda: `O(n)`
   * Inserción: `O(1)`
   * Eliminación: `O(1)`

### Árbol (Tree)
 * Un *Árbol* o *Tree*  es un grafo acíclico, conexo y no dirigido.

### Árbol binario (Binary Tree)
 * Un *Árbol Binario* es una estructura de datos de árbol en la que cada nodo tiene como máximo dos hijos, 
   a los que se hace referencia como el *hijo izquierdo* y el *hijo derecho*.
 * **Árbol binario lleno**: Es un árbol en el que cada nodo tiene 0 o 2 hijos
 * **Árbol binario perfecto**: Es un árbol lleno en el que todos los nodos interiores tienen dos hijos y todas las salidas tienen la misma profundidad.
 * **Árbol binario completo**: Es un árbol en el que todos los niveles, excepto posiblemente el último, están llenos y todos los nodos del último nivel
   están lo más a la izquierda posible.

### Árbol de búsqueda binaria (Binary Search Tree)
 * Un Árbol de búsqueda binaria, en ocasiones llamado BST, es un tipo de árbol binario que mantiene la propiedad de que el valor en cada
   nodo debe ser mayor o igual que cualquier valor almacenado en el subárbol izquierdo, y menor o igual que cualquier valor almacenado
   en el subárbol de la derecha.
 * Complejidad temporal:
   * Acceso: `O(log(n))`
   * Búsqueda: `O(log(n))`
   * Inserción: `O(log(n))`
   * Eliminación: `O(log(n))`

<img src="/images/BST.png?raw=true" alt="Binary Search Tree" width="400" height="500">

### Trie
* Un trie (también llamado árbol de prefijos o base), es un tipo de árbol de búsqueda que se utiliza para almacenar un conjunto dinámico o asociativo en un array
  donde las claves suelen ser cadenas. Ningún nodo del árbol almacena la clave asociada con ese nodo; en cambio, su posición
  en el árbol define la clave con la que está asociado. Todos los descendientes de un nodo tienen un prefijo común del String asociado
  con ese nodo, y la raíz está asociada con el String vacío.

![Alt text](/images/trie.png?raw=true "Trie")

### Árbol de Fenwick (Fenwick Tree)
* Un Árbol Fenwick, también llamado árbol binario indexado, es un árbol en concepto, pero en la práctica se implementa como una estructura de datos
  implícita que utiliza una matriz. Dado un índice en la matriz que representa un vértice, el índice de un vértice padre o hijo se calcula
  a través de operaciones en sentido de los bits sobre la representación binaria de su índice. Cada elemento de la matriz contiene la suma precalculada de
  un rango de valores, y combinando esa suma con rangos adicionales encontrados durante un recorrido ascendente hacia la raíz, se calcula la suma del prefijo.
* Complejidad temporal:
  * Rango de Suma: `O(log(n))`
  * Actualización: `O(log(n))`

![Alt text](/images/fenwickTree.png?raw=true "Fenwick Tree")

### Árbol de segmento (Segment Tree)
* Un Árbol de segmento, es una estructura de datos de árbol para almacenar intervalos o segmentos. Permite consultar cuál de los segmentos almacenados contiene
  un punto dado.
* Complejidad temporal:
  * Consulta de intervalo: `O(log(n))`
  * Actualización: `O(log(n))`

![Alt text](/images/segmentTree.png?raw=true "Segment Tree")

### Montículo (Heap)
* Un *Montículo (Heap)* es una estructura de datos de estructura basada en árbol especializada que satisface la propiedad *heap*: si A es un nodo principal de
B, luego, la clave (el valor) del nodo A se ordena con respecto a la clave del nodo B y se aplica el mismo orden en todo el montículo.
Un montículo se puede clasificar además como un "Montículo máximo" o un "Montículo mínimo". En un montículo máximo son las claves de los nodos principales, son siempre mayores
que o igual a los de los hijos y la clave más alta está en el nodo raíz. En un montículo mínimo son las claves de los nodos principales, son menores que
o igual a las de los hijos y la clave más baja está en el nodo raíz.
* Complejidad temporal:
  * Acceso Max / Min: `O(1)`
  * Inserción: `O(log(n))`
  * Eliminación Max / Min: `O(log(n))`

<img src="/images/heap.png?raw=true" alt="Max Heap" width="400" height="500">


### Hashing
* *Hashing* se utiliza para mapear datos de un tamaño arbitrario a datos de un tamaño fijo. Los valores devueltos por una
  función hash se denominan valores hash, códigos hash o simplemente hash. Si dos claves se asignan al mismo valor, se produce una colisión.
* **Hash Map**: un *Hash Map* es una estructura que puede asignar claves a valores. Un Hash Map utiliza una función hash para calcular un índice 
  en una array de cubos o ranuras, a partir de la cual se puede encontrar el valor deseado.
* Resolución de colisión
* **Encadenamiento separado (Separate Chaining)**: En el *encadenamiento separado*, cada balde (Bucket) es independiente y contiene una lista de entradas para cada índice.
El tiempo para las operaciones del hash map es el tiempo para encontrar el depósito (tiempo constante), más el tiempo para recorrer la lista.
* **Direccionamiento abierto (Open Addressing)**: En el *direccionamiento abierto*, cuando se inserta una nueva entrada, los baldes (Bucket) son examinados, comenzando con el
 hash-to-slot y procediendo en alguna secuencia, hasta que se encuentre una ranura desocupada. El nombre de direccionamiento abierto se refiere al
 el hecho de que la ubicación de un elemento no siempre está determinada por su valor hash.


![Alt text](/images/hash.png?raw=true "Hashing")

### Grafo (Graph)
* Un *Grafo* es un par ordenado de G = (V, E) que comprende un conjunto V de vértices o nodos junto con un conjunto E de aristas o arcos,
  que son subconjuntos de 2 elementos de V (es decir, una arista está asociada con dos vértices, y esa asociación toma la forma del par 
  desordenado que comprende esos dos vértices)
* **Grafo no dirigido (Undirected Graph)**: Es un Grafo en el que la relación de adyacencia es simétrica. Entonces, si existe un borde desde el nodo u hasta el nodo
  v (u -> v), entonces también se da el caso de que existe una arista desde el nodo v al nodo u (v -> u).
* **Grafo dirigido (Directed Graph)**: Es un Grafo en el que la relación de adyacencia no es simétrica. Entonces, si existe un borde desde el nodo u hasta el nodo v
  (u -> v), esto *no* implica que existe un borde desde el nodo v hasta el nodo u (v -> u).


<img src="/images/graph.png?raw=true" alt="Graph" width="400" height="500">

## Algoritmos

### Ordenamiento (Sorting)

#### El ordenamiento rápido (Quicksort)
* Estable: `No`
* Complejidad temporal:
  * Mejor Caso: `O(nlog(n))`
  * Peor Caso: `O(n^2)`
  * Caso Promedio: `O(nlog(n))`

![Alt text](/images/quicksort.gif?raw=true "Quicksort")

#### Ordenamiento por Mezcla (Mergesort)
* El *Ordenamiento por Mezcla* es también un algoritmo de "divide y vencerás". Divide continuamente una array en dos mitades, recorre tanto el
  subarray izquierda y subarray derecha y luego fusiona las dos mitades ordenadas
* Estable: `Yes`
* Complejidad temporal:
  * Mejor Caso: `O(nlog(n))`
  * Peor Caso: `O(nlog(n))`
  * Caso Promedio: `O(nlog(n))`

![Alt text](/images/mergesort.gif?raw=true "Mergesort")

#### El Ordenamiento por Casilleros (Bucket Sort)
* El *Ordenamiento por Casilleros* es un algoritmo de ordenación que funciona distribuyendo los elementos de un array en una serie de contenedores. cada contenedor se ordena individualmente,
  bien utilizando un algoritmo de ordenación diferente, bien aplicando recursivamente el algoritmo de ordenación por casilleros.
* Complejidad temporal:
  * Mejor Caso: `Ω(n + k)`
  * Peor Caso: `O(n^2)`
  * Caso Promedio: `Θ(n + k)`

![Alt text](/images/bucketsort.png?raw=true "Bucket Sort")

#### Ordenamiento Radix (Radix Sort)
* El *Ordenamiento Radix* es un algoritmo de ordenación que como el bucket sort, distribuye los elementos de una matriz en varios contenedores. Sin embargo, el
  ordenamiento radix se diferencia de la ordenación Bucket Sort en que "vuelve a colocar" en el array después de la pasada inicial, en lugar de ordenar cada contenedor y fusionar.
* Complejidad temporal:
  * Mejor Caso: `Ω(nk)`
  * Peor Caso: `O(nk)`
  * Caso Promedio: `Θ(nk)`

### Algoritmos de grafos (Graph Algorithms)

#### Búsqueda en profundidad (Depth First Search)
* La *Búsqueda en Profundidad* es un algoritmo de recorrido del grafo que explora lo más lejos posible a lo largo de cada rama antes de retroceder.
* Complejidad temporal: `O(|V| + |E|)`

![Alt text](/images/dfsbfs.gif?raw=true "DFS / BFS Traversal")

#### Búsqueda Primero en Amplitud (Breadth First Search)
* La *Búsqueda Primero en Amplitud* es un algoritmo de recorrido del grafo que explora primero los nodos vecinos,
  antes de pasar a los vecinos del siguiente nivel.
* Complejidad temporal: `O(|V| + |E|)`

![Alt text](/images/dfsbfs.gif?raw=true "DFS / BFS Traversal")

#### Ordenamiento Topológico (Topological Sort)
* El *Ordenamiento Topológico* es el ordenamiento lineal de los nodos de un grafo dirigido tal que para cada arista del nodo u al nodo v, u
  es anterior a v en el ordenamiento.
* Complejidad temporal: `O(|V| + |E|)`

#### Algoritmo de Dijkstra (Dijkstra's Algorithm)
* El *Algoritmo de Dijkstra* es un algoritmo para encontrar el camino más corto entre los nodos de un grafo.
* Complejidad temporal: `O(|V|^2)`

![Alt text](/images/dijkstra.gif?raw=true "Dijkstra's")

#### Algoritmo de Bellman-Ford (Bellman-Ford Algorithm)
* El *Algoritmo de Bellman-Ford* es un algoritmo que calcula los caminos más cortos desde un único nodo de origen a todos los demás nodos de un grafo ponderado.
* Aunque es más lento que el de Dijkstra, es más versátil, ya que es capaz de manejar grafos en los que algunos de los pesos de las aristas son
  números negativos.
* Complejidad temporal:
  * Mejor Caso: `O(|E|)`
  * Peor Caso: `O(|V||E|)`

![Alt text](/images/bellman-ford.gif?raw=true "Bellman-Ford")

#### El Algoritmo de Floyd-Warshall (Floyd-Warshall Algorithm)
* El *Algoritmo de Floyd-Warshall* es un algoritmo para encontrar los caminos más cortos en un grafo ponderado con pesos de aristas positivos o negativos, pero
  sin ciclos negativos.
* En una sola ejecución del algoritmo encontrará las longitudes (pesos sumados) de las rutas más cortas entre *todos* los pares de nodos.
* Complejidad temporal:
  * Mejor Caso: `O(|V|^3)`
  * Peor Caso: `O(|V|^3)`
  * Caso Promedio: `O(|V|^3)`

#### El Algoritmo de Prim (Prim's Algorithm)
* El *Algoritmo de Prim* es un algoritmo voraz (Greedy Algorithm) que encuentra un árbol de expansión mínimo para un grafo no dirigido ponderado. En otras palabras, Prim's encuentra un
  subconjunto de aristas que forma un árbol que incluye todos los nodos del grafo
* Complejidad temporal: `O(|V|^2)`

![Alt text](/images/prim.gif?raw=true "Prim's Algorithm")

#### El Algoritmo de Kruskal (Kruskal's Algorithm)
* El *Algoritmo de Kruskal* es también un algoritmo voraz (Greedy Algorithm) que encuentra un árbol de expansión mínimo en un grafo. Sin embargo, en el de Kruskal, el grafo no
  tiene que estar conectado
* Complejidad temporal: `O(|E|log|V|)`

![Alt text](/images/kruskal.gif?raw=true "Kruskal's Algorithm")

## Algoritmos Voraces
* Los *Algoritmos Voraces (Greedy Algorithms)* son algoritmos que toman decisiones localmente óptimas en cada paso con la esperanza de alcanzar finalmente la solución globalmente óptima.
* Los problemas deben presentar dos propiedades para poder aplicar una solución Voraz:
 * Subestructura Óptima
    * Una solución óptima del problema contiene soluciones óptimas para los subproblemas del problema dado.
 * La Propiedad Voraz
    * Se llega a una solución óptima eligiendo "con avidez" la opción localmente óptima sin reconsiderar nunca las opciones anteriores.
* Ejemplo - Cambio de moneda
    * Dada una cantidad objetiva de V centavos y una lista de denominaciones de n monedas, es decir, tenemos coinValue[i] (en centavos) para tipos de monedas i de [0...n - 1],
      ¿cuál es el número mínimo de monedas que debemos usar para representar la cantidad V? Supongamos que tenemos un suministro ilimitado de monedas de cualquier tipo.
    * Monedas - Penny (1 centavo), Nickel (5 centavos), Dime (10 centavos), Quarter (25 centavos)
    * Suponga que V = 41. Podemos usar el algoritmo Greedy de seleccionar continuamente la denominación de moneda más grande menor o igual a V, restar eso
      valor de la moneda de V, y repita.
    * V = 41 | 0 monedas utilizadas
    * V = 16 | 1 moneda utilizada (41 - 25 = 16)
    * V = 6  | 2 monedas utilizadas (16 - 10 = 6)
    * V = 1  | 3 monedas utilizadas (6 - 5 = 1)
    * V = 0  | 4 monedas utilizadas (1 - 1 = 0)
    * Usando este algoritmo, llegamos a un total de 4 monedas, lo cual es óptimo

## Máscaras de Bits
* Las Máscaras de Bits (Bitmasks) es una técnica utilizada para realizar operaciones a nivel de bits. El aprovechamiento de las máscaras de bits a menudo conduce a una mayor complejidad en tiempo de ejecución y
  ayuda a limitar el uso de la memoria.
* Probar el kth bit: `s & (1 << k);`
* Establecer el kth bit: `s |= (1 << k);`
* El bit kth es cero: `s &= ~(1 << k);`
* Alternar kth bit: `s ^= (1 << k);`
* Múltiple por 2<sup>n</sup>: `s << n;`
* Divide por 2<sup>n</sup>: `s >> n;`
* Intersección: `s & t;`
* Unión: `s | t;`
* Establecer resta: `s & ~t;`
* Obtener el bit más pequeño distinto de 0（Extract lowest set bit）: `s & (-s);`
* Recuperar el mínimo de bits 0（Extract lowest unset bit）: `~s & (s + 1);`
* Intercambiar valores:
             ```
                x ^= y;
                y ^= x;
                x ^= y;
             ```

## Análisis de tiempo de ejecución

#### Notación Big O (Big O Notation)
* La *Notación Big O* se utiliza para describir el límite superior de un algoritmo particular. Big O se usa para describir los peores escenarios.

![Alt text](/images/bigO.png?raw=true "Theta Notation")

#### Notación de la O Pequeña (Little O Notation)
* La *Notación de la O Pequeña* también se utiliza para describir un límite superior de un algoritmo particular; sin embargo, Little O proporciona un límite
  que no es asintóticamente ajustada.

#### Notación Omega Grande (Big Ω Omega Notation)
* La *Notación Omega Grande* se utiliza para proporcionar un límite inferior asintótico en un algoritmo particular.

![Alt text](/images/bigOmega.png?raw=true "Theta Notation")

#### Pequeña ω Notación Omega (Little ω Omega Notation)
* La *Pequeña Notación Omega* se utiliza para proporcionar un límite inferior en un algoritmo particular que no es asintóticamente ajustado.

#### Notación Theta Θ (Theta Θ Notation)
* La *Notación Theta* se utiliza para proporcionar un límite en un algoritmo particular de modo que pueda ser "intercalado" entre
  dos constantes (una para un límite superior y otra para un límite inferior) para valores suficientemente grandes.

![Alt text](/images/theta.png?raw=true "Theta Notation")

## Videoconferencias
* Estructuras de datos
    * [UC Berkeley Data Structures](https://archive.org/details/ucberkeley-webcast?&and[]=subject%3A%22Computer%20Science%22&and[]=subject%3A%22CS%22)
    * [MIT Advanced Data Structures](https://www.youtube.com/watch?v=T0yzrZL1py0&list=PLUl4u3cNGP61hsJNdULdudlRL493b-XZf&index=1)
* Algoritmos
    * [MIT Introduction to Algorithms](https://www.youtube.com/watch?v=HtSuA80QTyo&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=1)
    * [MIT Advanced Algorithms](https://www.youtube.com/playlist?list=PL6ogFv-ieghdoGKGg2Bik3Gl1glBTEu8c)
    * [UC Berkeley Algorithms](https://archive.org/details/ucberkeley-webcast?&and[]=subject%3A%22Computer%20Science%22&and[]=subject%3A%22CS%22)

## Libros sobre entrevistas
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
│   ├── bestTimeToBuyAndSellStock.java
│   ├── findTheCelebrity.java
│   ├── gameOfLife.java
│   ├── increasingTripletSubsequence.java
│   ├── insertInterval.java
│   ├── longestConsecutiveSequence.java
│   ├── maximumProductSubarray.java
│   ├── maximumSubarray.java
│   ├── mergeIntervals.java
│   ├── missingRanges.java
│   ├── productOfArrayExceptSelf.java
│   ├── rotateImage.java
│   ├── searchInRotatedSortedArray.java
│   ├── spiralMatrixII.java
│   ├── subsetsII.java
│   ├── subsets.java
│   ├── summaryRanges.java
│   ├── wiggleSort.java
│   └── wordSearch.java
├── Backtracking
│   ├── androidUnlockPatterns.java
│   ├── generalizedAbbreviation.java
│   └── letterCombinationsOfAPhoneNumber.java
├── BinarySearch
│   ├── closestBinarySearchTreeValue.java
│   ├── firstBadVersion.java
│   ├── guessNumberHigherOrLower.java
│   ├── pow(x,n).java
│   └── sqrt(x).java
├── BitManipulation
│   ├── binaryWatch.java
│   ├── countingBits.java
│   ├── hammingDistance.java
│   ├── maximumProductOfWordLengths.java
│   ├── numberOf1Bits.java
│   ├── sumOfTwoIntegers.java
│   └── utf-8Validation.java
├── BreadthFirstSearch
│   ├── binaryTreeLevelOrderTraversal.java
│   ├── cloneGraph.java
│   ├── pacificAtlanticWaterFlow.java
│   ├── removeInvalidParentheses.java
│   ├── shortestDistanceFromAllBuildings.java
│   ├── symmetricTree.java
│   └── wallsAndGates.java
├── DepthFirstSearch
│   ├── balancedBinaryTree.java
│   ├── battleshipsInABoard.java
│   ├── convertSortedArrayToBinarySearchTree.java
│   ├── maximumDepthOfABinaryTree.java
│   ├── numberOfIslands.java
│   ├── populatingNextRightPointersInEachNode.java
│   └── sameTree.java
├── Design
│   └── zigzagIterator.java
├── DivideAndConquer
│   ├── expressionAddOperators.java
│   └── kthLargestElementInAnArray.java
├── DynamicProgramming
│   ├── bombEnemy.java
│   ├── climbingStairs.java
│   ├── combinationSumIV.java
│   ├── countingBits.java
│   ├── editDistance.java
│   ├── houseRobber.java
│   ├── paintFence.java
│   ├── paintHouseII.java
│   ├── regularExpressionMatching.java
│   ├── sentenceScreenFitting.java
│   ├── uniqueBinarySearchTrees.java
│   └── wordBreak.java
├── HashTable
│   ├── binaryTreeVerticalOrderTraversal.java
│   ├── findTheDifference.java
│   ├── groupAnagrams.java
│   ├── groupShiftedStrings.java
│   ├── islandPerimeter.java
│   ├── loggerRateLimiter.java
│   ├── maximumSizeSubarraySumEqualsK.java
│   ├── minimumWindowSubstring.java
│   ├── sparseMatrixMultiplication.java
│   ├── strobogrammaticNumber.java
│   ├── twoSum.java
│   └── uniqueWordAbbreviation.java
├── LinkedList
│   ├── addTwoNumbers.java
│   ├── deleteNodeInALinkedList.java
│   ├── mergeKSortedLists.java
│   ├── palindromeLinkedList.java
│   ├── plusOneLinkedList.java
│   ├── README.md
│   └── reverseLinkedList.java
├── Queue
│   └── movingAverageFromDataStream.java
├── README.md
├── Sort
│   ├── meetingRoomsII.java
│   └── meetingRooms.java
├── Stack
│   ├── binarySearchTreeIterator.java
│   ├── decodeString.java
│   ├── flattenNestedListIterator.java
│   └── trappingRainWater.java
├── String
│   ├── addBinary.java
│   ├── countAndSay.java
│   ├── decodeWays.java
│   ├── editDistance.java
│   ├── integerToEnglishWords.java
│   ├── longestPalindrome.java
│   ├── longestSubstringWithAtMostKDistinctCharacters.java
│   ├── minimumWindowSubstring.java
│   ├── multiplyString.java
│   ├── oneEditDistance.java
│   ├── palindromePermutation.java
│   ├── README.md
│   ├── reverseVowelsOfAString.java
│   ├── romanToInteger.java
│   ├── validPalindrome.java
│   └── validParentheses.java
├── Tree
│   ├── binaryTreeMaximumPathSum.java
│   ├── binaryTreePaths.java
│   ├── inorderSuccessorInBST.java
│   ├── invertBinaryTree.java
│   ├── lowestCommonAncestorOfABinaryTree.java
│   ├── sumOfLeftLeaves.java
│   └── validateBinarySearchTree.java
├── Trie
│   ├── addAndSearchWordDataStructureDesign.java
│   ├── implementTrie.java
│   └── wordSquares.java
└── TwoPointers
    ├── 3Sum.java
    ├── 3SumSmaller.java
    ├── mergeSortedArray.java
    ├── minimumSizeSubarraySum.java
    ├── moveZeros.java
    ├── removeDuplicatesFromSortedArray.java
    ├── reverseString.java
    └── sortColors.java

18 directorios, 124 archivos
```
