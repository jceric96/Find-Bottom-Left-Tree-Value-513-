## 513. Find Bottom Left Tree Value

Given the root of a binary tree, return the leftmost value in the last row of the tree.

question:
1. if root is null what should I return ? return -1;
2. what's the range of the node value? 0 to 1000;
3. if the last row of the tree only has rightmost node, should I return null or rightmost node? if that return rightmost node.

Example 1:

Input: root = [2,1,3]
Output: 1

Example 2:

Input: root = [1,2,3,4,null,5,6,null,null,7]
Output: 7


Constraints:

The number of nodes in the tree is in the range [1, 104].
-2^31 <= Node.val <= 2^31 - 1