package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		//System.out.println("\n");
		double salarioLiquido = employee.netSalary();
		System.out.println("Employee: " + employee.name + ", $ " + salarioLiquido);
		//System.out.println("\n");
		System.out.print("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		sc.close();
		
		
		sc.close();
		
		
	}

}
