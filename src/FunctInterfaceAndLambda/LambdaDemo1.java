package FunctInterfaceAndLambda;

class DesignDemo
{
	 Paintable p = () ->  "Paint with red";
	Editable e = () -> "Edit needed";
	
}

class LambdaDemo1
{
	public static void main(String args[])
	{
		DesignDemo template = new DesignDemo();
		System.out.println(template.p.paint());
		System.out.println(template.e.edit());
		
	}
}