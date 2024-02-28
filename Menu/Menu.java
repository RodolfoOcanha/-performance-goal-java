package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import Controller.ProdutoController;
import Menu.model.Celular;


public class Menu {

    public static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        ProdutoController produtos = new ProdutoController();
        int opcao, id;
        String nomeProduto;
        float valor;

        while (true) {

            System.out.println(CoresMenu.TEXT_BLACK_BOLD + CoresMenu.ANSI_GREEN_BACKGROUND
                    + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("    SISTEMA DA FUTURE COMERCIO DE ELETRONICOS        ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar o produto                  ");
            System.out.println("            2 - Visualizar Lista de produtos         ");
            System.out.println("            3 - Atualizar                            ");
            System.out.println("            4 - Deletar Produto                      ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     " + CoresMenu.TEXT_RESET);

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros!");
                leia.nextLine();
                opcao = 0;
            }

            if (opcao == 0) {
                System.out.println("\nObrigado por utilizar nosso sistema!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
   

            case 1:
            	System.out.println(CoresMenu.TEXT_WHITE_BOLD +"Digite o nome do produto:");
                nomeProduto = leia.next();
                leia.nextLine(); 

                System.out.println(CoresMenu.TEXT_WHITE_BOLD + "\nDigite o id para cadastro: ");
                id = leia.nextInt();

                System.out.println(CoresMenu.TEXT_WHITE_BOLD + "\nDigite o valor do produto (R$): ");
                valor = leia.nextFloat();


                produtos.cadastrar(new Celular(id, nomeProduto, valor , 1 )); 
                break;


                case 2:
                    System.out.println(CoresMenu.TEXT_WHITE_BOLD +"Lista de produtos cadastrados:");
                    produtos.listarTodos();
                    break;
                case 3:
                    System.out.println(CoresMenu.TEXT_WHITE_BOLD + "Digite o ID do produto que deseja atualizar no sistema:");
                    id = leia.nextInt();
                    
                    break;
                case 4:
                    System.out.println(CoresMenu.TEXT_WHITE_BOLD +"Digite o ID do produto que deseja deletar:");
                    id = leia.nextInt();
    				
    				produtos.deletar(id);
                   
                    break;
                case 0:
                    System.out.println(CoresMenu.TEXT_WHITE_BOLD +"Obrigado por usar nosso sistema, até breve!");
                    break;
                default:
                    System.out.println(CoresMenu.TEXT_WHITE_BOLD +"Opção inválida. Digite uma das opções.");
            }
        }
    }
}
