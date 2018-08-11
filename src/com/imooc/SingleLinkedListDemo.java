package com.imooc;

public class SingleLinkedListDemo {
  public static void main(String[] args) {
	  SingleLinked aLinkedList=new SingleLinked();
	  aLinkedList.add("321");
	  aLinkedList.add("q");
	  aLinkedList.add("e");
	  
	  aLinkedList.forEach(aLinkedList.head);
}
  
 
}

class SingleLinked{
	  Node head;
	  
	  Node nodes;
	  
	  class Node{
		  Object item;
		  Node next;
		public Node(Object item, Node next) {
			super();
			this.item = item;
			this.next = next;
		}
		  
	  }
	  
	  public  void add(Object obj) {
		  Node node=new Node(obj,null);
		   if(head==null) {
			   head=node;
			   this.nodes=node;
		   }else {
			   this.nodes.next=node;
			   this.nodes=node;
		   }
		   
	  }
	  
	  public  void forEach(Node node) {
		  while(node!=null) {
			  System.out.println(node.item);
			  node=node.next;
		  }
	  }
}
