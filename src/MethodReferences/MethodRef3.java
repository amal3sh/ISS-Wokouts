package MethodReferences;

interface Messegeable
{
	Message getMessage(String msg);
}
class Message
{
	Message(String msg)
	{
		System.out.println(msg);
	}
}
class MethodRef3
{
	public static void main(String args[])
	{
		Messegeable hello = Message::new;
		 hello.getMessage("Poooi");
		//System.out.println(mes);
	}
}