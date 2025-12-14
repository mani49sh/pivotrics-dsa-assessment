# Pivotrics DSA Assessment

## 📋 Assessment Overview

This repository contains solutions to 8 Data Structures and Algorithms problems as part of the Pivotrics technical assessment. Each solution is implemented in Java following best practices and clean code principles.

## 📁 Project Structure

```
pivotrics-dsa-assessment/
├── README.md
├── .gitignore
└── src/
    ├── ProblemFirst.java          # Products of Array Except Self
    ├── ProblemSecond.java         # Sort Character by Frequency
    ├── ProblemThird.java          # Two Sum
    ├── ProblemFourth.java         # Last Stone Weight
    ├── ProblemFifth.java          # Search in Rotated Sorted Array
    ├── ProblemSixth.java          # Longest Substring Without Repeating Characters
    ├── ProblemSeventh.java        # Jump Game 
    └── ProblemEight.java          # Add Two Numbers 
```

## 🎯 Problems and Solutions

### Problem 1: Products of Array Except Self
**File:** `ProblemFirst.java`

**Description:** Given an integer array, return an array where each element is the product of all elements except itself.

**Approach:** Two-pass algorithm using prefix and suffix products
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) excluding output array
- **Key Concepts:** Array manipulation, prefix/suffix products

---

### Problem 2: Sort Character by Frequency
**File:** `ProblemSecond.java`

**Description:** Sort a string in decreasing order based on character frequency.

**Approach:** HashMap for frequency counting + custom sorting
- **Time Complexity:** O(n log k) where k is unique characters
- **Space Complexity:** O(k)
- **Key Concepts:** HashMap, sorting, frequency analysis

---

### Problem 3: Two Sum
**File:** `ProblemThird.java`

**Description:** Find two indices in an array that sum to a target value.

**Approach:** HashMap for single-pass complement lookup
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)
- **Key Concepts:** Hash table, complement search

---

### Problem 4: Last Stone Weight
**File:** `ProblemFourth.java`

**Description:** Simulate smashing the two heaviest stones until one or zero remain.

**Approach:** Max heap using PriorityQueue
- **Time Complexity:** O(n log n)
- **Space Complexity:** O(n)
- **Key Concepts:** Heap data structure, priority queue

---

### Problem 5: Search in Rotated Sorted Array
**File:** `ProblemFifth.java`

**Description:** Search for a target in a rotated sorted array.

**Approach:** Modified binary search
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
- **Key Concepts:** Binary search, array rotation

---

### Problem 6: Longest Substring Without Repeating Characters
**File:** `ProblemSixth.java`

**Description:** Find the length of the longest substring without duplicate characters.

**Approach:** Sliding window with HashMap
- **Time Complexity:** O(n)
- **Space Complexity:** O(min(m, n)) where m is charset size
- **Key Concepts:** Sliding window, hash map

---

### Problem 7: Jump Game (Minimum Jumps)
**File:** `ProblemSeventh.java`

**Description:** Find the minimum number of jumps to reach the last index.

**Approach:** Greedy algorithm tracking farthest reachable position
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
- **Key Concepts:** Greedy algorithms, dynamic programming optimization

---

### Problem 8: Add Two Numbers (Linked Lists)
**File:** `ProblemEight.java`

**Description:** Add two numbers represented as linked lists in reverse order.

**Approach:** Single-pass traversal with carry handling
- **Time Complexity:** O(max(m, n))
- **Space Complexity:** O(max(m, n))
- **Key Concepts:** Linked lists, digit manipulation, carry handling

---

## 🚀 Setup and Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

### Installation Steps

1. Clone the repository:
```bash
git clone https://github.com/mani49sh/pivotrics-dsa-assessment.git
cd pivotrics-dsa-assessment
```

2. Navigate to the src directory:
```bash
cd src
```

## ▶️ How to Run

### Using Command Line

**Compile a specific problem:**
```bash
javac ProblemFirst.java
```

**Run the compiled program:**
```bash
java ProblemFirst
```

**Example: Running Problem 1**
```bash
javac ProblemFirst.java
java ProblemFirst
# Follow the prompts to enter array size and elements
```

### Using an IDE

1. Open the project in your IDE
2. Navigate to the desired problem file
3. Right-click on the file and select "Run"
4. Enter inputs as prompted in the console

## 📝 Input/Output Examples

### Problem 1 Example:
```
Enter the size of array: 4
Enter the elements:
1 2 4 6
Output: [48, 24, 12, 8]
```

### Problem 2 Example:
```
Enter the string: tree
Output: "eert"
```

### Problem 3 Example:
```
Enter the size of array: 4
Enter the elements:
3 4 5 6
Enter the target: 7
Output: [0, 1]
```

### Problem 4 Example:
```
Enter the number of stones: 5
Enter the stone weights:
2 3 6 2 4
Output: 1
```

### Problem 5 Example:
```
Enter the size of array: 6
Enter the elements:
3 4 5 6 1 2
Enter the target: 1
Output: 4
```

### Problem 6 Example:
```
Enter the string: zxyzxyz
Output: 3
```

### Problem 7 Example:
```
Enter the size of array: 6
Enter the elements:
2 4 1 1 1 1
Output: 2
```

### Problem 8 Example:
```
Enter the size of first linked list: 3
Enter the elements:
1 2 3
Enter the size of second linked list: 3
Enter the elements:
4 5 6
Output: [5, 7, 9]
```

## ✅ Features

- ✨ Optimal time and space complexity for all solutions
- 🎯 Clean, readable, and well-documented code
- 📥 User input handling (no hardcoded values)
- 🔄 Modular function-based design
- 🖨️ Custom output formatting (no Arrays.toString())
- 🧪 Tested with provided examples and edge cases

## 🛠️ Technical Highlights

- **Data Structures Used:** Arrays, HashMap, PriorityQueue, LinkedList
- **Algorithms Implemented:** Binary Search, Sliding Window, Greedy Algorithms, Two Pointers
- **Design Patterns:** Separation of concerns, single responsibility principle
- **Code Quality:** Clean code practices, meaningful variable names, proper indentation

## 📊 Complexity Analysis Summary

| Problem | Time Complexity | Space Complexity |
|---------|----------------|------------------|
| Problem 1 | O(n) | O(1) |
| Problem 2 | O(n log k) | O(k) |
| Problem 3 | O(n) | O(n) |
| Problem 4 | O(n log n) | O(n) |
| Problem 5 | O(log n) | O(1) |
| Problem 6 | O(n) | O(min(m,n)) |
| Problem 7 | O(n) | O(1) |
| Problem 8 | O(max(m,n)) | O(max(m,n)) |

## 🔍 Testing

Each solution has been tested with:
- ✅ Provided example test cases
- ✅ Edge cases (empty arrays, single elements, etc.)
- ✅ Boundary conditions
- ✅ Large input scenarios

## 📚 Key Learnings

- Efficient array manipulation without division
- Optimal frequency counting and sorting
- Hash-based lookup optimization
- Heap operations for priority-based problems
- Modified binary search techniques
- Sliding window pattern for substring problems
- Greedy approach for optimization problems
- Linked list manipulation with carry handling

## 👤 Author Information

**Name:** Monish Roy 
**Email:** monishroy1998@gmail.com 
**Date:** December 14, 2025  
**Assessment:** Pivotrics DSA Technical Assessment

## 📄 License

This project is submitted as part of a technical assessment for Pivotrics.

## 🤝 Acknowledgments

- Problem statements provided by Pivotrics
- Solutions implemented following industry best practices
- Optimized for both time and space complexity

---

**Note:** All solutions accept user input dynamically and do not use hardcoded values. Each problem can be run independently without dependencies on other files.
