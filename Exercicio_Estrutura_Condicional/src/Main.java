import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//Exercicio 1
		//int x = sc.nextInt();
		//if (x < 0) {
		//	System.out.println("NEGATIVO");
		//}
		//else {
		//	System.out.println("NAO NEGATIVO");
		//}
		//Otra forma
		//String s = (x<0) ? "NEGATIVO":"NAO NEGATIVO";
		//System.out.println(s);
		
		//EXERCICIO 2
		//int x = sc.nextInt();
		//double residuo = x % 2;
		//String s = (residuo == 0) ? "PAR":"IMPAR";
		//System.out.println(s);
		
		//EXERCICIO 3
		//int A = sc.nextInt();
		//int B = sc.nextInt();
		//double resultado;
		//String s;
		//if (A>B) {
		//	resultado = A % B;
		//	s = (resultado == 0) ? "Multiplo":"Nao Multiplo";
		//}
		//else {
		//	resultado = B % A;
		//	s = (resultado == 0) ? "Multiplo":"Nao Multiplo";
		//}
		//System.out.println(s);
		
		//EXERCICIO 4
		//int inicio = sc.nextInt();
		//int fin = sc.nextInt();
		//int duracao;
		//if (fin > inicio) {
		//	duracao = fin - inicio;
		//	System.out.println("O jogo durou: " + duracao + " Horas");
		//}
		//else {
		//	duracao = 24 - inicio + fin;
		//	System.out.println("O jogo durou: " + duracao + " Horas");
		//}
		
		
		//EXERCICIO 5
		//int codigo = sc.nextInt();
		//int quantidade = sc.nextInt();
		//double resultado = 0;
		
		//switch(codigo) {
		//	case 1:
		//		resultado = quantidade * 4.00;
		//		break;
		//	case 2:
		//		resultado = quantidade * 4.50;
		//		break;
		//	case 3:
		//		resultado = quantidade * 5.00;
		//		break;
		//	case 4:
		//		resultado = quantidade * 2.00;
		//		break;
		//	case 5:
		//		resultado = quantidade * 1.50;
		//		break;
		//	default:
		//		System.out.println("Producto no Existe");
		//}
		//System.out.println("Total: R$ "+ resultado);
		
		
		//EXERCICIO 6
		//double valor = sc.nextDouble();
		//if (valor>=0 && valor<=25) {
		//	System.out.println("Intervalo (0,25]");
		//}
		//else if (valor>25 && valor<=50) {
		//	System.out.println("Intervalo (25,50]");
		//}
		//else if (valor>50 && valor<=75) {
		//	System.out.println("Intervalo (50,75]");
		//}
		//else if (valor>75 && valor<=100) {
		//	System.out.println("Intervalo (75,100]");
		//}
		//else {
		//	System.out.println("Fora Intervalo");
		//}
		
		
		//EXERCICIO 7
		//double x = sc.nextDouble();
		//double y = sc.nextDouble();
		
		//if (x>0 && y>0) {
		//	System.out.println("Q1");
		//}
		//else if (x>0 && y<0) {
		//	System.out.println("Q4");
		//}
		//else if (x<0 && y>0) {
		//	System.out.println("Q2");
		//}
		//else if (x<0 && y<0) {
		//	System.out.println("Q5");
		//}
		//else if (x==0 && y==0) {
		//	System.out.println("Origem");
		//}
		//else if(x == 0 ) {
		//	System.out.println("Eje y");
		//}
		//else if(y == 0 ) {
		//	System.out.println("Eje x");
		//}
				
		
		//EXERCICIO 8
		double salario = sc.nextDouble();
		double imposto = 0;
		if (salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if (salario <= 3000.00) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f\n",imposto);
		}
		else if (salario <= 4500.00 ) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00*0.08;
			System.out.printf("R$ %.2f\n",imposto);			
		}
		else {
			imposto = (salario - 4500.00) * 0.28 + 1500.00*0.18 + 1000.00*0.08;
			System.out.printf("R$ %.2f\n",imposto);
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
