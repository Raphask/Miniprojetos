package classes;

public class Jantar {

	public static void main(String[] args) {
		
	Pessoa p1 = new Pessoa(); {
	p1.nome = "Maldonado";
	p1.peso = 74.43;
	}
	
	Comida c1 = new Comida(); {
	c1.nomeComida = "Feijão";
	c1.pesoComida = 0.300;
	}
	
	Comida c2 = new Comida(); {
	c2.nomeComida = "Brigadeiro";
	c2.pesoComida = 0.223;
		
	}

    System.out.printf("O peso anterior de %s era %.2f \n", p1.nome, p1.peso);
	System.out.printf("A pessoa %s comeu %s e ficou com o peso de ", 
		p1.nome, c1.nomeComida);
    System.out.println(p1.comer( c1.pesoComida));
    
    System.out.printf("A pessoa %s comeu %s e ficou com o peso de ", 
   		p1.nome, c2.nomeComida);
    System.out.println(p1.comer( c2.pesoComida + c1.pesoComida));
	}
	}
	
	
	
