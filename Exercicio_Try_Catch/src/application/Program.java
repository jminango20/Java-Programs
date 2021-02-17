package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();			
			System.out.println(vect[position]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}
		catch(InputMismatchException e) {
			System.out.println("Error input");
		}
		System.out.println("End of the Program");
		
		sc.close();

	}

}
