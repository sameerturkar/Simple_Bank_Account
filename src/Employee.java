package com.TASK03june;

public class Employee {
	String employeeID;
	String employeeName;
	double salary;
	static String companyName;
	static int employeeCount;

	public Employee(String employeeID, String employeeName, double salary) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
		employeeCount++;
	}

	Employee() {
		this.employeeID = "Unknown";
		this.employeeName = "Unknown";
		this.salary = salary;

	}

	void raiseSalary(double amount) {
		salary = salary + amount;
		System.out.println("Salary Raised...");

	}

	void printEmployeeDetails() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + salary);
		/*
		 * System.out.println("Employee Company Name: " + companyName);
		 * System.out.println("Employee Employee Count: " + employeeCount);
		 */
	}

	static void setCompanyName(String name) {
		companyName = name;

	}

	static void printEmployeeCount() {
		System.out.println("Number of Employees: " + employeeCount);
	}

	/*
	 * static void printAllEmployees(Employee[] employees) { // employees =
	 * employeeName; System.out.println("all Employees: " + employees); }
	 */

	public static void main(String[] args) {
		Employee e1 = new Employee(); // for default
		e1.printEmployeeDetails();
		printEmployeeCount();
		System.out.println("Bank Name: " + companyName);
		//////////////////////// for Default.
		System.out.println("*****************");

		Employee e2 = new Employee("TCS1234", "sameer Turkar", 800000);
		setCompanyName("TCS");
		System.out.println("Company Name: " + companyName);
		printEmployeeCount();
		e2.printEmployeeDetails();

		System.out.println("**********************");
		Employee e3 = new Employee("INFO1234", "Omkar KHatik ", 1000000);
		setCompanyName("Infosys");
		System.out.println("Company Name: " + companyName);
		printEmployeeCount();
		e3.printEmployeeDetails();

	}

}
