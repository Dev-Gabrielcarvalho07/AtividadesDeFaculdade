/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade.poo;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main (String[]args){
        Produto produto = new Produto("limpol",22 );
        produto.exibirInfo();
        produto.setPreco(3.55);
        System.out.println("Preco do produto:"+ produto.getPreco());
    }
    
    
}
