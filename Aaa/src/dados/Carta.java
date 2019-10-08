package dados;

public class Carta {

	private int ordem;
	private int valor;
	private	Naipes naipe;
	
	public Carta(int numero, int valor, Naipes naipe) {
		this.ordem = numero;
		this.valor = valor;
		this.naipe = naipe;
	}

	public int getNumero() {
		return ordem;
	}

	public void setNumero(int numero) {
		this.ordem = numero;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Naipes getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipes naipe) {
		this.naipe = naipe;
	}

	
	@Override
	public String toString() {		
		return " Ordem = " + ordem + ", Valor = " + valor + ", Naipe = " + naipe.getDescri() + "\n";
	}
	
		
}
