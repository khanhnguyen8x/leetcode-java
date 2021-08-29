package com.khanhnv.lc214.leet1212;

public class Solution {

  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    var fast = head;
    var slow = head;
    while (fast != null && fast.next != null && slow != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  public boolean hasCycle2(ListNode head) {
    var fast = head;
    var slow = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == null || fast == null) {
        return false;
      }
      if (slow == fast) {
        return true;
      }
    }

    return false;
  }
}