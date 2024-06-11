/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
/**
 *
 * @author ferag
 */
public class Time {

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


    private int id;
    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList();
    
  
    
    public Time (int id, String nome, ArrayList<Jogador> jogadores){
        this.id = id;
        this.nome = nome;
        this.jogadores = jogadores;

    }
     public Time (String nome, ArrayList<Jogador> jogadores){
        this.nome = nome;

    }
     public  Time(){
         
     }
     
     public ArrayList<Jogador> getJogadores(){
         return jogadores;
     }
     
     public void setJogadores (ArrayList<Jogador> jogadores){
         
     }
     
       public void addJogador(Jogador j) {
        this.jogadores.add(j);
    }
       public void printAttributes() {
        System.out.println("ID: " + id);
        System.out.println("Nome do time: " + nome);
        System.out.println("Jogadores: " + jogadores.size());
        System.out.println("##");
        for (int i = 0; i < this.jogadores.size(); i++) {
            Jogador j = jogadores.get(i);
            j.printAttributes();
        }
        System.out.println("##");
  
       }
    
    
}
