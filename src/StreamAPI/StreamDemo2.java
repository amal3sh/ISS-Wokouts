package StreamAPI;

import java.util.ArrayList;
import java.util.List;

class StreamDemo2
{
	public static void main(String args[])	{
	List<Integer> values = new ArrayList<>();
	for(int i = 0; i<=100;i++)
		values.add(i);
	System.out.println(values.stream().reduce(0,(c,e)->(c+e)));
	System.out.println(values.stream().reduce(0,Integer::sum));
	}
}