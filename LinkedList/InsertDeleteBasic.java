
public class LinkedListBasic {
Node head;
 static class  Node{
	 int data;
	 Node next;
	 Node(int data){
		 this.data=data;
		 this.next=null;
	 }
 }
 
 public static void main(String args[]) {
	 LinkedListBasic lst=new LinkedListBasic();
	insert(lst,1);
	insert(lst,2);
	insert(lst,3);
	insert(lst,4);

	traverse(lst);
	//list index start from 0
	deleteAtPosition(lst,3);
	traverse(lst);
	deleteAtPosition(lst,4);
	traverse(lst);
	deleteAtPosition(lst,0);
	traverse(lst);

 }
 
 private static void deleteAtPosition(LinkedListBasic lst, int pos) {
	 if(lst.head==null) {
		 System.out.println("Empty list");
		 return;
	 }
	 Node temp=lst.head;
	 if(pos==0) {
		 lst.head=lst.head.next;
		 return;
	 }
	 while(temp!=null && pos-->1) {
		 temp=temp.next;
	 }
	 if(temp==null ||temp.next==null) {
		 System.out.println("Out of range");
		 return;
	 }
	 Node next=temp.next.next;
	 temp.next=next;
	 
 }
 private static void delete(LinkedListBasic lst, int pos) {
	 if(lst.head==null) {
		 System.out.println("Empty list");
		 return;
	 }
	 Node n=lst.head;
	 Node prev=null;
	 Node cur=n;
	 if(pos==1) {
		 lst.head=lst.head.next;
		 return;
	 }
	 ;
	 while(pos-->0 && cur!=null) {
		 prev=cur;
		 cur=cur.next;
	 }
	 if(cur==null) {
		 System.out.println("Out of range");
		 return;
	 }
	 prev.next=cur.next;
}

private static void traverse(LinkedListBasic lst) {
	Node headCopy=lst.head;
	if(headCopy==null) {
		System.out.println("empty list");
		return;
	}
	while(headCopy!=null) {
		System.out.println(headCopy.data);
		headCopy=headCopy.next;
	}
	System.out.println("\n\n");
	
}

public static void insert(LinkedListBasic lst,int data) {
	if(lst.head==null) {
	 lst.head=new Node(data);
	 return;
	 }
	Node temp=lst.head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=new Node(data);
		 
 }
}

