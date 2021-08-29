package com.khanhnv.lc214.leet1296;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void removeNthFromEnd() {
    var solution = new Solution();
    var head = new ListNode(1);
    var result = solution.removeNthFromEnd(head, 1);
    Assert.assertEquals(null, result);
  }

  @Test
  public void removeNthFromEnd2() {
    var solution = new Solution();
    var head = new ListNode(1);
    var node = new ListNode(2);
    head.next = node;
    var result = solution.removeNthFromEnd(head, 2);
    Assert.assertEquals(result.val, 2);
  }

  @Test
  public void removeNthFromEnd3() {
    var solution = new Solution();
    var head = new ListNode(1);
    var node = new ListNode(2);
    head.next = node;
    var result = solution.removeNthFromEnd(head, 1);
    Assert.assertEquals(result.val, 1);
  }
}