package CollectionWorkouts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MapDemo
{
	public static void main(String args[])
	{
		Map<Integer,Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student(1,"George",75));
		studentMap.put(2,new Student(4,"Ravi",78));
		studentMap.put(3,new Student(7,"Amalesh",45));
		studentMap.put(4, new Student(6,"Bobby",50));
		
		System.out.println(studentMap);
		
		
		Set<Integer> keys = studentMap.keySet();
		for(int key: keys)
			System.out.println(studentMap.get(key));
		
		
		//using mapentry
		
		for(Map.Entry<Integer,Student> studentEntry:studentMap.entrySet())
			System.out.println(studentEntry.getKey()+" "+ studentEntry.getValue());
			
		
		
		
		//removing 
		System.out.println(studentMap.remove(1));
		System.out.println(studentMap);
		
		
	}
}