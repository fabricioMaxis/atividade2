/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade2;

/**
 *
 * @author Fabricio
 */
public class Atividade2 {

    public static void main(String[] args) {
        lista lista_aluno = new lista(20);
       
       Aluno a1 = new Aluno("Anderson", "Rua dos Carijós 105", 1, 27);
       Aluno a2 = new Aluno("Bruno", "Avenida Tocantins 200", 2, 23);
       Aluno a3 = new Aluno("Carlos", "Avenida Governador José Malcher 30", 3, 25);
       Aluno a4 = new Aluno("Fabricio", "Rua Cristiano Olsen 45", 4, 26);
       Aluno a5 = new Aluno("Gustavo", "Rua da Imprensa 6", 5, 18);
       Aluno a6 = new Aluno("Matheus", "Rua Serra de Bragança 78", 6, 36);
       Aluno a7 = new Aluno("Nanci", "Rua Barão de Vitória 59", 7, 22);
       Aluno a8 = new Aluno("Otavio", "Avenida Afonso Pena 655", 7, 18);
       Aluno a9 = new Aluno("Paulo", " Rua Domingos Olímpio 13", 8, 23);
       Aluno a10 = new Aluno("Queiroz", "Rua Paracatu 56", 10, 26);
       Aluno a11 = new Aluno("Rafael", "Avenida Governador José Malcher 98", 11, 20);
       Aluno a12 = new Aluno("Julio", "Rua Carlos Augusto Cornelsen 63", 12, 21);
       Aluno a13 = new Aluno("Fernando", "Praça da República 8", 13, 27);
       Aluno a14 = new Aluno("Sunner", "Rua Serra de Bragança 25", 14, 30);
       Aluno a15 = new Aluno("Douglas", "Rodovia Raposo Tavares 856", 15, 19);
       Aluno a16 = new Aluno("Davi", "Avenida São João 455", 16, 24);
       Aluno a17 = new Aluno("Ricardo", "Rua das Fiandeiras 632", 17, 23);
       Aluno a18 = new Aluno("Hugo", "Rua Domingos Olímpio 159", 18, 29);
       Aluno a19 = new Aluno("Edna", " Avenida Almirante Maximiano Fonseca 365", 19, 27);
       Aluno a20 = new Aluno("Maria", "Rua Tenente-Coronel Cardoso 74", 20, 26);
       
       lista_aluno.Inserir(a1);
       lista_aluno.Inserir(a2);
       lista_aluno.Inserir(a3);
       lista_aluno.Inserir(a4);
       lista_aluno.Inserir(a5);
       lista_aluno.Inserir(a6);
       lista_aluno.Inserir(a7);
       lista_aluno.Inserir(a8);
       lista_aluno.Inserir(a9);
       lista_aluno.Inserir(a10);
       lista_aluno.Inserir(a11);
       lista_aluno.Inserir(a12);
       lista_aluno.Inserir(a13);
       lista_aluno.Inserir(a14);
       lista_aluno.Inserir(a15);
       lista_aluno.Inserir(a16);
       lista_aluno.Inserir(a17);
       lista_aluno.Inserir(a18);
       lista_aluno.Inserir(a19);
       lista_aluno.Inserir(a20);
       
       
       
       //lista_produto.remover("Alface");
       lista_aluno.imprimir();
    }
}
