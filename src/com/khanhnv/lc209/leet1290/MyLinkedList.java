package com.khanhnv.lc209.leet1290;

class MyLinkedList {

  //Represent the head and tail of the singly linked list
  public Node head = null;

  static class Node {

    int val;
    Node next;

    public Node(int val) {
      this.val = val;
      this.next = null;
    }
  }

  /**
   * Initialize your data structure here.
   */
  public MyLinkedList() {
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    if (this.head == null) {
      return -1;
    } else {
      if (index == 0) {
        return head.val;
      }
      var temp = this.head;
      for (var i = 0; temp != null && i < index; i++) {
        temp = temp.next;
      }
      if (temp == null) {
        return -1;
      }
      return temp.val;
    }
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the
   * new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    var node = new Node(val);

    if (this.head == null) {
      this.head = node;
    } else {
      node.next = this.head;
      this.head = node;
    }

    print();
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val) {
    // init a new node
    var node = new Node(val);

    if (this.head == null) {
      this.head = node;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = node;
    }

    print();
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the
   * length of linked list, the node will be appended to the end of linked list. If index is greater
   * than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {
    // init a new node
    if (index == 0) {
      this.addAtHead(val);
      return;
    }

    if (this.head == null) {
      return;
    }

    var node = new Node(val);
    Node temp = head;
    
    for (var i = 0; temp != null && i < index - 1; i++) {
      temp = temp.next;
    }

    // If position is more than number of nodes
    if (temp == null) {
      return;
    }

    // Node temp->next is the node to be deleted
    // Store pointer to the next of node to be deleted
    node.next = temp.next;
    temp.next = node;

    print();
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {
    if (this.head == null) {
      return;
    }

    Node temp = head;
    if (index == 0) {
      this.head = temp.next;
      return;
    }

    for (var i = 0; temp != null && i < index - 1; i++) {
      temp = temp.next;
    }

    // If position is more than number of nodes
    if (temp == null || temp.next == null) {
      return;
    }

    // Node temp->next is the node to be deleted
    // Store pointer to the next of node to be deleted
    var next = temp.next.next;
    temp.next = next;

    print();
  }

  public void print() {
    MyLinkedList.Node node = this.head;
    while (node != null) {
      System.out.print(node.val + " -> ");
      node = node.next;
    }
    System.out.println("");
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such: MyLinkedList obj = new
 * MyLinkedList(); int param_1 = obj.get(index); obj.addAtHead(val); obj.addAtTail(val);
 * obj.addAtIndex(index,val); obj.deleteAtIndex(index);
 */