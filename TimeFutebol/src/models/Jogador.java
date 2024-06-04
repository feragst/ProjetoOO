/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ferag
 */
public class Jogador {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrCamisa() {
        return nrCamisa;
    }

    public void setNrCamisa(int nrCamisa) {
        this.nrCamisa = nrCamisa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    private int id;
    private String nome;
    private int nrCamisa;
    private int idade;
    private String posicao;
    
    
     public Jogador(int id, String nome, int nrCamisa,  int idade, String posicao) {
        this.id = id;
        this.nome = nome;
        this.nrCamisa = nrCamisa;
        this.idade = idade;
        this.posicao = posicao;
        
    }
     public Jogador( String nome, int nrCamisa,  int idade, String posicao) {
        this.nome = nome;
        this.nrCamisa = nrCamisa;
        this.idade = idade;
        this.posicao = posicao;
        
    }
     public Jogador (){
         
     }
      public void printAttributes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Numero da camisa: " + nrCamisa);
        System.out.println("Idade: " + idade);
        System.out.println("Posicao: " + posicao);
        
    }
     
    
}
