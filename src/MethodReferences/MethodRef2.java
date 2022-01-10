package MethodReferences;

class MethodRef2
{
	public static void ThreadStat()
	{
		System.out.println("Thread is runnning");
	}
	public static void main(String args[])
	{
		Thread t = new Thread(MethodRef2::ThreadStat);
		t.start();
	}
}