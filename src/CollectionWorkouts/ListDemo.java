package CollectionWorkouts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ListDemo
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1,"George",75));
		studentList.add(new Student(4,"Arathy",60));
		studentList.add(new Student(3,"Bobby",50));
		studentList.add(new Student(2,"Unni",45));
		studentList.add(new Student(5,"Ammu",70));
		
		System.out.println(studentList);
	
		//accesing with index value
		System.out.println(studentList.get(2)); 
		
		//getting index of an object
		System.out.println(studentList.indexOf(new Student(4,"Arathy",60)));
		
		
		//updating  an item
		studentList.set(2,new Student(6,"Amalesh",74));
		System.out.println(studentList.get(2));
		
		//removing an item
		studentList.remove(1);
		System.out.println(studentList);
		
		//searching
		System.out.println(studentList.contains(new Student(5,"Ammu",70))); 
		
		//sorting
		Collections.sort(studentList);
		
		 
		 
	
		//Using iterator
		
		System.out.println("---------Using Iterator----------");
		Iterator<Student> i = studentList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//Using For loop
		
		System.out.println("--------Using For Loop--------");
		for(int j =0 ; j < studentList.size();j++)
		{
			System.out.println(studentList.get(j));
			
		}
		
		//Using enhanced for
		System.out.println("--------Using enhancedFor Loop--------");
		 for(Object s: studentList)
		 {
			 System.out.println(s);
		 }
		
		
		
		
		
		
	
	}
}