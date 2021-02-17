import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lendo String
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Ingrese String: ");
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		//Lendo Inteiro
		System.out.println("Ingrese Inteiro: ");
		int x1;
		x1 = sc.nextInt();
		System.out.println("Voce digitou inteiro: " + x1);
		//Lendo Double
		double x2;
		System.out.println("Ingrese Double: ");
		x2 = sc.nextDouble();
		System.out.println("Voce digitou double: " + x2);
		//Lendo Character
		char c;
		System.out.println("Ingrese String para Pegar el Primer Caracter: ");
		c = sc.next().charAt(0);
		System.out.println("El character es: " + c);
		
		//Leitura varios dados na mesma linha
		String x3;
		int y3;
		double z3;
		System.out.println("Escreva na mesma linha: String int double");
		x3 = sc.next();
		y3 = sc.nextInt();
		z3 = sc.nextDouble();
		System.out.println("Voce digitou: ");
		System.out.println(x3);
		System.out.println(y3);
		System.out.println(z3);

		
		
		sc.close();

	}

}
