package vietjack.ex.j09datastructure;

//Cách lấy phần tử đầu tiên và cuối cùng của một Linked List trong Java?
//Ví dụ sau minh họa cách lấy phần tử đầu tiên và cuối cùng của một Linked List
//bởi sử dụng phương thức linkedlistname.getFirst() và linkedlistname.getLast()
//của lớp LinkedList trong Java.
		
import java.util.LinkedList;

public class J02GetElementLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("100");
		lList.add("200");
		lList.add("300");
		lList.add("400");
		lList.add("500");
		System.out.println("First element of LinkedList is : " + lList.getFirst());
		System.out.println("Last element of LinkedList is : " + lList.getLast());
	}
}
