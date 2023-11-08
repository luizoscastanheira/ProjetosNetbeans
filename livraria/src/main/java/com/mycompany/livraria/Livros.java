/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria;

/**
 *
 * @author luizo
 */
public class Livros {
    //Definindo Atributos
    String nome;
    String autor;
    String dataPub;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //Definido métodos
    void exibirLivro(){
    System.out.println("O nome do autor é: " + autor);
    System.out.println("A data de lançamento é: " + dataPub);
    System.out.println("O nome do Livro é: " + nome);
    System.out.println("O preço do livro é: " + preco);
    
    }
}
