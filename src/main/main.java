package main;

import java.util.ArrayList;
import java.util.List;

public class main {
	
	public static void main(String[] args) {

		List<RispostaVo> risposte = new ArrayList<RispostaVo>();
		RispostaVo r1 = new RispostaVo(1,"Bianco",true);
		risposte.add(r1);
		RispostaVo r2 = new RispostaVo(2,"Nero", false);
		risposte.add(r2);
		
		List<RispostaVo> risposte1 = new ArrayList<RispostaVo>();
		RispostaVo r3 = new RispostaVo(1,"Diavola",false);
		risposte1.add(r3);
		RispostaVo r4 = new RispostaVo(2,"Capricciosa",true);
		risposte1.add(r4);
		RispostaVo r5 = new RispostaVo(3,"Margherita",false);
		risposte1.add(r5);
		
		List<DomandaVo> domande = new ArrayList<DomandaVo>();
		DomandaVo d1 = new DomandaVo(0,"Cavallo Bianco di Napoleone?", risposte);
		domande.add(d1);
		DomandaVo d2 = new DomandaVo(1,"Gusto di pizza?", risposte1);
		domande.add(d2);
		System.out.println(domande.toString()+"\n");
	}


}
