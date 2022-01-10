class ExceptionDemo
{
	public static void main(String args[])
	{
	try {
		int arr[]= {5,5,74,7};
		System.out.println(arr[20]);
		@SuppressWarnings("unused")
		int a = 7/0;
		
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}catch(ArithmeticException e)
	{
		System.out.println(e);
	}
}
	}