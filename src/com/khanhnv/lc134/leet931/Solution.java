package com.khanhnv.lc134.leet931;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
class Solution {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> order = new ArrayList<>();
    if (root == null) {
      return order;
    }

    Queue<TreeNode> queue = new LinkedList<>();

    // enqueue current root
    queue.add(root);

    // while there are nodes to process
    while (!queue.isEmpty()) {
      List<Integer> orderNode = new ArrayList<>();
      // dequeue next node
      TreeNode node = queue.poll();

      orderNode.add(node.val);
      order.add(orderNode);

      // enqueue child elements from next level in order
      if (node.left != null) {
        queue.add(node.left);
      }

      if (node.right != null) {
        queue.add(node.right);
      }
    }
    return order;
  }
}