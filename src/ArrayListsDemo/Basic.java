package ArrayListsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Basic {
	
	public static void main(String x[]) {
		System.out.println("Collection FrameWork");
		System.out.println("LinkedList");
		
		List<Integer> list=new ArrayList<>();
		list.add(40);
		list.add(20);
		list.add(30);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		List<Employee> employees=new ArrayList<Employee>();
		
		employees.add(new Employee(1,"Mahesh",100000));
		employees.add(new Employee(2,"Kannaiah",200000));
		employees.add(new Employee(3,"Lachaiah",300000));
		employees.add(new Employee(4,"Mallamma",400000));
		
   for(Employee s1:employees) {
	   System.out.println(s1.id);
	   s1.id=5;
	   System.out.println(s1.id);  
   }
   LinkedList<String> list1=new LinkedList<String>();
   
   list1.add("vinay");
   list1.add("Naveen");
   list1.add("Nishith");
   list1.addFirst("Mahesh");
   list1.addLast("Kannaiah");
   list1.contains("employees");
   System.out.println(list1);
 
		
	}
}
