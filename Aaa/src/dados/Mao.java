package dados;

import java.util.List;

public class Mao {
	
	private List<Carta> p;
	private int pontos;
	
	public Mao() {
		p = new ArrayList<Carta>();
	}
	
	public List<Carta> getP() {
		return p;
	}
	public void setP(List<Carta> p) {
		this.p = p;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void receber(Deck x) {
		p.add(x.getArray().get(0));
		x.getArray().remove(0);
		contarPontos();
	}
	
	private void contarPontos() {
		for (Carta carta : p) {
			pontos =+ carta.getValor();
		}
	}
	
	
	
}
