package app;

import java.util.Scanner;

public class activities {
	public static void main (String[] args ) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Qual sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Olá "+nome +",você tem "+ idade + " anos." );
		scanner.close();
	}

}