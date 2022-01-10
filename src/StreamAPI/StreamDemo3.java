package StreamAPI;

import java.util.ArrayList;
import java.util.List;

class StreamDemo3
{
	public static void main(String args[])
	{
		
	
	List<String> names = new ArrayList<>();
	names.add("Amalesh");
	names.add("zaheer");
	names.add("Bobby");
	names.add("George");
	
	names.stream().sorted().findFirst().ifPresent(i->System.out.println(i));
	
	System.out.println("--------Sorted--------");
	names.stream().sorted().forEach(i->System.out.println(i));
	}
}