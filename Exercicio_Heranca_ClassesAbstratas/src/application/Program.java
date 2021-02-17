package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipo variados de contas: Business ou Savings Account
		List<Account> list = new ArrayList<Account>();
		list.add(new SavingsAccount(1000, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1001, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1002, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1003, "Anna", 500.00, 500.00));
		
		//Mostrar valor de todas as contas somado
		double sum = 0.0;
		for(Account acc:list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total Balance: $ %.2f\n",sum);

		//Depositar valor de $10 em cada conta
		System.out.println();
		System.out.println("Depositos de $10.0 em cada conta: ");
		for(Account acc:list) {
			acc.deposit(10.0);
		}
		for(Account acc:list) {
			System.out.printf("Update balance for account %d: $ %.2f\n",acc.getNumber(),acc.getBalance());
		}

	}

}
