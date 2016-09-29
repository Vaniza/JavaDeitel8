package codigos;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		
		System.out.println("Entre com o primeiro inteiro");
		num1 = input.nextInt();
		
		System.out.println("Entre com o segundo inteiro");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		
		System.out.printf("SOma é igual %d \n", sum);
	}
}
