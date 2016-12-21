package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public exercicio1() {
	
	/*Indique o código em que :

É pedido ao utilizador que introduza 5 caracteres, que serão gravados num array de char;
Indique ao utilizador quantos caracteres correspondem a um número entre 0 e 9.*/
		
		
		
		
		int contar=0;
		String valor;
		char[] caract= new char[5];
		
		System.out.println("insira  5 caracteres: ");
		valor = new Scanner(System.in).nextLine();
		
		caract=valor.toCharArray();

		for(int i=0;i<valor.length();i++)
		{
			num(caract[i]);
				if(num(caract[i])==true)
				{
					contar++;
				}

		}
		
		
		System.out.println("Existem "+contar+" caracteres correspondentes entre 0 e 9");
		}

		static boolean num(char caract)
		{

		switch(caract)
		{
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9': 
		return true;
		default: return false;
		}

		}
}