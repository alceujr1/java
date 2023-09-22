public class Itemfila {
	private String nome;
	private int codigo;
	Itemfila proximo;

	public Itemfila(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.proximo = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
public class Fila {
	Itemfila inicio;
	Itemfila fim;

	public Fila() {
		super();
		this.inicio = null;
		this.fim = null;
	}

	public void botarFila(String novoNome, int novoCodigo) {
		Itemfila novoItem = new Itemfila(novoNome, novoCodigo);
		if (inicio == null) {
			inicio = novoItem;
			fim = novoItem;
		} else {
			fim.proximo = novoItem;
			fim = novoItem;
		}
		System.out.println("Item adicionado à fila com sucesso.");

	}
	public void tirarFila() {
        if (inicio == null) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Item removido da fila: Nome: " + inicio.getNome() + ", Código: " + inicio.getCodigo());
            inicio = inicio.proximo;
        }
    }
	
	public void exibirFila() {
        if (inicio == null) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Itens na fila:");
            Itemfila atual = inicio;
            while (atual != null) {
                System.out.println("Nome: " + atual.getNome() + ", Código: " + atual.getCodigo());
                atual = atual.proximo;
            }
        }
    }
}

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


