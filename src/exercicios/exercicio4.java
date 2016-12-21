package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public exercicio4() {
	/*
	 Numa partida de futebol contra o Canelas, o Clube dos Passarinhos quis utilizar o computador que tem na bilheteira para contar quantos sócios envergam a camisola oficial do clube;
	  deste modo, aquando a venda de um bilhete, o funcionário deve apontar apenas:

	‘c’ se o sócio utilizar a camisola oficial do clube;
	‘n’ se o sócio utilizar roupa normal;
	Quando o funcionário carregar ‘s’ o programa sai e mostra as seguintes informações:
	Quantas pessoas compraram ingresso;
	Quanto dinheiro foi angariado com a venda de camisolas;
	Quanto dinheiro foi angariado com a venda de bilhetes;
	O valor de cada bilhete é de 7.5€; cada camisola oficial é vendida por 14€.
	 * */
	char op;
	Scanner reader=new Scanner(System.in);
	int cont=0,
		  conts=0,
		  camivendidas=0,
		 bilhetesvendidios;
	//vendas	
	double
		totalcamisolas=0,
		totalbilhetes=0,
		  totaldinheiro=0;
		
do {
	
	System.out.println("Socio com camisola (c), sem camisola (n)");
	op =reader.next().charAt(0);	
	if (op =='c')
	{
		cont++;
	}
	else  if (op == 'n')
	{
		conts=conts+1;
	}
	
	
	
	
}while (op !='s');
	
bilhetesvendidios=(cont+conts);
totalbilhetes =bilhetesvendidios*7.5;
camivendidas= cont;
totalcamisolas=camivendidas*14;


System.out.println("Foram vendidos " + bilhetesvendidios + " bilhetes e foi angariado com a venda de bilhetes um total de " + totalbilhetes+" euros "  );
System.out.println("Foram vendidas " + camivendidas + " camisolas e foi angariado com a venda de camisolas um total de " + totalcamisolas+" euros "  );

		
	}

}
