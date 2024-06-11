/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogadoroo;

import controllers.JogadorController;
import models.Jogador;
import resources.Entrada;
import controllers.TimeController;
import models.Time;


/**
 *
 * @author ferag
 */
public class JogadorOO {
    
    public static void main(String[] args) {
        
        JogadorController jController = new JogadorController();
        TimeController tController = new TimeController();
        
        
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
                Jogador j = new Jogador();

                j.setNome(Entrada.leiaString("Informe o nome do jogador"));
                j.setNrCamisa(Entrada.leiaInt("Informe o número da camisa do jogador"));
                j.setIdade(Entrada.leiaInt("Informe a idade do jogador"));
                j.setPosicao(Entrada.leiaString("Informe a posicao do jogador"));
               

                jController.save(j);
            }
            case 2: {
                jController.print();
            }
            case 3: {
                Jogador j = jController.readOne(Entrada.leiaInt("Digite o código (ID) do jogador"));
                if (j != null) {
                    j.printAttributes();
                } else {
                    System.out.println("Boneco não encontrado");
                }
            }
            case 4: {
                 Jogador j = jController.readOne(Entrada.leiaInt("Digite o código (ID) do jogador"));
                if (j != null) {
                    jController.delete(j);
                } else {
                    System.out.println("Jogador não encontrado");
                }
            }
            case 5: {
                Jogador j = jController.readOne(Entrada.leiaInt("Digite o código (ID) do jogador"));
                if (j != null) {
                    jController.edit(j);
                } else {
                    System.out.println("Jogador não encontrado");
                }
            }
            case 6: {
                Time t = new Time();
                t.setNome(Entrada.leiaString("Informe o Nome do time"));
                tController.save(t);
            }
            case 7: {
                tController.print();
            }
            case 8: {
                tController.print();
                Time t = tController.readOne(Entrada.leiaInt("Digite o código (id) do time que deseja adicionar o jogador"));

                if (t != null) {

                    char continuar = 's';
                    while (continuar == 's')
                    {

                        jController.print();
                        Jogador j = jController.readOne(Entrada.leiaInt("Digite o código (id) do jogador que deseja adicionar"));

                        if (j != null) {
                            j.addJogador(j);
                        } else {
                            System.out.println("Jogador não encontrado");
                        }

                        continuar = Entrada.leiaChar("Deseja adicionar mais um boneco? [s / n]");
                    }
                } else {
                    System.out.println("Loja não encontrada");
                }
            }
            
        }
        
        
    }
    
}
