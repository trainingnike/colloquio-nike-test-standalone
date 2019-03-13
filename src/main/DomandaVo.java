package main;

import java.util.List;

public class DomandaVo {

	private int id;
	private String descrizione;
	private List<RispostaVo> risposte;
	
	
	public DomandaVo() {
		
	}

	public DomandaVo(int id, String descrizione, List<RispostaVo> risposte) {
		super();
		this.id = id;
		this.descrizione = descrizione;
		this.risposte = risposte;
	}

	public int getId() {
		return id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public List<RispostaVo> getRisposte() {
		return risposte;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setRisposte(List<RispostaVo> risposte) {
		this.risposte = risposte;
	}

	@Override
	public String toString() {
		return "Domanda [id=" + id + ", descrizione=" + descrizione + ", risposte=" + risposte.toString() + "]";
	}
	
	
	
}
