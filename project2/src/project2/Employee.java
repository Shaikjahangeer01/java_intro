package project2;

public class Employee {
	static String Company;
	static int Salary;
	int eid;
	String eName;
	String Dept;

	public static void main(String[] args) {
		Company = "Vcube";
		Salary = 25000;

		Employee Emp = new Employee();

		Emp.eid = 101;
		Emp.eName = "Akash";
		Emp.Dept = "JFS";

		Employee Emp1 = new Employee();

		Emp1.eid = 102;
		Emp1.eName = "Mouli";
		Emp1.Dept = "JFS";

		Employee Emp2 = new Employee();

		Emp2.eid = 103;
		Emp2.eName = "Akshay";
		Emp2.Dept = "JFS";
		
		System.out.println("***************************");
		System.out.println(Employee.Company);
		System.out.println(Employee.Salary);
		System.out.println(Emp.eid);
		System.out.println(Emp.eName);
		System.out.println(Emp.Dept);
		System.out.println("***************************");
		System.out.println("");
		
		Company  = "Aka.Ltd";
		Salary = 50000;
		System.out.println(Employee.Company);
		System.out.println(Employee.Salary);
		System.out.println(Emp1.eid);
		System.out.println(Emp1.eName);
		System.out.println(Emp1.Dept);
		System.out.println("***************************");
		System.out.println("");
		
		Company  = "Shaik.Ltd";
		Salary = 50000;
		System.out.println(Employee.Company);
		System.out.println(Employee.Salary);
		System.out.println(Emp2.eid);
		System.out.println(Emp2.eName);
		System.out.println(Emp2.Dept);
		System.out.println("***************************");
		System.out.println("");
		

	}

}
