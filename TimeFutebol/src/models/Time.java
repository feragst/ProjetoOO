/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

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

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public int getQtdTitulos() {
        return qtdTitulos;
    }

    public void setQtdTitulos(int qtdTitulos) {
        this.qtdTitulos = qtdTitulos;
    }

    public int getDivisao() {
        return divisao;
    }

    public void setDivisao(int divisao) {
        this.divisao = divisao;
    }
    private int id;
    private String nome;
    private int anoFundacao;
    private int qtdTitulos;
    private int divisao;
    
    public Time (int id, String nome, int anoFundacao,  int qtdTitulos, int divisao){
        this.id = id;
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.qtdTitulos = qtdTitulos;
        this.divisao = divisao;
    }
     public Time (String nome, int anoFundacao,  int qtdTitulos, int divisao){
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.qtdTitulos = qtdTitulos;
        this.divisao = divisao;
    }
       public void printAttributes() {
        System.out.println("ID: " + id);
        System.out.println("Nome do time: " + nome);
        System.out.println("Ano de fundacao: " + anoFundacao);
        System.out.println("Quantidade de titulos: " + qtdTitulos);
        System.out.println("Divisao: " + divisao);
       }
    
    
}
