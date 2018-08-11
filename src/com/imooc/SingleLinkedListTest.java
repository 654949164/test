package com.imooc;

import javax.xml.soap.Node;

public class SingleLinkedListTest {
    public static void main(String[] args) {
		  SingleLinkedList aLinkedList=new SingleLinkedList();
		  aLinkedList.add("321");
		  aLinkedList.add("q");
		  aLinkedList.add("e");
		  
		  aLinkedList.forEeach(aLinkedList.head);
	}
}

class SingleLinkedList{
	//首节点
	Node head;
	//当前节点
	Node nodes;
	
	class Node{
		Object items;
		Node next;
		public Node(Object items, Node next) {
			super();
			this.items = items;
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
	
	public  void forEeach(Node node) {
		while(node!=null) {
			System.out.println(node.items);
			node=node.next;
		}
	}
	
	
}
