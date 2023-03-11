# Convert Sorted Listy to BST

 A programming problem where a sorted linked list is to be converted to a binary search tree (BST)



Given the `head` of a singly linked list where elements are sorted in **ascending order**, convert *it to a* 

***height-balanced***

 *binary search tree*.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/17/linked.jpg)

**Input:** head = [-10,-3,0,5,9]
**Output:** [0,-3,9,-10,null,5]
**Explanation:** One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.

**Example 2:**

**Input:** head = []
**Output:** []

**Constraints:**

- The number of nodes in `head` is in the range `[0, 2 * 104]`.
- `-105 <= Node.val <= 105`



## Explanation & Solution

The problem of converting a sorted linked list to a binary search tree involves creating a binary search tree from a singly linked list that is already sorted in ascending order. The idea is to take the middle element of the list and use it as the root of the binary search tree. Then, recursively convert the left and right halves of the list into the left and right subtrees of the root.

In this implementation, we define two classes: `ListNode` to represent a node of the linked list and `TreeNode` to represent a node of the binary search tree. We also define a `SortedListToBST` class that contains the logic to convert the sorted linked list to a binary search tree.

The `sortedListToBST` method is the entry point to the recursive algorithm. It takes the head of the linked list as an argument and returns the root of the binary search tree.

The `buildTree` method is a helper method that takes two pointers, `start` and `end`, representing the start and end nodes of the current sublist. It recursively builds a binary search tree by finding the middle node of the sublist, creating a new tree node with the middle node's value, and recursively calling itself to build the left and right subtrees using the left and right halves of the sublist.

The `findMid` method is a helper method that takes two pointers, `start` and `end`, representing the start and end nodes of the current sublist. It uses the slow and fast pointer technique to find the middle node of the sublist. The slow pointer moves one node at a time, while the fast pointer moves two nodes at a time. When the fast pointer reaches the end of the sublist or the node before the end, the slow pointer points to the middle node.

Overall, this implementation has a time complexity of O(n log n) and a space complexity of O(log n), where n is the number of nodes in the linked list.
