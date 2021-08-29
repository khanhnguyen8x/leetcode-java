package com.khanhnv.lc214.leet1214;

public class Solution {

  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    var fast = head;
    var slow = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        break;
      }
    }

    if (fast == null || fast.next == null) {
      return null;
    }

    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }
}