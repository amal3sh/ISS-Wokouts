package FunctInterfaceAndLambda;

//class StartDraw
//{
//	Drawable d = (int a,int b) ->
//	{
//		System.out.println("Width ="+a);
//		System.out.println("Height="+b);
//		
//	};
//}

class LambdaDemo2
{
	public static void main(String args[])
	{
//		StartDraw dr = new StartDraw();
//		dr.d.draw(10, 20);
		
		Drawable d = (int a,int b) ->
		{
			System.out.println("Width ="+a);
			System.out.println("Height="+b);
		
		};
		d.draw(10,20);
	}
}