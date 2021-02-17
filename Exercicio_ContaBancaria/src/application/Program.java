package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Conta contaInformacao;
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?: ");
		char option = sc.next().charAt(0);
		
		if(option=='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			contaInformacao = new Conta(conta, nome, initialDeposit);
		}
		else {
			contaInformacao = new Conta(conta, nome);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(contaInformacao);
		//System.out.printf("Account %d, Holder: %s, Balance: $ %.2f",contaInformacao.getConta(),contaInformacao.getNome(),contaInformacao.getSaldoConta());
		
		
		//Continuando
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valor = sc.nextDouble();
		contaInformacao.deposit(valor);
		//System.out.println();
		System.out.println("Updated account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f",contaInformacao.getConta(),contaInformacao.getNome(),contaInformacao.getSaldoConta());
		
		System.out.println("\n");
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		contaInformacao.withdraw(valor);
		//System.out.println();
		System.out.println("Updated account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f",contaInformacao.getConta(),contaInformacao.getNome(),contaInformacao.getSaldoConta());
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
