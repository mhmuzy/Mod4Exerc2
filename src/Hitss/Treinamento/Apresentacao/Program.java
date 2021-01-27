package Hitss.Treinamento.Apresentacao;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("       Hitss Treinamento");
		System.out.println("");
		System.out.println("Olá usuário, segue a sequência dos números de 1 a 100:");
		System.out.println("");
		int input; 
		
		for (input = 0; input <= 100; input++) {
			
		
		int d,x = 0; int[] b = new int[8]; 
		
		d = input;
		
		while (d > 1) {
			
			
		
			 b[x] = d % 2; d = d/2; x++; 
			 System.out.print(" -- ");
		} 
		 for (int cont=b.length-1; cont>=0; cont--) 
		 {
			 System.out.print(b[cont]);
	     }
		 
		 
		}
	}
}
