package exercicios;
import java.util.Random;
import java.util.Scanner;
public class exercicio2 {

/*Crie um m�todo com as instru��es necess�rias para o utilizador jogar um jogo tipo Sobe e Desce.

	Mostra um n�mero ao utilizador;
	O utilizador introduz o caracter �c� para indicar que o pr�ximo n�mero ser� maior que o mostrado;
	O utilizador introduz o caracter �b� para indicar que o pr�ximo n�mero ser� menor que o mostrado;
	Quando o jogador perder, mostra no ecr� quantas vezes acertou;
	Os n�meros gerados s�o entre 0 a 10
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
		
			
			System.out.println("O numero � o " + x0);	
			do{
				esc= reader.next().charAt(0);
			if(esc !='b' && esc !='c')
			{
				System.out.println(" Essa escolha n�o � v�lida. Escolha c se maior ou b se menor. " );
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
			    System.out.println("Perdeu!! O n�mero " + x + " Acertou :  " +cont + " vezes.");	break;
			}
			else if(esc=='b' && x>x0 )
			{
				System.out.println("Perdeu!! O n�mero " + x + " Acertou :  " +cont + " vezes.");break;	
				
			}
		}
		}
		System.out.println(cont); 
		}
        
        
        }
        
        


