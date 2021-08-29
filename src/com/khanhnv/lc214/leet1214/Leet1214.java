package com.khanhnv.lc214.leet1214;

public class Leet1214 {

  public static void main(String[] args) {


    /*
    ListNode head = new ListNode(3);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(0);
    ListNode node3 = new ListNode(-4);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node1;
     */


    /*
    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    head.next = node1;
    node1.next = head;
     */

    ListNode head = new ListNode(-1);
    ListNode node1 = new ListNode(-7);
    ListNode node2 = new ListNode(7);
    ListNode node3 = new ListNode(-4);
    ListNode node4 = new ListNode(19);
    ListNode node5 = new ListNode(6);
    ListNode node6 = new ListNode(-9);
    ListNode node7 = new ListNode(-5);
    ListNode node8 = new ListNode(-2);
    ListNode node9 = new ListNode(-5);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    node6.next = node7;
    node7.next = node8;
    node8.next = node9;
    node9.next = node6;

    var solution = new Solution();
    var result = solution.detectCycle(head);
    if (null != result) {
      System.out.println(result.val);
    } else {
      System.out.println("no cycle");
    }
  }

}
