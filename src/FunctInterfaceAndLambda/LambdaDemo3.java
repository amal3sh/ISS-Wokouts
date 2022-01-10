package FunctInterfaceAndLambda;

import java.util.ArrayList;
import java.util.List;

class LambdaDemo3
{
	public static void main(String args[])
	{
	List<String> names = new ArrayList<>();
	names.add("Amalesh");
	names.add("George");
	names.add("Bobby");
	names.add("Glen");
	
	//Without lambda
	
	for(String name: names)
	System.out.println(name);
	
	//using lambda- this type also called internal iterations
	names.forEach(name->System.out.println(name));
	
	}
}