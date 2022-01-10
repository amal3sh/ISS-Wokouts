class Task
{
	public void doTask()
	{
		System.out.println("Parent");
	}
	
}
class Task2 extends Task
{
	//@Override
	public void dotask()
	{
		System.out.println("Child");
	}
}
class ovrrdAnotation
{
	public static void main(String args[])
	{
		Task2 ob = new Task2();
		ob.doTask();
	}
}