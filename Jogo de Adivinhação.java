package estruturasControle;



import java.util.Random;
import java.util.Scanner;

public class exercicios {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
Random aleatorio = new Random();
int numeroEscolhido = aleatorio.nextInt(100 + 1) ;
int numero = 0 ;
int tentativas = 10;



while (numero >= 0 || numero <= 100 ) {
			System.out.println("Insira um n�mero");
			numero = entrada.nextInt();
			
			if (numero < 0 || numero > 100) {
				System.out.println("Numero inv�lido");
			break;
			}
			if (numero == numeroEscolhido) {
				System.out.println("Voc� acertou.");
			System.out.println("Fim");
				break;
			} 
			
			
			numero += tentativas;
			tentativas--;
			
			if (tentativas <= 0) {
				System.out.println("Acabou as tentativas.");
				break;
			}
			System.out.println("Faltam " + tentativas + " tentativas");
            
					
			if (numeroEscolhido > numero) {
				System.out.println("� menor que o numero sorteado\n");
			}
             if(numeroEscolhido < numero) {
            	System.out.println("� maior que o numero sorteado\n");
                 
            }
            
            
} 




entrada.close();
}
}
