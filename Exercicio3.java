package lpaWhile;
 import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n, par= 0, impar = 0, i=0;

		while( i<=9 ) {
			i++;
			System.out.println("Informe um número");
			n = ler.nextInt();
			
			if (n%2 != 0)
				par = par + 1 ;

		   else 
				impar = impar + 1;
			}
			System.out.println("Qntdad de par " + par );
			System.out.println("Qntdad de impar " + impar);
		


		ler.close();

	}

}