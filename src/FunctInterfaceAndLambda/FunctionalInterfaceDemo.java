package FunctInterfaceAndLambda;

class Design implements Editable,Paintable
{
	public String paint()
	{
		return "Paint with red";
	}
	
	public String edit()
	{
		return "Edit needed";
		
	}
	
}

class FunctionalInterfaceDemo
{
 public static void main(String args[])
 {
	 Design obj = new Design();
	 System.out.println(obj.paint());
	 System.out.println(obj.edit());
	 System.out.println(obj.changeColor());
			 
 }
}