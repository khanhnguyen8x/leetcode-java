
package com.khanhnv.lc214.leet1296;

public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null || (head.next == null && n == 1)) {
      return null;
    }

    var length = 1;
    var node = head;
    while (node.next != null) {
      node = node.next;
      length++;
    }

    var position = length - n;
    if (position == 0) {
      return head.next;
    }

    node = head;
    for (var i = 0; node != null && i < position - 1; i++) {
      node = node.next;
    }

    if (node != null && node.next != null) {
      node.next = node.next.next;
    }

    return head;
  }
}