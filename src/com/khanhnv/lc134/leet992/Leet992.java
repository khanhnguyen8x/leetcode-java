package com.khanhnv.lc134.leet992;

import java.util.Arrays;

public class Leet992 {

  public static void main(String[] args) {
    // case 1
//    TreeNode root = new TreeNode(1);
//    root.right = new TreeNode(2);
//    root.right.left = new TreeNode(3);

    // case 2
//    TreeNode root = null;

    // case 3
//    TreeNode root = new TreeNode(1);

    // case 4
//    TreeNode root = new TreeNode(1);
//    root.left = new TreeNode(2);

    // case 5
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);

    var solution = new Solution();
    var result = solution.inorderTraversal(root);
    System.out.println(Arrays.toString(result.toArray()));
  }
}
