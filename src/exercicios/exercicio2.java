package exercicios;
import java.util.Random;
import java.util.Scanner;
public class exercicio2 {

/*Crie um método com as instruções necessárias para o utilizador jogar um jogo tipo Sobe e Desce.

	Mostra um número ao utilizador;
	O utilizador introduz o caracter ‘c’ para indicar que o próximo número será maior que o mostrado;
	O utilizador introduz o caracter ‘b’ para indicar que o próximo número será menor que o mostrado;
	Quando o jogador perder, mostra no ecrã quantas vezes acertou;
	Os números gerados são entre 0 a 10
	O jogo acaba quando o jogador perde;
 */

	public exercicio2() {
		Random rand = new Random();
		int x=0;
		int x0=rand.nextInt(20);
		char esc ='1';
		Scanner reader=new Scanner(System.in);
		int cont=0;
			
		while (esc!='0'){
		
			
			System.out.println("O numero é o " + x0);	
			do{
				esc= reader.next().charAt(0);
			if(esc !='b' && esc !='c')
			{
				System.out.println(" Essa escolha não é válida. Escolha c se maior ou b se menor. " );
			}
			else{break;}
			}while(esc !='b' && esc !='c');
			
		do{
                    x=rand.nextInt(20);
                }while(x==x0);
		
		if(esc=='c' && x>x0 )
		{
			cont++;
			x0=x;
		}
		
		else if(esc =='b' && x<x0)
		{
			cont++;
			x0=x;
		}
		
		else
		{
			
			if(esc=='c' && x<x0 )
			{
			    System.out.println("Perdeu!! O número " + x + " Acertou :  " +cont + " vezes.");	break;
			}
			else if(esc=='b' && x>x0 )
			{
				System.out.println("Perdeu!! O número " + x + " Acertou :  " +cont + " vezes.");break;	
				
			}
		}
		}
		System.out.println(cont); 
		}
        
        
        }
        
        


