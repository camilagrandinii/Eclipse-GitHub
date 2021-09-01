package operacoesNumeros;

import java.util.Scanner;

public class SomarDoisNumeros2 {
	public static Scanner entrada = new Scanner (System.in);
	public static void main (String[] args) {
		int num1, num2, soma;
		
		System.out.println("Digite um número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite outro número: ");
		num2 = entrada.nextInt();
		
		soma = num1+num2;
		
		System.out.println("Soma: "+soma);
	}
}
