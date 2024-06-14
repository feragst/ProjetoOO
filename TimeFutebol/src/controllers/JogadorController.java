/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.util.ArrayList;
import models.Jogador;
import resources.Entrada;
/**
 *
 * @author ferag
 */
public class JogadorController {
    
    ArrayList<Jogador> bauJogadores = new ArrayList();
    int serial = 1;

    public void save(Jogador j) {
        j.setId(serial);
        bauJogadores.add(j);
        serial += 1;
    }
    
    public void print() {
        System.out.println("#### Imprimindo jogador ####");
        for (int i = 0; i < bauJogadores.size(); i++) {
            bauJogadores.get(i).printAttributes();
        }
        System.out.println("#### Finalizando impressao ####");
    }

    public Jogador readOne(int id) {
        for (int i = 0; i < bauJogadores.size(); i++) {
            Jogador j = bauJogadores.get(i);
            if (j.getId() == id) {
                return j;
            }
        }
        return null;
    }
    public void delete(Jogador j) {
        bauJogadores.remove(j);
    }

    public void edit(Jogador j) {
        j.setNome(Entrada.leiaString("Informe o nome do Jogador"));
        j.setNrCamisa(Entrada.leiaInt("Informe a camisa do jogador"));
        j.setIdade(Entrada.leiaInt("Informe a idade do jogador"));
        j.setPosicao(Entrada.leiaString("Informe a posicao onde o jogador"));
      
    }

    public void sizeArray() {
        System.out.println(bauJogadores.size());
    }
}
