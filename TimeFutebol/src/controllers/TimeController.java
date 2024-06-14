/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Time;
import controllers.JogadorController;
import models.Jogador;
import resources.Entrada;

/**
 *
 * @author ferag
 */
public class TimeController {
    
    
    
    ArrayList<Time> times = new ArrayList();
    int serial = 1;

    public void save(Time t) {
        t.setId(serial);
        times.add(t);
        serial += 1;
    }

    public void print() {
        System.out.println("## Imprimindo Times ##");
        for (int i = 0; i < times.size(); i++) {
            times.get(i).printAttributes();
        }
        System.out.println("## Finalizando impressão ##");
    }
    
    public Time readOne(int id) {
        for (int i = 0; i < times.size(); i++) {
            Time t = times.get(i);
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public void delete(int timeId, int jogadorId) {
        
         Time t = readOne(timeId);
        if (t != null) {
            t.removeJogador(jogadorId);
        } else {
            System.out.println("Time não encontrado");
        }
         
    }

    public void edit(Time t) {
        t.setNome(Entrada.leiaString("Edite o nome do Time"));
        
        
    }
    
}
