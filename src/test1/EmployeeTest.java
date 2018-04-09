package test1;
import java.io.*;
public class EmployeeTest  {


	/**
	 * 
	 */
	public EmployeeTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		/* Create two objects using constructor */
		Employee empOne =new Employee("James Smith");
		Employee empTwo =new Employee("Mary Anne");
		// Invoking methods for each object created
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		empTwo.empAge(21);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
		System.out.println("=====================");
		System.out.println("until page 50 not yet");
		System.out.println("Public Access Modifier - public");
		empOne.operator();
		
		//added on 09/04/2018.
		int a , b;
		a =10;
		b =(a ==1)?20:30;
		System.out.println("Value of b is : "+ b );
		b =(a ==10)?20:30;
		System.out.println("Value of b is : "+ b );
		
		//added on 10/04/2018.		
		boolean resu = empTwo instanceof Employee;
		System.out.println("resu = "+ resu);		
		
		}
		
		
	}
