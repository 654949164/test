package com.itheima;

public class singleTest {
  public static void main(String[] args) {
	SingleLink singleLinkedList=new SingleLink();
	singleLinkedList.add("12");
	singleLinkedList.add("sd");
	singleLinkedList.add("34");
	singleLinkedList.add("66");
	
	singleLinkedList.forEach(singleLinkedList.head);
	
	
}
  
  
}
class SingleLink{
	  Node head;
	  Node nodes;
	  class Node{
		  Object items;
		  Node next;
		public Node(Object items, Node next) {
			super();
			this.items = items;
			this.next = next;
		}
		public Node() {
			super();
			
		}
		
		
	  }
	  
	  
	  public  void add(Object obj) {
		  Node node =new Node(obj,null);
		  if(head==null) {
			  head=node;
			  this.nodes=node;
		  }else {
			  this.nodes.next=node;
			  this.nodes=node;
		  }
	  }
	  
	  public  void forEach(Node node) {
		  while(node !=null) {
			  System.out.println(node.items);
			  node=node.next;
		  }
	  }
	  
}
