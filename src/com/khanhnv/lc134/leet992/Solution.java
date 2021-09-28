package com.khanhnv.lc134.leet992;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * <p>1) Create an empty stack S.</p>
 * <p>2) Initialize current node as root</p>
 * <p>3) Push the current node to S and set current = current->left until current is NULL</p>
 * <p>4) If current is NULL and stack is not empty then
 * a) Pop the top item from stack. b) Print the popped item, set current = popped_item->right c) Go
 * to step 3.
 * </p>
 * <p>5) If current is NULL and stack is empty then we are done.</p>
 */
class Solution {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> inorder = new ArrayList<>();
    if (root == null) {
      return inorder;
    }

    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      current = stack.pop();
      inorder.add(current.val);

      current = current.right;
    }

    return inorder;
  }
}