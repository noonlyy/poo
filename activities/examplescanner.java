package app;

import java.util.Scanner;

public class examplescanner {
	public static void main (String[] args ) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduza um número: ");
		int numero = scanner.nextInt();
		System.out.println("O número digitado foi "+numero);
		scanner.close();
	}

}
