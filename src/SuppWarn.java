import java.util.*;

class Unused
{
	public void test()
	{
		System.out.println("Unused block");
	}
}
class SuppWarn
{
	@SuppressWarnings("unchecked")
	
	public static void main(String args[])
	{
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add("elem1");
		list.add("elem2");
		list.add("elem3");
		
		for(Object ob:list)
			System.out.println(ob);
		@SuppressWarnings("unused")
		Unused obj2 = new Unused();
	}
}