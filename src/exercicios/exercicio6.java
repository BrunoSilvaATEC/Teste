package exercicios;

import java.util.Scanner;

public class exercicio6 {

	/*
	 Crie um programa que pede o utilizador um n�mero e imprime no ecr� os n�meros primos at� alcan�ar esse n�mero
	 */
	
	public exercicio6() {
	
		int num=0,
			  cont=0;
		
		System.out.println("Insira um numero: ");
		num= new Scanner(System.in).nextInt();

		for(int i=1;i<=num;i++)
		{
				cont=0;
				
				for(int x=1;x<=i;x++)
					{
						if(i%x==0)
						{
							cont++;
						}
					}
		if(cont==2)
		{
			System.out.println("Primos: " + i );
		}

		}
	}
}


