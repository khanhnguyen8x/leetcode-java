package com.khanhnv.lc214.leet1296;

public class ListNode {

  int val;
  ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public void printNode() {
    var node = this;
    while (node != null) {
      System.out.print(node.val + " --> ");
      node = node.next;
    }
    System.out.println("end");
  }
}