import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 32;
		double x = 10.35784;
		
		System.out.println("Numero Entero");
		System.out.println(y);
		System.out.println("Numero Decimal");
		System.out.println(x);
		System.out.println("Numero Decimal 2 decimales");		
		System.out.printf("%.2f\n", x);
		System.out.println("Numero Decimal 4 decimales");
		System.out.printf("%.4f\n", x);		
		Locale.setDefault(Locale.US);
		System.out.println("Numero Decimal 3 decimales USA");
		System.out.printf("%.3f\n", x);		
		System.out.println("Concatenando");
		System.out.println("RESULTADO = " + x + " Metros");
		System.out.println("Usando Printf");
		System.out.printf("Resultado = %.2f metros\n", x);
		
		//Mas de Printf
		String nome = "Maria";
		int edad = 35;
		double salario = 4000.0;
		System.out.printf("%s tem %d anos e ganha $ %.1f reais\n", nome,edad,salario);
		
		//Exercicio Fixaca
		String product1 = "Computer";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double measure = 53.234567;
		
		System.out.println("Ejercicio");
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f", product1,price1);
		System.out.println("\n");
		System.out.printf("Record: %d years old, code %d and gender: %c", age,code,gender);
		System.out.println("\n");
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Rounded (three decimal places): %.3f", measure);

		
		

	}

}
