package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		//Prencher Matrix
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		//Main Diagonal
		System.out.println();
		System.out.println("Main Diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		//Negative Number
		System.out.println();
		int cont = 0;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j]<0) {
					cont += 1;
				}
			}
		}
		System.out.println("Negative numbers = " + cont);
		
		sc.close();

	}

}
