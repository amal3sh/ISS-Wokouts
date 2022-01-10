package StreamAPI;

import java.util.ArrayList;
import java.util.List;

class StreamDemo1
{
	public static void main(String args[])
	{
		
	
	List<Integer> values = new ArrayList<>();
	
	for(int i=0; i<50; i++)
		values.add(i);
	
	values.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
	values.stream().map(i->i*2).forEach(i->System.out.println(i));
	}
	
	
}