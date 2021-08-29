package com.khanhnv.lc214.leet1215;

import java.util.HashSet;

public class Solution {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    var set = new HashSet<ListNode>();
    while (headA != null) {
      set.add(headA);
      headA = headA.next;
    }

    while (headB != null && set.add(headB)) {
      headB = headB.next;
    }

    return headB;
  }

  public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
    if (headA.next == null && headB.next == null) {
      if (headA == headB) {
        return headA;
      }
      return null;
    }
    var node1 = headA;
    var node2 = headB;
    ListNode intersection = null;

    do {
      do {
        if (node1 == node2) {
          intersection = node1;
          break;
        }
        node2 = node2.next;
      } while (node2 != null);

      if (null != intersection) {
        break;
      }

      node1 = node1.next;
      node2 = headB;

    } while (node1 != null);
    return intersection;
  }
}