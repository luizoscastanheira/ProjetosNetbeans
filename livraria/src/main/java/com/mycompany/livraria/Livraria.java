/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livraria;

/**
 *
 * @author luizo
 */
public class Livraria {

    public static void main(String[] args) {
        System.out.println("Criando Objeto da classe Livros!");
        //instanciar objeto livro 1
        Livros livro1 = new Livros();
        
        //preenchendo os atributos do objeto já criado
        livro1.autor = "Luiz Otário";
        livro1.nome = "Três Rios Terra de Ninguem";
        livro1.dataPub = "10/10/2023";
        // ao transformar a variável em private o acesso direto é encapsulado
        // caso descomente a linha abaixo é possivel ver o erro.
        //livro1.preco = 50.00;
        
        
        //exibindo dados do objeto  sem uso de métodos
        System.out.println("A data de lançamento é: " + livro1.dataPub);
        System.out.println("O nome do Livro é: " + livro1.nome);
        //exibindo dados do objeto com uso de um método
        livro1.exibirLivro();
        //exibindo dados do objeto com uso de getters e setters
        livro1.setPreco(50);
        livro1.getPreco();
        System.out.println(livro1.getPreco());
    }
}
