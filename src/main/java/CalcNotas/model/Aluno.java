/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalcNotas.model;

/**
 *
 * @author gabri
 */
public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome,double nota1, double nota2, double nota3 ) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio!");

        }
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            throw new IllegalArgumentException("As notas devem estar entre 0 e 10 ! ");
        }
         this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3; 
        
    }    
        
        
        public double calcularMedia(){
            return (nota1 + nota2 + nota3) / 3.0;
        }
        public String getSituacao(){
            double media = calcularMedia();
            if (media >= 6){
                return "Aprovado";
            }
            else if (media >= 5){
                return ("Recuperação");
            }    
            else{
                return "Reprovado";
            }
            
        }
        public String getNome(){
            return nome;
        }
       
      
    
}

