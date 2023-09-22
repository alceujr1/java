package atividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Boolean opcao = true;
		Fila fila = new Fila();
		while (opcao) {

			System.out.print("-------------FILA-------------------\n");
			System.out.println("1: ADICIONAR ITEM NO FINAL DA FILA.");
			System.out.println("2: REMOVER O 1 ITEM DA FILA.");
			System.out.println("3: MOSTRAR A LISTA");
			System.out.println("4: SAIR: \n");
			int comando = input.nextInt();

			switch (comando) {
			case 1:

				System.out.print("Nome: ");
				String novoNome = input.next();
				System.out.print("Codigo: ");
				int novoCodigo = input.nextInt();
				input.nextLine();
				fila.botarFila(novoNome, novoCodigo);
				break;

			case 2:
				fila.tirarFila();
				break;
			case 3:
				fila.exibirFila();
				break;
			case 4:
				opcao = false;
				System.out.println("Adeus");
				break;
			default:
				System.out.println("Item inválido.");
			}

		}
		input.close();
	}

}
