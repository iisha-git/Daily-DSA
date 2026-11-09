# Daily-DSA

A daily practice journal of Data Structures & Algorithms implemented in **Java**.
Every solution file contains a comment header with the original problem link
(GeeksforGeeks / LeetCode), the approach used, and its time & space complexity.

---

## Why this repository

- Build strong problem-solving habits through daily practice.
- Keep clean, readable reference implementations with explanations.
- Connect each solution to the original problem statement for easy revision.

---

## Repository structure

```
Daily-DSA/
├── ArrayList/              # ArrayList based problems
├── Binary Tree/            # Binary tree traversals & problems
├── BinarySearchTree/       # BST insert, search, delete, validate
├── Final450/               # Sorting & searching (450 DSA sheet)
├── Greedy Algorithms/      # Classic greedy problems
├── LinkedList/             # Singly linked list operations
├── Queue/                  # Queue implementations & problems
├── Stack/                  # Stack implementations
├── leetcodeDaily/          # Daily LeetCode challenges
└── README.md
```

### Topics covered

| Topic | What you will find |
| --- | --- |
| Arrays & ArrayList | Two pointers, sliding window, pair sum, container with most water |
| Sorting & Searching | Binary search, rotated arrays, missing/repeating elements |
| Linked List | Insertion, deletion, reversal, cycle-free traversal, palindrome check |
| Stack | Array, linked list, Deque and collection based implementations |
| Queue | Circular queue, linked list queue, Deque queue, queue using stacks |
| Binary Tree | Traversals, height, diameter, LCA, top view, subtree checks |
| Binary Search Tree | Build, search, delete, validate, mirror |
| Greedy | Activity selection, knapsack, job sequencing, coin change, board cutting |
| Daily LeetCode | Sliding window, prefix sum and other interview patterns |

---

## Problem index

Each file links to the problem it solves. The comment header inside the file
explains the approach in detail.

### ArrayList

| File | Problem |
| --- | --- |
| [Multidimension.java](./ArrayList/Multidimension.java) | 2D ArrayList basics |
| [PairSum.java](./ArrayList/PairSum.java) | [Two Sum II (sorted)](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) |
| [PairSum2.java](./ArrayList/PairSum2.java) | [Pair sum in sorted & rotated array](https://www.geeksforgeeks.org/find-a-pair-with-given-sum-in-a-sorted-and-rotated-array/) |
| [storWater.java](./ArrayList/storWater.java) | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) |

### Sorting & Searching

| File | Problem |
| --- | --- |
| [findPair.java](./Final450/sortingSearching/findPair.java) | [Pair with given difference](https://www.geeksforgeeks.org/find-a-pair-with-given-difference/) |
| [findTwoElement.java](./Final450/sortingSearching/findTwoElement.java) | [Missing and repeating number](https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/) |
| [firstLast.java](./Final450/sortingSearching/firstLast.java) | [First and last occurrence](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) |
| [majorityElement.java](./Final450/sortingSearching/majorityElement.java) | [Majority Element](https://leetcode.com/problems/majority-element/) |
| [posAndNum.java](./Final450/sortingSearching/posAndNum.java) | [Value equal to index](https://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/) |
| [rotatedSortedSearch.java](./Final450/sortingSearching/rotatedSortedSearch.java) | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) |

### Linked List

| File | Problems |
| --- | --- |
| [LinkedList.java](./LinkedList/LinkedList.java) | [Reverse](https://leetcode.com/problems/reverse-linked-list/), [Remove N-th from end](https://leetcode.com/problems/remove-nth-node-from-end-of-list/), [Palindrome](https://leetcode.com/problems/palindrome-linked-list/) |

### Stack

| File | Topic / Problem |
| --- | --- |
| [StackArrayList.java](./Stack/StackArrayList.java) | Stack using ArrayList |
| [StackLinkedList.java](./Stack/StackLinkedList.java) | Stack using Linked List |
| [StackDeque.java](./Stack/StackDeque.java) | Stack using Deque |
| [StackCollectionF.java](./Stack/StackCollectionF.java) | Stack using Java Collections |
| [StackTwoQueue.java](./Stack/StackTwoQueue.java) | [Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/) |

### Queue

| File | Topic / Problem |
| --- | --- |
| [queueArray.java](./Queue/queueArray.java) | [Circular Queue](https://leetcode.com/problems/design-circular-queue/) |
| [queueLL.java](./Queue/queueLL.java) | Queue using Linked List |
| [QueueDeque.java](./Queue/QueueDeque.java) | Queue using Deque |
| [queueJC.java](./Queue/queueJC.java) | Queue using Java Collections |
| [QueueTwoStacksADD.java](./Queue/QueueTwoStacksADD.java) | [Queue using Stacks (costly add)](https://leetcode.com/problems/implement-queue-using-stacks/) |
| [QueueTwoStacksPOP.java](./Queue/QueueTwoStacksPOP.java) | [Queue using Stacks (costly remove)](https://leetcode.com/problems/implement-queue-using-stacks/) |
| [DEE.java](./Queue/DEE.java) | Deque basics |
| [interleave.java](./Queue/interleave.java) | [Interleave first half with second half](https://www.geeksforgeeks.org/interleave-first-half-queue-second-half/) |
| [reverseQueue.java](./Queue/reverseQueue.java) | [Reverse a Queue](https://www.geeksforgeeks.org/reversing-a-queue/) |
| [nonRepeating.java](./Queue/nonRepeating.java) | [First non-repeating character](https://leetcode.com/problems/first-unique-character-in-a-string/) |

### Binary Tree

| File | Problem |
| --- | --- |
| [BuildSubTree.java](./Binary%20Tree/BuildSubTree.java) | Build tree + traversals |
| [heightTree.java](./Binary%20Tree/heightTree.java) | [Height](https://leetcode.com/problems/maximum-depth-of-binary-tree/) & [Diameter](https://leetcode.com/problems/diameter-of-binary-tree/) |
| [isSubTree.java](./Binary%20Tree/isSubTree.java) | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) |
| [KthAncestor.java](./Binary%20Tree/KthAncestor.java) | [K-th ancestor](https://www.geeksforgeeks.org/kth-ancestor-node-binary-tree/) |
| [kthLevel.java](./Binary%20Tree/kthLevel.java) | [Nodes at K-th level](https://www.geeksforgeeks.org/print-all-nodes-at-distance-k-from-root/) |
| [LCAapproachII.java](./Binary%20Tree/LCAapproachII.java) | [Lowest Common Ancestor](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) |
| [LowestCommonAncestor.java](./Binary%20Tree/LowestCommonAncestor.java) | [LCA (path approach)](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) |
| [minDistance.java](./Binary%20Tree/minDistance.java) | [Distance between two nodes](https://www.geeksforgeeks.org/find-distance-between-two-nodes-of-a-binary-tree/) |
| [nodesCount.java](./Binary%20Tree/nodesCount.java) | [Count nodes](https://www.geeksforgeeks.org/count-number-of-nodes-in-a-binary-tree/) |
| [nodeSum.java](./Binary%20Tree/nodeSum.java) | [Sum of nodes](https://www.geeksforgeeks.org/sum-nodes-binary-tree/) |
| [topView.java](./Binary%20Tree/topView.java) | [Top View](https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/) |
| [widthTree.java](./Binary%20Tree/widthTree.java) | [Diameter (optimized)](https://leetcode.com/problems/diameter-of-binary-tree/) |

### Binary Search Tree

| File | Problem |
| --- | --- |
| [BuiltBST.java](./BinarySearchTree/BuiltBST.java) | [Insert into BST](https://leetcode.com/problems/insert-into-a-binary-search-tree/) |
| [SearchBST.java](./BinarySearchTree/SearchBST.java) | [Search in BST](https://leetcode.com/problems/search-in-a-binary-search-tree/) |
| [DeleteNode.java](./BinarySearchTree/DeleteNode.java) | [Delete Node in BST](https://leetcode.com/problems/delete-node-in-a-bst/) |
| [reverseTree.java](./BinarySearchTree/reverseTree.java) | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) |

### Greedy Algorithms

| File | Problem |
| --- | --- |
| [AbsoluteDifferencePair.java](./Greedy%20Algorithms/AbsoluteDifferencePair.java) | [Minimum absolute difference pairs](https://www.geeksforgeeks.org/minimum-sum-absolute-difference-pairs-two-arrays/) |
| [ActivitySelector.java](./Greedy%20Algorithms/ActivitySelector.java) | [Activity Selection](https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/) |
| [ArrayBST.java](./Greedy%20Algorithms/ArrayBST.java) | [Sorted array to BST](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) & [Balance BST](https://leetcode.com/problems/balance-a-binary-search-tree/) |
| [chocolaProblem.java](./Greedy%20Algorithms/chocolaProblem.java) | [Minimum cost to cut board](https://www.geeksforgeeks.org/minimum-cost-cut-board-squares/) |
| [fractionalKnapsack.java](./Greedy%20Algorithms/fractionalKnapsack.java) | [Fractional Knapsack](https://www.geeksforgeeks.org/fractional-knapsack-problem/) |
| [indianCoins.java](./Greedy%20Algorithms/indianCoins.java) | [Minimum coins](https://www.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins/) |
| [JobSequencing.java](./Greedy%20Algorithms/JobSequencing.java) | [Job Sequencing](https://www.geeksforgeeks.org/job-sequencing-problem/) |
| [longestChairPair.java](./Greedy%20Algorithms/longestChairPair.java) | [Maximum Length of Pair Chain](https://leetcode.com/problems/maximum-length-of-pair-chain/) |
| [SizeofLagrestBT.java](./Greedy%20Algorithms/SizeofLagrestBT.java) | [Largest BST in a Binary Tree](https://www.geeksforgeeks.org/largest-bst-binary-tree-set-2/) |

### Daily LeetCode

| File | Problem |
| --- | --- |
| [lengthOfLongest.java](./leetcodeDaily/lengthOfLongest.java) | [Longest Subarray With at Most K Frequency](https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/) |
| [stoneGame4.java](./leetcodeDaily/stoneGame4.java) | [Smallest Missing Integer Greater Than Sequential Prefix Sum](https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/) |

---

## How to run

Compile and run any standalone file with the JDK:

```bash
javac ArrayList/PairSum.java
java -cp ArrayList PairSum
```

For files inside a package (for example `Final450.sortingSearching`), compile
from the repository root:

```bash
javac Final450/sortingSearching/rotatedSortedSearch.java
```

Some files (e.g. `KthAncestor.java`, `StackTwoQueue.java`) are learning stubs
that only contain the problem statement and approach in comments.

---

## Conventions

- Every file starts with a comment header:
  - **Problem** name
  - **LeetCode** / **GFG** links
  - **Approach** explanation
  - **Time & Space** complexity
- Code is written for clarity and revision, not micro-optimization.
- When a file contains a brute-force or known-buggy version, the optimized
  approach is described in the header comment.

---

## Author

Maintained as part of a daily DSA practice routine.
