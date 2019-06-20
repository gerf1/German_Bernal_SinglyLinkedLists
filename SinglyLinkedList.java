import java.io.*;

public class SinglyLinkedList {
 public Node head;
 public SinglyLinkedList() {
  this.head = null;
 }
 // SLL methods go here. As a starter, we will show you how to add a node to the list.

 

 public void remove() {

  try {
 
        Node runner = head;
        while(runner.next.next != null){
            runner = runner.next;  
        }
        runner.next = null;
    }catch (NullPointerException e) {
   System.out.println("You can not remove the node because it has a null value or you have not entered values");
  }
 }


 public void printValues() {
  try {
   Node runner = head;
   while (runner.next != null) {
    System.out.println(runner.value);
    runner = runner.next;
   }
   System.out.println(runner.value);
  } catch (NullPointerException e) {
   System.out.println("The values can not be printed because there is a null value or values have not been entered.");

  }
 }

 public void add(int value) {
  Node newNode = new Node(value);
  if (head == null) {
   head = newNode;
  } else {
   Node runner = head;
   while (runner.next != null) {
    runner = runner.next;
   }
   runner.next = newNode;
  }
 }
}