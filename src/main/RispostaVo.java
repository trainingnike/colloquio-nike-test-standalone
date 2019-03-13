package main;

public class RispostaVo {

	private int id;
	private String descr;
	private boolean rispCorretta;
	
	public RispostaVo() {
		
	}

	public RispostaVo(int id, String descr, boolean rispCorretta) {
		super();
		this.id = id;
		this.descr = descr;
		this.rispCorretta = rispCorretta;
	}

	public int getId() {
		return id;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public boolean isRispCorretta() {
		return rispCorretta;
	}

	public void setRispCorretta(boolean rispCorretta) {
		this.rispCorretta = rispCorretta;
	}

	@Override
	public String toString() {
		return "Risposta [id=" + id + ", descr=" + descr + "]";
	}
	
	public String toStringUtente() {
		return "Risposta [id=" + id + ", descr=" + descr +"]";
	}
		
}
