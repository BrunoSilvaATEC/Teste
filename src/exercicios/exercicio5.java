package exercicios;

public class exercicio5 {

	public exercicio5() {
	/*Indique o c�digo em que:

Declare um array de inteiros com os valores 5, 2 e 7;
Declare a vari�vel produto;
Com um ciclo �for�, obtenha o valor de 527 e armazene esse valor na vari�vel produto;
Mostre no ecr� o resultado de �produto�;*/
		
	int[] valores;
	valores = new int[3];
		int produto = 1;
		valores [0] = 5;
		valores [1] = 2;
		valores [2] = 7;

		for(int i : valores)
		{
			produto *= i;
		}
		
		System.out.printf("O Produto � " + produto);
	
}
}