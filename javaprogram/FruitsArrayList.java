package Arraylist;

import java.util.ArrayList;

public class FruitsArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Pomagranate");
		list.add("Pineapple");
		list.add("Grapes");
		
//		for(String str:list) {
//			System.out.println(str.subSequence(0, 3));
//		}
		
		String s="Mango";
	    
		System.out.println(list);
		System.out.println(list.contains(s));

	}

}
