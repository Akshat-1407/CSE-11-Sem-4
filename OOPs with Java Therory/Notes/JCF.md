# Java Collection Framework

## Collection Interface
* java.util Package
* Defines the basic operations
* It's a generic Interface

| Method                                   | Return Type     | Description                                                                |
|------------------------------------------|-----------------|----------------------------------------------------------------------------|
| `add(E e)`                               | `boolean`       | Adds the specified element to the collection.                              |
| `addAll(Collection<? extends E> c)`      | `boolean`       | Adds all elements from the specified collection.                           |
| `clear()`                                | `void`          | Removes all elements from the collection.                                  |
| `contains(Object o)`                     | `boolean`       | Checks if the collection contains the specified element.                   |
| `containsAll(Collection<?> c)`           | `boolean`       | Checks if the collection contains all elements of the given collection.    |
| `isEmpty()`                              | `boolean`       | Returns true if the collection has no elements.                            |
| `iterator()`                             | `Iterator<E>`   | Returns an iterator to traverse the collection.                            |
| `remove(Object o)`                       | `boolean`       | Removes a single instance of the specified element.                        |
| `removeAll(Collection<?> c)`             | `boolean`       | Removes all elements that are also in the specified collection.            |
| `retainAll(Collection<?> c)`             | `boolean`       | Keeps only the elements that are also in the specified collection.         |
| `size()`                                 | `int`           | Returns the number of elements in the collection.                          |
| `toArray()`                              | `Object[]`      | Converts the collection into an array.                                     |

## List Interface
* java.util Package
* Ordered Collection
* Allows Duplicates

| Method                                   | Return Type        | Description                                                             |
|------------------------------------------|--------------------|-------------------------------------------------------------------------|
| `get(int index)`                         | `E`                | Returns the element at the specified position.                          |
| `set(int index, E element)`              | `E`                | Replaces the element at the specified position with the given element.  |
| `add(int index, E element)`              | `void`             | Inserts the element at the specified position.                          |
| `remove(int index)`                      | `E`                | Removes the element at the specified position.                          |
| `indexOf(Object o)`                      | `int`              | Returns the index of the first occurrence of the specified element.     |
| `lastIndexOf(Object o)`                  | `int`              | Returns the index of the last occurrence of the specified element.      |
| `listIterator()`                         | `ListIterator<E>`  | Returns a list iterator to traverse the list.                           |
| `listIterator(int index)`                | `ListIterator<E>`  | Returns a list iterator starting at the specified index.                |
| `subList(int fromIndex, int toIndex)`    | `List<E>`          | Returns a view of the list between the given indices.                   |


## ArrayList
* java.util Package
* Dynamic Array, Ordered Collection, Allows Duplicates, Supports Indexing
* ArrayList is not thread safe i.e. it is not synchronized, so it should not be used in multi-threaded environments unless externally synchronized
* ArrayList inherits most of its functionality(Methods) from the List interface


## Iterator     
* It is present in the java.util package.
* The Iterator interface is used to traverse (visit) elements in a Collection one by one.
* It works with all Collection types
* follows forward-only traversal (one direction).
* Commonly used in loops to iterate over collections.
* It provides a safe way to access elements without exposing the internal structure of the collection.

```java
    List<String> movies = new ArrayList<>(Arrays.asList("Inception", "Interstellar", "Tenet"));
    Iterator<String> it = movies.iterator();

    while (it.hasNext()) {
        String movie = it.next();
        if (movie.equals("Tenet")) {
            it.remove(); // This is safe!
        }
    }
```

## Vector
* java.util Package
* Dynamic Array, Ordered Collecion, Allows Duplicates, Supports Indexing, Legacy Class, Thread Safe, Slower than ArrayList
* Vector is thread-safe. All its main methods are "synchronized," which means only one part of your program can access it at a time.
* Vector can be slower than ArrayList, especially if your program doesn't need to handle multiple threads.

| Method                              | Return Type | Description                                                                                  |
|-------------------------------------|-------------|----------------------------------------------------------------------------------------------|
| `addElement(E obj)`                 | `void`      | Adds an element to the end of the vector. (Legacy equivalent of `add(E e)`)                  |
| `firstElement()`                    | `E`         | Returns the first element in the vector. Throws `NoSuchElementException` if empty.           | 
| `lastElement()`                     | `E`         | Returns the last element in the vector. Throws `NoSuchElementException` if empty.            |
| `insertElementAt(E obj, int index)` | `void`      | Inserts an element at the specified index.                                                   |
| `removeElementAt(int index)`        | `void`      | Removes the element at the specified index.                                                  |
| `removeElement(Object obj)`         | `boolean`   | Removes the first occurrence of the specified object. Returns true if removed.               |
| `removeAllElements()`               | `void`      | Removes all elements from the vector. Equivalent to `clear()`, but legacy style.             |
| `capacity()`                        | `int`       | Returns the current capacity (i.e., how many elements the vector can hold without resizing). |


## Stack (extends Vector)
* java.util Package
* LIFO, Dynamic Array, Legacy Class, Generic Class
* Since Stack extends Vector, it is synchronized i.e. it is thread-safe, but may be slower in single-threaded environments.

| Method               | Return Type | Description                                                                                        |
|----------------------|-------------|----------------------------------------------------------------------------------------------------|
| `push(E item)`       | `E`         | Adds an item to the top of the stack.                                                              |
| `pop()`              | `E`         | Removes and returns the top item of the stack. Throws `EmptyStackException` if the stack is empty. |
| `peek()`             | `E`         | Returns the top item without removing it.                                                          |
| `empty()`            | `boolean`   | Returns true if the stack is empty, otherwise false.                                               |
| `search(Object o)`   | `int`       | Returns the 1-based position of the item from the top of the stack. Returns -1 if not found.       |


## Queue
* java.util Package
* FIFO, generic interface
* Queue<String> movieQueue = new LinkedList<>();
* Since Queue is an interface, we cannot create objects from it directly. Common classes that implement it are LinkedList, PriorityQueue, and ArrayDeque

| Method        | Return Type | Description                                                                |
|---------------|-------------|----------------------------------------------------------------------------|
| `add(E e)`    | `boolean`   | Inserts the element. Throws exception if the queue is full.                |
| `offer(E e)`  | `boolean`   | Inserts the element. Returns false if the queue is full.                   |
| `remove()`    | `E`         | Removes and returns the head of the queue. Throws exception if empty.      |
| `poll()`      | `E`         | Removes and returns the head of the queue. Returns null if empty.          |
| `element()`   | `E`         | Returns the head without removing. Throws exception if empty.              |
| `peek()`      | `E`         | Returns the head without removing. Returns null if empty.                  |


## LinkedList
* java.util Package
* Implemented as `Doubly LinkedList`, Allows Duplicate, Dynamic Size, Allows Null Values, Ordered
* It implements both the List and Deque (extends Queue) interfaces, which means it can be used as a list, a queue, or a stack.

* add, addFirst, addLast, remove, removeFirst, removeLast, getFirst, getLast


## Set Interface
* java.util Package
* does not allow duplicate elements
* Since Set is an interface, we cannot create objects directly from it. Instead, we use classes like HashSet, LinkedHashSet, and TreeSet, which are different implementations of the Set interface.


## HashSet Class
* The HashSet class is an implementation of the Set interface and is part of the java.util package.
* It `stores unique elements` only, and duplicates are automatically discarded.
* HashSet `does not maintain any order` of its elements. The elements are stored based on their hash values, which makes insertion and retrieval operations very efficient.
* It `allows the insertion of one null element`.
* HashSet is `not synchronized` so it is not thread safe.

```java
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Vaibhav");
        names.add("Jagan");
        names.add("Sakshar");
        names.add("Akshar");
        System.out.println("HashSet: " + names);
    }
```

## LinkedHashSet Class

* The LinkedHashSet class is a subclass of HashSet and it also implements the Set interface.
* It `maintains the insertion order` of elements.
* Like HashSet, it `does not allow duplicates` and `allows at most one null element`.
* LinkedHashSet is `not thread-safe`.
* The performance is slightly slower than HashSet due to the overhead of maintaining the order.


## SortedSet Interface

* The SortedSet interface is a subinterface of Set and is a part of the java.util package.
* It represents a set of elements that are `sorted in ascending order`.
* Like a regular Set, it does `not allow duplicate` elements.
* The `ordering` is either based on the `natural ordering` of its elements (i.e., the elements must implement the Comparable interface), or ordering can be defined by a `Comparator` provided at the time of set creation.
* The most commonly used implementation of SortedSet is the TreeSet class

| Method                              | Return Type     | Description                                                                                                             |
|-------------------------------------|-----------------|-------------------------------------------------------------------------------------------------------------------------|
| `first()`                           | `E`             | Returns the first (lowest) element currently in the set.                                                                |
| `last()`                            | `E`             | Returns the last (highest) element currently in the set.                                                                |
| `headSet(E toElement)`              | `SortedSet<E>`  | Returns a view of the portion of the set that is strictly less than the specified element.                              |
| `tailSet(E fromElement)`            | `SortedSet<E>`  | Returns a view of the portion of the set that is greater than or equal to the specified element.                        |
| `subSet(E fromElement, E toElement)`| `SortedSet<E>`  | Returns a view of the portion of the set between two elements, including the lower bound but excluding the upper bound. |


## TreeSet Class

* The TreeSet class implements the NavigableSet interface (which extends SortedSet, which itself is inherited from Set) and provides a sorted set.
* It maintains `elements in ascending order by default`, based on their natural ordering. Alternatively, a custom order can be provided using a Comparator.
* It `does not allow duplicate` elements and `does not allow null`.
* It is `slower than HashSet` for basic operations because it maintains order.

```java
public static void main(String[] args) {
    TreeSet<Integer> integers = new TreeSet<>();
    integers.add(3);
    integers.add(2);
    integers.add(4);
    integers.add(1);

    System.out.println(integers);
    System.out.println("First (highest) Element: " + integers.first());
    System.out.println("Last (lowest) Element: " + integers.last());
    System.out.println("headSet(3) (<3): " + integers.headSet(3));
    System.out.println("tailSet(2) (>=2): " + integers.tailSet(2));
    System.out.println("subSet(2,3) (>=2 && <3): " + integers.subSet(2, 3));
}
```

## Map Interface

* The Map interface is `part of the Java Collection Framework`, located in the `java.util package`.
* It represents a data structure that stores `key–value pairs`, where each key is mapped to exactly one value.
* Unlike Collection interfaces (like List or Set),` Map does not extend Collection and is a separate hierarchy`.
* A `Map cannot contain duplicate keys`. Adding an existing key replaces the previous one.
* In Map, `values may be duplicate`. Multiple keys can be mapped to the same value.
* Depending on the implementation, Map may allow one null key and multiple null values (e.g., HashMap), while some (e.g., TreeMap) do not allow null keys


| Method                              | Return Type            | Description                                     |
|-------------------------------------|------------------------|-------------------------------------------------|
| `put(K key, V value)`               | `V`                    | Adds or updates a key-value pair.               |
| `get(Object key)`                   | `V`                    | Returns the value for the specified key.        |
| `containsKey(Object key)`           | `boolean`              | Checks if the key exists.                       |
| `containsValue(Object value)`       | `boolean`              | Checks if the value exists.                     |
| `remove(Object key)`                | `V`                    | Removes the mapping for the key.                |
| `keySet()`                          | `Set<K>`               | Returns a Set of all keys.                      |
| `values()`                          | `Collection<V>`        | Returns a Collection of all values.             |
| `entrySet()`                        | `Set<Map.Entry<K,V>>`  | Returns a Set of all key–value pairs.           |
| `size()`                            | `int`                  | Returns the number of key–value mappings.       |
| `isEmpty()`                         | `boolean`              | Checks if the map is empty.                     |
| `clear()`                           | `void`                 | Removes all key–value pairs.                    |


## HashMap Class

* HashMap is a class that `implements the Map interface using a hash table`.
* The entries in HashMap are stored in `no specific order`.
* HashMap `stores Key–Value pairs`. Each unique key is mapped to one value.
* It is `not synchronized`, meaning it is `not thread-safe` by default.
* In HashMap, `duplicate keys are not allowed` but `duplicate values are allowed`.
* HashMap accepts one null as a key and multiple null as values.
* The operations on a HashMap happen very quickly, even when the map contains a large number of entries. This makes HashMap very efficient

```java
public static void main(String[] args) {
    HashMap<String, Integer> marks = new HashMap<>();
    marks.put("Vikas", 78);
    marks.put("Surbhi", 75);
    marks.put("Vinay", 81);
    marks.put("Arpit", 71);
    marks.put(null, 58);
    marks.put("Samar", null);
    marks.put(null, 63);
    marks.put("Durgesh", null);
    Set<Map.Entry<String, Integer>> entrySet = marks.entrySet();
    for (Map.Entry<String, Integer> entry : entrySet) {
        System.out.print("Name: " + entry.getKey());
        System.out.println(" -- Marks: " + entry.getValue());
    }
}
```

## LinkedHashMap Class

* The LinkedHashMap class in Java is a subclass of HashMap that stores `key–value pairs` just like HashMap
* Unlike HashMap, it `maintains the order` in which the entries were inserted.
* It is `not synchronized`, meaning it is `not thread-safe` by default.
* Like HashMap, it `allows exactly one null key` and `multiple null values`. The key must be unique, and the same value can be mapped to multiple different keys.
* It `does not allow duplicate keys`; if a key is inserted again, the old value is replaced with the new one.
* The performance is `slightly slower than HashMa`p as it has to maintain the insertion order internally.
* LinkedHashMap is useful when you need a map that behaves like HashMap but also remembers the order of keys as they were added or accessed

```java
public static void main(String[] args) {
    LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
    marks.put("Vikas", 78);
    marks.put("Surbhi", 75);
    marks.put("Vinay", 81);
    marks.put("Arpit", 71);
    marks.put(null, 58);
    marks.put("Samar", null);
    marks.put(null, 63);
    marks.put("Durgesh", null);
    Set<Map.Entry<String, Integer>> entrySet = marks.entrySet();
    for (Map.Entry<String, Integer> entry : entrySet) {
        System.out.print("Name: " + entry.getKey());
        System.out.println(" -- Marks: " + entry.getValue());
    }
}
```

## HashTable Class

* The Hashtable class is a part of the `java.util package`. It is a `legacy class` that implements the Map interface.
* Hashtable stores `key-value pairs`, similar to HashMap, and allows quick access to values using keys.
* Unlike HashMap, it is `thread-safe` because all its methods are `synchronized`. This means multiple threads can access a Hashtable without causing data inconsistency.
* It `does not allow null keys or null values`. Attempting to store null as a key or value will result in a `NullPointerException`.
* In modern Java programming, HashMap is preferred as it is faster and more flexible.
* The Hashtable class is still supported in Java for backward compatibility with older applications.

```java
    public static void main(String[] args) {
        Hashtable<String, Integer> marks = new Hashtable<>();
        marks.put("Vikas", 78);
        marks.put("Surbhi", 75);
        marks.put("Vinay", 81);
        marks.put("Arpit", 71);
        Set<String> keys = marks.keySet();
        for (String key : keys) {
            System.out.print("Name: " + key);
            System.out.println(" -- Marks: " + marks.get(key));
        }
        marks.put(null, 58);
        marks.put("Samar", null);
    }
```

## TreeMap Class

* The TreeMap class in Java stores key–value pairs in a sorted order of keys.
* By default, it uses the natural ordering of keys (like alphabetical for strings or ascending for numbers). You can also provide a custom comparator to define your own order.
* Unlike HashMap and LinkedHashMap, TreeMap does not allow null keys. However, it allows multiple null values.
* In a TreeMap, the keys are always kept in sorted order.
* TreeMap is not synchronized, which means it is not thread-safe.
* It is slower than HashMap and LinkedHashMap, but it is useful when you need to access entries in a sorted way.
* It also provides some extra methods like firstKey(), lastKey(), headMap(), tailMap(), and subMap() (as TreeMap implements SortedMap interface) that help in working with specific portions of the map based on key ranges

| Method                              | Return Type            | Description                                                           |
|-------------------------------------|------------------------|-----------------------------------------------------------------------|
| `put(K key, V value)`               | `V`                    | Inserts or updates a key-value pair.                                  |
| `get(Object key)`                   | `V`                    | Returns the value associated with the key.                            |
| `remove(Object key)`                | `V`                    | Removes the mapping for the specified key.                            |
| `containsKey(Object key)`           | `boolean`              | Checks if the key exists.                                             |
| `containsValue(Object value)`       | `boolean`              | Checks if the value exists.                                           |
| `firstKey()`                        | `K`                    | Returns the first (lowest) key.                                       |
| `lastKey()`                         | `K`                    | Returns the last (highest) key.                                       |
| `headMap(K toKey)`                  | `SortedMap<K,V>`       | Returns a view of keys less than the specified key.                   |
| `tailMap(K fromKey)`                | `SortedMap<K,V>`       | Returns a view of keys greater than or equal to the specified key.    |
| `subMap(K fromKey, K toKey)`        | `SortedMap<K,V>`       | Returns a view of keys within the specified range.                    |
| `size()`                            | `int`                  | Returns the number of key-value pairs.                                |
| `isEmpty()`                         | `boolean`              | Checks if the map is empty.                                           |
| `clear()`                           | `void`                 | Removes all mappings.                                                 |
| `keySet()`                          | `Set<K>`               | Returns a set of keys in sorted order.                                |
| `values()`                          | `Collection<V>`        | Returns a collection of values.                                       |
| `entrySet()`                        | `Set<Map.Entry<K,V>>`  | Returns a set of key-value pairs.                                     |

```java
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Vikas", 78);
        marks.put("Surbhi", 75);
        marks.put("Vinay", 81);
        marks.put("Arpit", 71);
        // marks.put(null, 58);
        marks.put("Samar", null);
        Set<Map.Entry<String, Integer>> entrySet = marks.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.print("Name: " + entry.getKey());
            System.out.println(" -- Marks: " + entry.getValue());
        }
    }
```

