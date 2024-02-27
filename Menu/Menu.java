package Menu;

import java.util.Scanner;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
	   int opcao;
		
		do{
		
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
		
		opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o id do produto para cadastro:");
                break;
            case 2:
                System.out.println("Lista de produtos:");
                break;
            case 3:
                System.out.println("Digite o código do produto que deseja atualizar no sistema:");
                break;
            case 4:
                System.out.println("Digite o ID do produto que deseja deletar:");
                break;
            case 0:
                System.out.println("Obrigado por visitar o site, até breve!");
                break;
            default:
                System.out.println("Opção inválida. Digite uma das opções.");
        }
		} while (opcao != 0);
		
	}
}

		