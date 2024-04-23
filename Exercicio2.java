package lpaWhile;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n ,soma=0, i= 1;
		while (i<=5) {
			i++;
			System.out.print("Informe nota uma nota");
			n = ler.nextDouble();
			soma=soma+n;

		}
		
		double media=soma/5;	
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
	}
	


}

