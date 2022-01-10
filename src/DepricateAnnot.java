class Project
{
	@Deprecated
	public void OldMethod()
	{
		System.out.println("Method needs changes");
	}
	public void NewMethod()
	{
		System.out.println("New Method");
	}
}
class DepricateAnnot
{
	public static void main(String args[])
	{
		Project obj = new Project();
		obj.OldMethod();
		obj.NewMethod();
	}
	
	
}