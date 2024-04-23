package lpaWhile;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número: ");
		n = ler.nextInt();
        
        while (n % 2 != 0){
        	System.out.print("O número digitado não é par. Digite novamente!  ");
        	n = ler.nextInt();
        	
        }
        System.out.print("O número " + n + "é par"); 
        ler.close();
	}

}
