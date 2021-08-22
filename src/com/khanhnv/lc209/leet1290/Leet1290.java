package com.khanhnv.lc209.leet1290;

public class Leet1290 {

  public static void main(String[] args) {
//    case 1
//    var myLinkedList = new MyLinkedList();
//    myLinkedList.addAtHead(1);
//    myLinkedList.addAtTail(3);
//    myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
//    var result = myLinkedList.get(1);              // return 2
//    System.out.println(result);
//    myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//    result = myLinkedList.get(1);              // return 3
//    System.out.println(result);

//    case 2
    var myLinkedList = new MyLinkedList();
    myLinkedList.addAtHead(7);
    myLinkedList.addAtHead(2);
    myLinkedList.addAtHead(1);
    myLinkedList.addAtIndex(3, 0);
    myLinkedList.deleteAtIndex(2);
    myLinkedList.addAtHead(6);
    myLinkedList.addAtTail(4);
    var result = myLinkedList.get(4);
    System.out.println("Get(4) = " + result);
    myLinkedList.addAtHead(4);
    myLinkedList.addAtIndex(5, 0);
    myLinkedList.addAtHead(6);

//    case 3
//    var myLinkedList = new MyLinkedList();
//    myLinkedList.addAtIndex(0, 10);
//    myLinkedList.addAtIndex(0, 20);
//    myLinkedList.addAtIndex(1, 30);
//    var result = myLinkedList.get(0);
//    System.out.println("Get(0) = " + result);
  }
}
