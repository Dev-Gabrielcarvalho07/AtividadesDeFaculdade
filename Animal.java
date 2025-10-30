public class Animal{
    String nome ;
    int idade;
    
    
    public Animal(String nome, int idade){
        this.nome = nome ; 
        this.idade = idade;
       
        
        
    }
    public String FazerSom(){
        return "Tipos de som de animais:";
        
    }
    public void ExibirInformacoes(){
        System.out.println(" Nome do animal: " + nome );
        System.out.println(" Idade do Animal: " + idade + " Messes ");
        System.out.println(" Som do Animal: " + FazerSom());
    }
    
    
}