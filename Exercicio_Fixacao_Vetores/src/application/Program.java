package application;

import java.util.Scanner;

import entities.Pensionato;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int Nquartos = 10;
		Pensionato[] pensionato = new Pensionato[Nquartos];
		
		//Programa
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			pensionato[quarto] = new Pensionato(nome, email);
			System.out.println();
		}
		
		//impresion resultados
		System.out.println("Busy rooms: ");
		for(int i=0; i<pensionato.length; i++) {
			if(pensionato[i]!=null) {
				System.out.printf("%d: %s, %s\n",i, pensionato[i].getNome(),pensionato[i].getEmail());
			}
		}
		
		
		
		sc.close();
		

	}

}
