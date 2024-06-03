/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogadoroo;

import controllers.JogadorController;
import models.Jogador;
import resources.Entrada;

/**
 *
 * @author ferag
 */
public class JogadorOO {
    
    public static void main(String[] args) {
        
        JogadorController jController = new JogadorController();
        
        int opcao = 0;
        while (opcao != 9){
            opcao = Entrada.leiaInt(""
                    + "[1] Criar Jogador\n"
                    + "[2] Listar Jogadores\n"
                    + "[3] Recuperar um Jogador\n"
                    + "[4] Apagar um Jogador\n"
                    + "[5] Editar um Jogador\n"
                    + "[6] Criar um Time\n"
                    + "[7] Listar times\n"
                    + "[8] Adicionar Jogador ao time\n"
                    + "[9] Sair");
        }
        
        switch (opcao) {
            case 1: {
                /////
            }
            case 2: {
                ////
            }
            case 3: {
                ////
            }
            case 4: {
                ////
            }
            case 5: {
                ////
            }
            case 6: {
                ////
            }
            case 7: {
                ////
            }
            case 8: {
                ////
            }
            
        }
        
        
    }
    
}
