/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2;
import java.util.Arrays;

/**
 *
 * @author Fabricio
 */
public class lista {
    public int primeiro = 0;
    public int ultimo = 0;
    public int matricula;
    public Aluno[] Lista_Aluno;

    public lista(int maximo) {
        this.primeiro = 0; 
        this.ultimo = this.primeiro;
        Lista_Aluno = new Aluno[maximo];
    }

    public boolean vazia() {
        return (this.primeiro == this.ultimo);
    }

    public void Inserir(Aluno a1) {
        if (this.ultimo >= this.Lista_Aluno.length) {
            System.out.println("Lista Cheia");
        } else {
            this.Lista_Aluno[this.ultimo] = a1;
            this.ultimo = this.ultimo + 1;
        }
    }
    
    public void remover(String nome) {
        for (int i = 0; i < this.Lista_Aluno.length; i++){
            try{
                if(this.Lista_Aluno[i].getNome().equals(nome)){
                    this.Lista_Aluno[i] = null;
                    for (int j = i; j < this.Lista_Aluno.length; j++){
                        try{
                            String nome2 = this.Lista_Aluno[j+1].getNome();
                            this.Lista_Aluno[j] = this.Lista_Aluno[j+1];
                            this.ultimo = j+1;
                        }catch(Exception e){
                            this.Lista_Aluno[j] = null;
                        }
                    }
                }
            }
            catch(Exception e){
                
            }
        }
    }
    
    public String pesquisa(String nome) {
        for (Aluno Lista_Produto1 : this.Lista_Aluno) {
            try {
                if (Lista_Produto1.getNome().equals(nome)) {
                    return Lista_Produto1.getNome() + " -> " + Lista_Produto1.getEndereco() + " -> " + Lista_Produto1.getMatricula() + " -> " + Lista_Produto1.getIdade();
                }
            }catch(Exception e){
            }
        }
        return "Aluno não encontrado";
    }
    
    public void imprimir() {
        for (int i = 0; i < this.Lista_Aluno.length; i++){
            try{
                System.out.println(this.Lista_Aluno[i].getNome() + " -> " + this.Lista_Aluno[i].getEndereco() + " -> " + this.Lista_Aluno[i].getMatricula() + " -> " + this.Lista_Aluno[i].getIdade());
            }catch(Exception e){
                System.out.println("Posição "+ (i + 1) +" da Lista vazia");
            }
        }
    }

    public void limpa_lista(){
        Arrays.fill(Lista_Aluno, null);
    }
    
}
