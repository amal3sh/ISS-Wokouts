package StreamAPI;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
class Employee implements Comparable
{
	private int id;
	private String name;
	private Double sal;
	
	public Employee() {
	 this.name = "undefined";
	 this.id = 0;
	 this.sal = 0.0;
	}
	public Employee(int id, String name, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employee newObj = (Employee)o;
		return (int)(this.getSal()-newObj.getSal());
	}
	
}

class StreamDemo4
{
	public static void main(String args[])
	{
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1,"Amalesh",5000.00));
		emp.add(new Employee(3,"Glen",9000.00));
		emp.add(new Employee(4,"Bobby",8000.00));
		emp.add(new Employee(5,"George",7000.00));
		emp.add(new Employee(5,"Unni",8500.00));
		
		//Sorting objects with salary
		System.out.println("-------Sorting objects-------");
		emp.stream().sorted().forEach(e->System.out.println(e));
		
		//filtering employee with salary gt 7k
		System.out.println("---------filtering employee with sal > 7k");
		emp.stream().filter(employee->employee.getSal()>7000).forEach(employee->System.out.println(employee));
		
		//Total salary of employees
		Double tot = emp.stream().map(employee->employee.getSal()).reduce(0.0,(Double a, Double b)->a+b);
		System.out.println(tot);
		
		//Employee with lowest salary
		emp.parallelStream().min((emp1,emp2)->emp1.getSal() > emp2.getSal() ? 1 : - 1).ifPresent(System.out::print);
		
	
	}
}