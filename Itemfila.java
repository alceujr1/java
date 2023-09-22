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

