package com.oop;

public class Employee {
	
	//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
	//and methods to calculate and update salary.
		
	 String name;
	 String job_title;
	 double salary;
	 
	 public Employee(String name, String job_title, double salary) {
		 this.name = name;
		 this.job_title = job_title;
		 this.salary = salary;
	 }
	 
	 public double calculate_salary(int newSalary) {
		 double total_salary = salary + newSalary;
		 return total_salary;
	 }
	 
	 public double update_salary(double bonus) {
		 double new_salary = salary + (salary * bonus);
		 return new_salary;
	 }
	 
	public static void main(String[] args) {
		Employee e1 = new Employee("john","developer", 10000);
		
		e1.calculate_salary(10000);
		e1.update_salary(0.15);
		
		System.out.println(e1.name+" is "+e1.job_title+" who get salary "+e1.salary);
		System.out.println(e1.name+" is "+e1.job_title+" who get total salary "+e1.calculate_salary(10000));
		System.out.println(e1.name+" is "+e1.job_title+" who get bonus salary "+e1.update_salary(0.15));
	}

}
