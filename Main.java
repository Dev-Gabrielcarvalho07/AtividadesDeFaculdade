/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Pitoco" , 6  );
		Gato gato = new Gato("Lua", 2 );
		Papagaio papagaio = new Papagaio("Loro" , 4 );
		
	    System.out.println("Soms dos Animais ");
	    
	    System.out.println("=====Cachorro=====");
	    cachorro.ExibirInformacoes();
	    
	    System.out.println("=====Gato=====");
	    gato.ExibirInformacoes();
	    
	    System.out.println("=====Papagaio=====");
	    papagaio.ExibirInformacoes();
	  
	    
	    
	   
	}
	
}