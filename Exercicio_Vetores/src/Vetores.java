import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese o # de elementos do vetor: ");
		int n = sc.nextInt();
		//Vetor geracao
		double[] vect = new double[n];
		for(int i=0; i<n; i++) {
			System.out.printf("Ingresar altura %d = ", i);
			vect[i] = sc.nextDouble();
		}
		//Calcular la altura media
		double sum = 0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double average = sum/3;
		System.out.printf("AVERAGE HEIGHT = %.2f",average);
		
		
		sc.close();
		

	}

}
