package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("M linhas: ");
		int M = sc.nextInt();
		System.out.print("N colunas: ");
		int N = sc.nextInt();
		int[][] mat = new int[M][N];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("X elemento: ");
		int X = sc.nextInt();
		
		//Programa Pedido
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j]==X) {
					System.out.println("Position: " + i + "," + j + ":");
					if(j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j<mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i<mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
				
			}
		}
		
		
		
		
		
		
		sc.close();

	}

}
