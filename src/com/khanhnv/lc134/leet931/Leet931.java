package com.khanhnv.lc134.leet931;

import java.util.Arrays;

public class Leet931 {

  public static void main(String[] args) {
    // case 1
//    TreeNode root = new TreeNode(3);
//    root.left = new TreeNode(9);
//    root.right = new TreeNode(20);
//    root.right.left = new TreeNode(15);
//    root.right.right = new TreeNode(7);

    // case 2
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(5);

    var solution = new Solution();
//    var result = solution.preorderTraversal(root);
    var result = solution.levelOrderSimple(root);
    System.out.println(Arrays.toString(result.toArray()));
    var result2 = solution.levelOrder(root);
    System.out.println(Arrays.toString(result2.toArray()));
  }
}
