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
			System.out.println("Insira um n�mero");
			numeroDigitado = entrada.nextInt();
			
			if (numeroDigitado == numeroEscolhido) {
				System.out.println("Voc� acertou sobrando " + (tentativas--) + " tentativas");
			    break;
             }	
			
			else if (numeroDigitado < 0 || numeroDigitado > 100) {
				System.out.println("Numero inv�lido");
			break;
			}
		
			if (tentativas < 1) {
				System.out.println("Acabou as tentativas.");
				break;
			}
			System.out.println("Faltam " + tentativas + " tentativas");
			tentativas--;
			 
			
			
			 if (numeroDigitado > numeroEscolhido) {
				System.out.println("� maior que o numero escolhido");
			}
			else if(numeroDigitado < numeroEscolhido )  {
            	System.out.println("� menor que o n�mero escolhido");
                 
            }
             
            
} 




entrada.close();
}
}