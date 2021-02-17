import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		imprimir(higher);
		
		sc.close();
				
	} // fim void main

	public static int max(int a, int b, int c) {
		int mayor;
		
		if(a>b && a>c) {
			mayor = a;
		}
		else if(b>c) {
			mayor = b;
		}
		else {
			mayor = c;
		}
		return mayor;		
	}
	
	public static void imprimir(int higher) {
		System.out.println("El valor mayor es: " + higher);
	}
	
	
}
