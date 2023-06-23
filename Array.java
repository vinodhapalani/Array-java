package org.arr;

import java.util.LinkedList;
import java.util.List;

public interface Array {
      public static void main(String[] args) {
		//ClassName object=new Class name
    	 List<Integer>l= new LinkedList<>();
    	 l.add(10);
    	 l.add(20);
    	 l.add(30);
    	 l.add(40);
    	 l.add(10);
    	 l.add(10);
    	 l.add(40);
    	 l.add(50);
    	 
    	 System.out.println(l);
    	 int size=l.size();
    	 System.out.println("Size:"+size);
	}
}
