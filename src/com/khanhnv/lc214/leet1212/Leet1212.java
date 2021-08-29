package com.khanhnv.lc214.leet1212;

public class Leet1212 {

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
     */

    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(1);
    ListNode node3 = new ListNode(1);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;

    var solution = new Solution();
    boolean result = solution.hasCycle(head);
    System.out.println(result);
  }
}
