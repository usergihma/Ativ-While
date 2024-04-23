package lpaWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n,i=0;

		System.out.println("Informe um valor limite");
		n = ler.nextInt();


		while(i<=n) {
			if (i%2 != 0){
				
				System.out.println(i + " É ímpar " );
				
			}
			i++;
		}


		ler.close();

	}

}
