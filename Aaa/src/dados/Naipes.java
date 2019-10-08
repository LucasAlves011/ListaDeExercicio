package dados;

public enum Naipes {
	
	OUROS("Ouros"),COPAS("Copas"),ESPADAS("Espadas"),PAUS("Paus");
	
	private String descri;
	
	Naipes(String descri){
		this.descri = descri;
	}
	
	public String getDescri() {
		return this.descri;
	}
	
}
