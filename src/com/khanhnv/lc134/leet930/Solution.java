package com.khanhnv.lc134.leet930;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class Solution {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> inorder = new ArrayList<>();
    if (root == null) {
      return inorder;
    }

    postorderTraversalRecursive(root, inorder);

    return inorder;
  }

  public void postorderTraversalRecursive(TreeNode root, List<Integer> inorder) {
    if (root == null) {
      return;
    }

    // In-order traversal is to traverse the left subtree first
    postorderTraversalRecursive(root.left, inorder);

    // Finally, traverse the right subtree.
    postorderTraversalRecursive(root.right, inorder);

    // Then visit the root
    inorder.add(root.val);
  }
}