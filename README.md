<div align="center">

<!-- Animated Typing Banner -->
<img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=800&size=38&pause=1000&color=F89820&center=true&vCenter=true&width=700&height=80&lines=Java+Collection+Framework;Learn+%7C+Practice+%7C+Master;ArrayList+%7C+HashMap+%7C+Stack+%7C+Queue" alt="Typing SVG" />

<br/>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Collections](https://img.shields.io/badge/Collections-Framework-red?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

<br/>

> ☕ **A comprehensive, hands-on Java Collection Framework repository** — covering core data structures, algorithms, Java 8 streams, LRU Cache, Garbage Collection concepts, and curated exercises with real-world problems.

<br/>

<img src="https://user-images.githubusercontent.com/74038190/212284100-561aa473-3905-4a80-b561-0d28506553ee.gif" width="700"/>

</div>

---

## 📌 Table of Contents

- [✨ Overview](#-overview)
- [🏗️ Repository Structure](#️-repository-structure)
- [🧩 Modules In Detail](#-modules-in-detail)
- [📝 Exercises](#-exercises)
- [⚡ Getting Started](#-getting-started)
- [💡 Code Examples](#-code-examples)
- [🛠️ Prerequisites](#️-prerequisites)
- [🤝 Contributing](#-contributing)
- [📜 License](#-license)

---

## ✨ Overview

<div align="center">
<img src="https://user-images.githubusercontent.com/74038190/229223263-cf2e4b07-2615-4f87-9c38-e37600f8381a.gif" width="420"/>
</div>

<br/>

**JAVA-COLLECTION-FRAMEWORK** is a structured, deep-dive repository into Java's most powerful built-in library — the **Collection Framework**. It goes beyond textbook definitions to include **practical implementations**, **exercises**, **Java 8 features**, and **advanced topics** like LRU Cache and Garbage Collection.

| 🌟 Feature | 📝 Description |
|---|---|
| 🧱 Modular Design | Every collection type has its own dedicated package |
| 📚 Concept + Code | Theory backed by working Java programs |
| 🎯 Exercises Folder | Practice problems for every major collection |
| ☕ Java 8 Ready | Streams, Lambdas, and functional interfaces included |
| 🔁 Interview Prep | Real problems like LRU Cache, Priority Queue, TreeMap |

---

## 🏗️ Repository Structure

<div align="center">
<img src="https://user-images.githubusercontent.com/74038190/212284087-bbe7e430-757e-4901-90bf-4cd2ce3e1852.gif" width="500"/>
</div>

```
JAVA-COLLECTION-FRAMEWORK/
│
├── 📂 src/
│   └── 📦 collectionFramework/
│       ├── 📂 arrayList/          → ArrayList operations & patterns
│       ├── 📂 comparable/         → Natural ordering with Comparable
│       ├── 📂 comparator/         → Custom ordering with Comparator
│       ├── 📂 Exercises/          → Practice problems (see below)
│       ├── 📂 GC/                 → Garbage Collection concepts
│       ├── 📂 hashMap/            → HashMap operations & patterns
│       ├── 📂 hashTable/          → HashTable vs HashMap
│       ├── 📂 iterable/           → Iterable & Iterator patterns
│       ├── 📂 java8/              → Streams, Lambdas, Method Refs
│       ├── 📂 linkedList/         → LinkedList operations
│       ├── 📂 LRUCache/           → LRU Cache implementation
│       ├── 📂 maps/               → TreeMap, LinkedHashMap
│       ├── 📂 Problems/           → Real-world coding problems
│       ├── 📂 queue/              → Queue & Deque patterns
│       ├── 📂 set/                → HashSet, LinkedHashSet, TreeSet
│       ├── 📂 stack/              → Stack operations & use cases
│       ├── 📂 stream/             → Java Stream API deep-dive
│       └── 📂 vectors/            → Vector & thread-safe lists
│
├── 📂 bin/                        → Compiled .class files
├── 📄 .classpath
└── 📄 .project
```

---

## 🧩 Modules In Detail

<div align="center">
<img src="https://user-images.githubusercontent.com/74038190/212747107-5b654220-3bfc-4359-be12-7d9bc8eb1a82.gif" width="500"/>
</div>

<br/>

### 📋 ArrayList
> Dynamic array implementation — the most widely used Java collection.
- `add()`, `remove()`, `get()`, `set()`, `sort()`
- Sublist, iterator, list reversal
- Performance characteristics vs LinkedList

---

### ⚖️ Comparable & Comparator
> Sorting and ordering objects the right way.
- `Comparable<T>` → Natural order via `compareTo()`
- `Comparator<T>` → Custom order via lambda / anonymous class
- Multi-field sorting, chaining with `thenComparing()`

---

### 🗺️ HashMap
> Key-value storage with O(1) average lookup.
- CRUD operations, iteration patterns
- Frequency counting, grouping
- `computeIfAbsent`, `merge`, `getOrDefault`

---

### 📊 HashTable
> Thread-safe legacy map — know when to use it.
- Differences from `HashMap`
- Synchronization and concurrency notes
- Migration to `ConcurrentHashMap`

---

### 🔄 Iterable & Iterator
> The backbone of all Java for-each loops.
- Custom `Iterable` implementation
- `Iterator` vs `ListIterator`
- Fail-fast vs fail-safe iterators

---

### ☕ Java 8
> Modern Java — functional, clean, and powerful.
- `Stream`, `filter`, `map`, `collect`
- Lambda expressions & method references
- `Optional`, `Predicate`, `Function`, `Consumer`

---

### 🔗 LinkedList
> Doubly-linked list — great for insertions and deletions.
- Stack and Queue operations using LinkedList
- Node traversal, reversal
- Use cases vs ArrayList

---

### 🏆 LRU Cache
> Advanced implementation — classic interview problem.
- `LinkedHashMap`-based LRU Cache
- Manual doubly-linked list + HashMap approach
- O(1) `get` and `put` operations

---

### 🗂️ Maps
> Ordered and insertion-order map variants.
- `TreeMap` — sorted keys, `NavigableMap` methods
- `LinkedHashMap` — insertion-order iteration
- `floorKey`, `ceilingKey`, `subMap`, `headMap`

---

### 🚶 Queue & Deque
> FIFO and double-ended queue operations.
- `ArrayDeque`, `PriorityQueue`, `LinkedList` as Queue
- BFS simulation with Queue
- Min/Max heap using `PriorityQueue`

---

### 🗃️ Set
> Unique element collections.
- `HashSet` — unordered, O(1) operations
- `LinkedHashSet` — insertion-order uniqueness
- `TreeSet` — sorted unique elements, range queries

---

### 📚 Stack
> LIFO data structure — essential for parsing & backtracking.
- `push`, `pop`, `peek`, `isEmpty`
- Balanced parentheses checker
- Undo/redo pattern simulation

---

### 🌊 Stream API
> Declarative data processing — Java 8's crown jewel.
- Pipeline: `source → intermediate ops → terminal ops`
- `flatMap`, `distinct`, `sorted`, `limit`, `skip`
- `Collectors`: `groupingBy`, `joining`, `toMap`, `counting`

---

### 🧵 Vectors
> Thread-safe dynamic array — legacy but important.
- `Vector` vs `ArrayList` performance
- `Collections.synchronizedList()` alternative
- When to choose `CopyOnWriteArrayList`

---

### ♻️ GC (Garbage Collection)
> Understanding Java memory management.
- Object lifecycle and reference types
- Strong, Weak, Soft, Phantom references
- GC tuning basics and heap regions

---

## 📝 Exercises

<div align="center">
<img src="https://user-images.githubusercontent.com/74038190/212748842-9fcbad5b-6173-4175-8a61-521f3dbb7514.gif" width="500"/>
</div>

The `Exercises/` folder contains dedicated problem sets for each collection type:

| 📁 Exercise Folder | 🎯 Focus Areas |
|---|---|
| `Exercises/ArrayList` | Manipulation, sorting, searching |
| `Exercises/HashMap` | Frequency maps, anagram checks, grouping |
| `Exercises/HashSet` | Duplicate removal, intersection, union |
| `Exercises/LinkedList` | Reversal, cycle detection, merging |
| `Exercises/PriorityQueue` | Kth largest, task scheduling |
| `Exercises/Queue` | BFS problems, circular queue |
| `Exercises/Set` | Set theory, sorted unique data |
| `Exercises/Stack` | Expression parsing, backtracking |
| `Exercises/TreeMap` | Range queries, sorted frequency |
| `Exercises/TreeSet` | Floor/ceil operations, ordered sets |

---

## ⚡ Getting Started

<div align="center">
<img src="https://user-images.githubusercontent.com/74038190/212747919-84fcfc74-5f37-42c5-9f11-db40b96b7d9a.gif" width="500"/>
</div>

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/sahastraWin/JAVA-COLLECTION-FRAMEWORK.git
cd JAVA-COLLECTION-FRAMEWORK
```

### 2️⃣ Open in Eclipse / IntelliJ

```
Eclipse  → File → Import → Existing Projects into Workspace → Select root folder
IntelliJ → File → Open → Select the project folder
```

### 3️⃣ Run Any File

```bash
# Using terminal (from project root)
javac -d bin src/collectionFramework/arrayList/YourFile.java
java -cp bin collectionFramework.arrayList.YourFile
```

---

## 💡 Code Examples

<div align="center">
<img src="https://user-images.githubusercontent.com/74038190/212284158-e840e285-664b-44d7-b79b-e264b5e54825.gif" width="480"/>
</div>

### 🔹 ArrayList — Sort with Comparator
```java
List<String> names = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob"));
names.sort(Comparator.naturalOrder());
System.out.println(names); // [Alice, Bob, Charlie]
```

### 🔹 HashMap — Frequency Counter
```java
String[] words = {"apple", "banana", "apple", "cherry", "banana", "apple"};
Map<String, Integer> freq = new HashMap<>();
for (String w : words)
    freq.merge(w, 1, Integer::sum);
System.out.println(freq); // {apple=3, banana=2, cherry=1}
```

### 🔹 LRU Cache — LinkedHashMap
```java
int capacity = 3;
Map<Integer, Integer> lru = new LinkedHashMap<>(capacity, 0.75f, true) {
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e) {
        return size() > capacity;
    }
};
lru.put(1, 10); lru.put(2, 20); lru.put(3, 30);
lru.get(1);     // access key 1
lru.put(4, 40); // evicts key 2 (least recently used)
System.out.println(lru.keySet()); // [3, 1, 4]
```

### 🔹 Stream API — Group by Length
```java
List<String> words = List.of("hi", "hello", "hey", "world", "ok");
Map<Integer, List<String>> grouped = words.stream()
    .collect(Collectors.groupingBy(String::length));
System.out.println(grouped);
// {2=[hi, ok], 5=[hello, world], 3=[hey]}
```

### 🔹 PriorityQueue — Kth Largest Element
```java
int[] nums = {3, 2, 1, 5, 6, 4};
int k = 2;
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
for (int n : nums) {
    minHeap.offer(n);
    if (minHeap.size() > k) minHeap.poll();
}
System.out.println(minHeap.peek()); // 5 (2nd largest)
```

### 🔹 TreeMap — Floor & Ceiling
```java
TreeMap<Integer, String> map = new TreeMap<>();
map.put(10, "A"); map.put(20, "B"); map.put(30, "C");
System.out.println(map.floorKey(25));   // 20
System.out.println(map.ceilingKey(25)); // 30
System.out.println(map.subMap(10, 30)); // {10=A, 20=B}
```

---

## 🛠️ Prerequisites

| Tool | Version |
|------|---------|
| ☕ Java JDK | 8 or higher (Java 17 recommended) |
| 🌑 Eclipse IDE | 2021-12+ or any modern version |
| 💡 IntelliJ IDEA | Community / Ultimate |
| 🔧 Maven / Gradle | Optional (for dependency management) |

---

## 📊 Java Collections — Quick Reference

```
java.lang.Iterable
    └── java.util.Collection
            ├── List          → ArrayList, LinkedList, Vector, Stack
            ├── Set           → HashSet, LinkedHashSet, TreeSet
            └── Queue         → PriorityQueue, ArrayDeque
                    └── Deque → ArrayDeque, LinkedList

java.util.Map
    ├── HashMap
    ├── LinkedHashMap
    ├── TreeMap
    └── HashTable
```

---

## 🤝 Contributing

<div align="center">
<img src="https://user-images.githubusercontent.com/74038190/212741999-016fddbd-617a-4448-8042-0ecf907aea25.gif" width="400"/>
</div>

Contributions are **always welcome!** 🎉

```bash
# Fork → Clone → Branch → Code → PR
git checkout -b feature/add-deque-examples
git commit -m "✨ Add Deque usage examples"
git push origin feature/add-deque-examples
```

Please ensure your contributions include:
- ✅ Clean, well-commented Java code
- ✅ At least one working example per class
- ✅ Proper package declaration matching the folder structure

---

## 📜 License

```
MIT License — free to use, share, and build upon with attribution.
```

---

<div align="center">

<img src="https://user-images.githubusercontent.com/74038190/212284115-f47cd8ff-2ffb-4b04-b5bf-4d1c14c0247f.gif" width="400"/>

<br/>

### ☕ If this repo made you a better Java developer, drop a ⭐ star!

**Made with ❤️ by [sahastraWin](https://github.com/sahastraWin)**

<br/>

![Visitors](https://visitor-badge.laobi.icu/badge?page_id=sahastraWin.JAVA-COLLECTION-FRAMEWORK)
![Last Commit](https://img.shields.io/github/last-commit/sahastraWin/JAVA-COLLECTION-FRAMEWORK?style=flat-square&color=orange)

</div>
