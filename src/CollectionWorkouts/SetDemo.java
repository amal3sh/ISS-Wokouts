package CollectionWorkouts;

import java.util.HashSet;
import java.util.Set;

class SetDemo
{
	public static void main(String args[])
	{
		
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student(1,"George",75));
		studentSet.add(new Student(4,"Arathy",60));
		studentSet.add(new Student(3,"Bobby",50));
		studentSet.add(new Student(2,"Unni",45));
		studentSet.add(new Student(5,"Ammu",70));
		
		System.out.println(studentSet);
		
		
		
		//removing an object
		System.out.println("---------removing object--------");
		studentSet.remove(new Student(2,"Unni",45));
		System.out.println(studentSet);
		
		
		
		System.out.println(studentSet.contains(new Student(1,"George",75)));
		
		for(Student s : studentSet)
		{
			System.out.println(s);
		}
	}
	
	
}