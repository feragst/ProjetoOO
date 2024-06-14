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
                    + "[3] Apagar um Jogador\n"
                    + "[4] Editar um Jogador\n"
                    + "[5] Criar um Time\n"
                    + "[6] Listar times\n"
                    + "[7] Adicionar Jogador ao time\n"
                    + "[8] Apagar um Jogador do time \n"
                    + "[9] Sair");
        
        
                    switch (opcao) {
                case 1: {
                    Jogador j = new Jogador();
                    j.setNome(Entrada.leiaString("Informe o nome do jogador"));
                    j.setNrCamisa(Entrada.leiaInt("Informe o numero da camisa do jogador"));
                    j.setIdade(Entrada.leiaInt("Informe a idade do jogador"));
                    j.setPosicao(Entrada.leiaString("Informe a posição do jogador"));
                    jController.save(j);
                    break;
                }
                case 2: {
                    jController.print();
                    break;
                }
               
                case 3: {
                    Jogador j = jController.readOne(Entrada.leiaInt("Digite o código (ID) do jogador"));
                    if (j != null) {
                        jController.delete(j);
                    } else {
                        System.out.println("Jogador não encontrado");
                    }
                    break;
                }
                case 4: {
                    Jogador j = jController.readOne(Entrada.leiaInt("Digite o código (ID) do jogador"));
                    if (j != null) {
                        jController.edit(j);
                    } else {
                        System.out.println("Jogador não encontrado");
                    }
                    break;
                }
                case 5: {
                    Time t = new Time();
                    t.setNome(Entrada.leiaString("Informe o Nome do time"));
                    tController.save(t);
                    break;
                }
                case 6: {
                    tController.print();
                    break;
                }
                case 7: {
                    tController.print();
                    Time t = tController.readOne(Entrada.leiaInt("Digite o código (ID) do time que deseja adicionar o jogador"));

                    if (t != null) {
                        char continuar = 's';
                        while (continuar == 's') {
                            jController.print();
                            Jogador j = jController.readOne(Entrada.leiaInt("Digite o código (ID) do jogador que deseja adicionar"));
                            if (j != null) {
                                t.addJogador(j); // Supondo que `addJogador` seja um método da classe `Time`
                            } else {
                                System.out.println("Jogador não encontrado");
                            }
                            continuar = Entrada.leiaChar("Deseja adicionar mais um jogador? [s / n]");
                        }
                    } else {
                        System.out.println("Time não encontrado");
                    }
                    break;
                }
                case 8: {
                    tController.print();
                    int timeId = Entrada.leiaInt("Digite o código (ID) do time");
                    int jogadorId = Entrada.leiaInt("Digite o código (ID) do jogador a ser removido");
                    tController.delete(timeId, jogadorId);
                    break;
                }
                case 9: {
                    System.out.println("Saindo...");
                    break;
                }
                default: {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
        }

    }
    
}
