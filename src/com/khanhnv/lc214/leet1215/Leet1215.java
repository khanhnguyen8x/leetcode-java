package com.khanhnv.lc214.leet1215;

public class Leet1215 {

  public static void main(String[] args) {

    var headA = new ListNode(4);
    var nodeA1 = new ListNode(1);
    var nodeA2 = new ListNode(8);
    var nodeA3 = new ListNode(4);
    var nodeA4 = new ListNode(5);
    headA.next = nodeA1;
    nodeA1.next = nodeA2;
    nodeA2.next = nodeA3;
    nodeA3.next = nodeA4;

    var headB = new ListNode(5);
    var nodeB1 = new ListNode(6);
    var nodeB2 = new ListNode(1);
    headB.next = nodeB1;
    nodeB1.next = nodeB2;
    nodeB2.next = nodeA2;


    /*
    var headA = new ListNode(3);

    var headB = new ListNode(2);
    headB.next = headA;
     */

    var solution = new Solution();
    var result = solution.getIntersectionNode(headA, headB);
    if (null != result) {
      System.out.println(result.val);
    } else {
      System.out.println("no intersection");
    }
  }

}
