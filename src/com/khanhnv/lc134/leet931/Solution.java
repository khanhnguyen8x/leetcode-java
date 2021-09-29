package com.khanhnv.lc134.leet931;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
class Solution {

  public List<Integer> levelOrderSimple(TreeNode root) {
    List<Integer> order = new ArrayList<>();
    if (root == null) {
      return order;
    }

    Queue<TreeNode> queue = new LinkedList<>();

    // enqueue current root
    queue.add(root);

    // while there are nodes to process
    while (!queue.isEmpty()) {
      // dequeue next node
      TreeNode node = queue.poll();

      order.add(node.val);

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

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> order = new ArrayList<>();
    if (root == null) {
      return order;
    }

    Queue<TreeNode> queue = new ArrayDeque<>();

    // enqueue current root
    queue.add(root);

    // while there are nodes to process
    while (!queue.isEmpty()) {
      int queueLength = queue.size();
      List<Integer> row = new ArrayList<>();

      for (int i = 0; i < queueLength; i++) {
        // dequeue next node
        TreeNode node = queue.poll();
        row.add(node.val);
        // enqueue child elements from next level in order
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      order.add(row);
    }
    return order;
  }
}