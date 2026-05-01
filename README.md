# Sorting and Searching Algorithm Performance Analysis

A. Project Overview

This project implements and compares three fundamental algorithms:

- **Bubble Sort** (Basic Sorting Algorithm)
- **Merge Sort** (Advanced Sorting Algorithm)
- **Binary Search** (Searching Algorithm)

The purpose of this experiment is to analyze the performance of these algorithms in practice and compare them with their theoretical time complexities using execution time measurements (`System.nanoTime()`).

The system tests algorithms on different input sizes and data types (random and sorted arrays) to evaluate real-world performance differences.

---

B. Algorithm Descriptions

*Bubble Sort
Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.

- Time Complexity:
  - Best case: **O(n)** (already sorted array)
  - Average case: **O(n²)**
  - Worst case: **O(n²)**

---

*Merge Sort
Merge Sort is a divide-and-conquer algorithm that divides the array into halves, recursively sorts them, and then merges them.

- Time Complexity:
  - Best case: **O(n log n)**
  - Average case: **O(n log n)**
  - Worst case: **O(n log n)**

---

*Binary Search
Binary Search finds an element in a sorted array by repeatedly dividing the search range in half.

- Time Complexity:
  - Best case: **O(1)**
  - Average case: **O(log n)**
  - Worst case: **O(log n)**

---

C. Experimental Results

Execution Time Comparison (Example Output)

| Array Size | Bubble Sort (Random) | Merge Sort (Random) | Bubble Sort (Sorted) | Merge Sort (Sorted) |
|------------|---------------------|---------------------|----------------------|----------------------|
| 10         | 4900 ns             | 8300 ns             | 700 ns               | 3500 ns              |
| 100        | 156000 ns           | 52100 ns            | 4000 ns              | 63600 ns             |
| 1000       | 4846500 ns          | 179000 ns           | 3300 ns              | 93000 ns             |

---

Searching Performance

| Array Type | Binary Search Time |
|------------|-------------------|
| Random     | 2100 ns           |
| Sorted     | 900 ns            |

---

Observations

- Merge Sort is significantly faster than Bubble Sort for large datasets.
- Bubble Sort performs better only on very small or nearly sorted arrays.
- Binary Search is extremely fast compared to linear approaches, especially on large datasets.
- Sorted arrays improve search efficiency and stability.

---

D. Screenshots

Include screenshots of:

- Program output for size = 10
- Program output for size = 100
- Program output for size = 1000
- Comparison between random vs sorted arrays

*(Insert screenshots here from your IDE console)*

---

E. Reflection

During this project, I learned how algorithm efficiency affects performance in real applications. Although Bubble Sort is simple to implement, it becomes very slow with large datasets due to its O(n²) complexity. In contrast, Merge Sort consistently performs better because of its O(n log n) structure.

The experiment also showed that theoretical Big-O complexity closely matches real-world execution trends, especially when input size increases.

One of the main challenges was ensuring fair comparison between algorithms by using identical datasets and proper cloning of arrays to avoid modifying original data.

Additionally, I understood why Binary Search requires sorted data — without sorting, the algorithm cannot correctly eliminate half of the search space.

---

##Conclusion

This project demonstrates the importance of choosing efficient algorithms depending on dataset size and structure. Merge Sort and Binary Search are significantly more efficient than basic approaches when dealing with large datasets.
