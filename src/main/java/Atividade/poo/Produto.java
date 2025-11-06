/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade.poo;

/**
 *
 * @author gabri
 */
public class Produto {
    public String nome;
    private double preco;
    protected int quantidade;
    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public void venderProduto(int unidades){
        if(unidades > quantidade){
            System.out.println("ERRO!, unidades vendidas maiores que a quantidade em estoque!");
            
        }
        else{
            unidades = unidades - quantidade;
            
        }
        
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void exibirInfo(){
        System.out.println("Nome do produto: " + nome);
        
        System.out.println("Quantidade em estoque: " + quantidade);
        
        
    }
    
}
