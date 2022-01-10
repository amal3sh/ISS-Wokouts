import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation
{
	int value();
}

class Hello
{
	@MyAnnotation(value=10)
	public void test()
	{
		System.out.println("Test annotation");
	}
}
class customAnnot
{
	public static void main(String args[])throws Exception
	{
		Hello h = new Hello();
		Method m = h.getClass().getMethod("test");
		 MyAnnotation annot = m.getAnnotation(MyAnnotation.class);
		 System.out.println("value is"+ annot.value());
		
	}
}