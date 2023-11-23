package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertToList {

public static void main(String[] args) {
	
	
	String[ ]a= {"A", "B", "A", "D", "E", "F"};
	List<Object> ara=null;
	Set<Object> araa= null;
	for (int i = 0; i < a.length; i++) {
		ara = Arrays.stream(a, 0, a.length).collect(Collectors.toList());
		araa = Arrays.stream(a, 0, a.length).collect(Collectors.toSet());
		Arrays.stream(a).collect(Collectors.toList());
	}
	System.out.println(ara);
	System.out.println(araa);
	
	ArrayList aq= new ArrayList();
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]);
	         aq.add(a[i]);
	         
	}
	System.out.println(aq);
	
	
	
	
}
}
