import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Exercicio 01
		//System.out.println("Exercicio 01");
		//int a1 = sc.nextInt();
		//int b1 = sc.nextInt();
		//int soma = a1+b1;
		//System.out.println("Soma = " + soma);
		
		//Exercicio 02
		//System.out.println("Exercicio 02");
		//double raio = sc.nextDouble();
		//double area = Math.pow(raio, 2) * Math.PI;
		//System.out.printf("A = %.4f\n",area);
		
		//Exercicio 03
	    //System.out.println("Exercicio 03");
	    //int A, B, C, D, diferenca;
	    //A = sc.nextInt();
	    //B = sc.nextInt();
	    //C = sc.nextInt();
	    //D = sc.nextInt();
	    //diferenca = (A*B - C*D);
	    //System.out.println("DIFERENCA = " + diferenca);
			
		//Exercicio 04
		//System.out.println("Exercicio 04");
		//System.out.println("Ingrese numero: ");
		//int numero = sc.nextInt();
		//System.out.println("Ingrese numero horas trabajadas: ");
		//int horasTrabajadas = sc.nextInt();
		//System.out.println("Ingrese valor que recibe por horas: ");
		//double pagoHoras = sc.nextDouble();
		//double salario = horasTrabajadas * pagoHoras;
		//System.out.println("NUMERO = " + numero);
		//System.out.printf("SALARY = U$ %.2f\n",salario);
		
		//Exercicio 05
	    //System.out.println("Exercicio 05");
	    //System.out.println("Peca 01");
	    //int codigo1 = sc.nextInt();
	    //int numeroPecas1 = sc.nextInt();
	    //double precoPecas1 = sc.nextDouble();
	    //System.out.println("Peca 02");
	    //int codigo2 = sc.nextInt();
	    //int numeroPecas2 = sc.nextInt();
	    //double precoPecas2 = sc.nextDouble();
	    //double valorPagar = numeroPecas1*precoPecas1 + numeroPecas2*precoPecas2;
	    //System.out.printf("Valor a pagar: R$ %.2f\n",valorPagar);
	    
	    //Exercicio 06
	    System.out.println("Exercicio 06");
	    double A = sc.nextDouble();
	    double B = sc.nextDouble();
	    double C = sc.nextDouble();
	    
	    double areaTriangulo = A*C/2;
	    double areaCirculo = Math.pow(C,2) * Math.PI;
	    double areaTrapezoide = (A+B)/2 * C;
	    double areaCuadrado = Math.pow(B, 2);
	    double areaRectangulo = A*B;
	    
	    System.out.printf("Triangulo: %.3f\n",areaTriangulo);
	    System.out.printf("Circulo: %.3f\n",areaCirculo);
	    System.out.printf("Trapezoide: %.3f\n",areaTrapezoide);
	    System.out.printf("Trapezoide: %.3f\n",areaCuadrado);
	    System.out.printf("Trapezoide: %.3f\n",areaRectangulo);
	    
				
		
		sc.close();

	}

}
