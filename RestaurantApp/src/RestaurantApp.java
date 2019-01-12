import java.util.Scanner;


/**
 *
 * @author 4ng3l0
 */
public class RestaurantApp {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String hrdia, pedidoClienteM, pedidoClienteN;
        int ovos = 0, torradas = 0, cafe = 0, bife = 0, batata = 0, vinho = 0, bolo = 0, error = 0;
        
        System.out.println("Seja bem vindo ao aplicativo de pedido remoto do restaurante, digite \"manha\" para os pratos de café da manhã e \"noite\" para os pratos do jantar.");
        hrdia = ler.next();
        
        switch(hrdia){
            case "manha":
                System.out.println("Café da Manhã");
                System.out.println("1 - Entrada - Ovos");
                System.out.println("2 - Acompanhamento - Torradas");
                System.out.println("3 - Bebida - Café");
                pedidoClienteM = ler.next();
                
             char[] pedidoM = pedidoClienteM.toCharArray();
                for(int r = 0; pedidoM.length > r  ; r++){
                    switch (pedidoM[r]) {
                        case '1':
                                ovos++;
                            break;
                        case '2':
                                torradas++;
                            break;
                        case '3':
                                cafe++;
                            break;
                         default:
                                error++;
                            break;
                         }
                }
                if (ovos > 1) {
                    System.out.println("Só pode uma porção de ovos por pedido.");
                    ovos = 1;
                }
                if (torradas > 1) {
                    System.out.println("Só pode uma porção de torradas por pedido.");
                }
                if (error > 0){
                    System.out.println("Pedido:");
                    System.out.println("Ovos:"+ovos);
                    System.out.println("Torradas:"+torradas);
                    System.out.println("Café:"+cafe);
                    System.out.println("Error:"+error);
                }
                else {
                    System.out.println("Pedido:");
                    System.out.println("Ovos:"+ovos);
                    System.out.println("Torradas:"+torradas);
                    System.out.println("Café:"+cafe);
                }
            case "noite":
                System.out.println("Café da Manhã");
                System.out.println("1 - Entrada - Bife");
                System.out.println("2 - Acompanhamento - Batata");
                System.out.println("3 - Bebida - Vinho");
                System.out.println("4 - Sobremesa - Bolo");
                pedidoClienteN = ler.next();
                
             char[] pedidoN = pedidoClienteN.toCharArray();
                for(int r = 0; pedidoN.length > r ; r++)    {
                    switch (pedidoN[r]) {
                        case '1':
                                bife++;
                            break;
                        case '2':
                                batata++;
                            break;
                        case '3':
                                vinho++;
                            break;
                        case '4':
                                bolo++;
                            break;
                         }
                }
                if (bife > 1) {
                    System.out.println("Só pode uma porção de bife por pedido.");
                    bife = 1;
                }
                if (vinho > 1) {
                    System.out.println("Só pode uma porção de vinho por pedido.");
                    vinho =1;
                }
                if (bolo > 1){
                    System.out.println("Só pode uma porção de bolo por pedido.");
                    bolo = 1;
                }
                else {
                    System.out.println("Pedido:");
                    System.out.println("Bife:"+bife);
                    System.out.println("Batata:"+batata);
                    System.out.println("Vinho:"+vinho);
                    System.out.println("Bolo:"+bolo);
                }
                break;
            default: System.out.println("Opção Inválida");
                break;
                
        }
    }

  
    }


