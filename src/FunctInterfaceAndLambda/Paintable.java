package FunctInterfaceAndLambda;

interface Paintable
{
	public String paint();
	default String changeColor() //using default
	{
		
		return "Color change required";
	}
	
	
}