package estruturasControle;



import java.util.Random;
import java.util.Scanner;

public class exercicios {
public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
Random aleatorio = new Random();
int numeroEscolhido = aleatorio.nextInt(100 + 1) ;
int numeroDigitado = 0 ;
int tentativas = 9;



while (numeroDigitado >= 0 && numeroDigitado <= 100 ) {
			System.out.println("Insira um número");
			numeroDigitado = entrada.nextInt();
			
			if (numeroDigitado == numeroEscolhido) {
				System.out.println("Você acertou sobrando " + (tentativas--) + " tentativas");
			    break;
             }	
			
			else if (numeroDigitado < 0 || numeroDigitado > 100) {
				System.out.println("Numero inválido");
			break;
			}
		
			if (tentativas < 1) {
				System.out.println("Acabou as tentativas.");
				break;
			}
			System.out.println("Faltam " + tentativas + " tentativas");
			tentativas--;
			 
			
			
			 if (numeroDigitado > numeroEscolhido) {
				System.out.println("É maior que o numero escolhido");
			}
			else if(numeroDigitado < numeroEscolhido )  {
            	System.out.println("É menor que o número escolhido");
                 
            }
             
            
} 




entrada.close();
}
}