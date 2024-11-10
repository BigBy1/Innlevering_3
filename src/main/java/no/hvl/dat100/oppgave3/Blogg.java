package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggstabell;
	
	int nesteLedige;

	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteLedige = 0;

	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteLedige = 0;
		
	}

	public int getAntall() {
		return nesteLedige;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		boolean fant = false;
		
		for (int i=0;i<nesteLedige&&fant==false;i++) {
			
			if(innleggstabell[i].erLik(innlegg)) {
				fant = true;
				return i;
			}
			else if(i==nesteLedige-1) {
				return -1;
			}
			
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i<nesteLedige; i++) {
			if(innleggstabell[i].erLik(innlegg)) {
				finnes=true;
			}
		}
		
		return finnes;
	}

	public boolean ledigPlass() {
		boolean plass;
		if(nesteLedige>=innleggstabell.length) {
			plass = false;
		}
		else {
			plass = true;
		}
		return plass;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass()&&!finnes(innlegg)) {
			innleggstabell[nesteLedige] = innlegg;
			nesteLedige=nesteLedige+1;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String str="";
		String tekst;
		for (int i=0; i<innleggstabell.length;i++) {
			if (innleggstabell[i] != null) {
			tekst = innleggstabell[i].toString();
			str=str+tekst;
			}
		}
		str = nesteLedige+"\n"+str;
		return str;
	}
}

	// valgfrie oppgaver nedenfor
	
//	public void utvid() {
//		throw new UnsupportedOperationException(TODO.method());
//	}
//	
//	public boolean leggTilUtvid(Innlegg innlegg) {
//
//		throw new UnsupportedOperationException(TODO.method());
//		
//	}
//	
//	public boolean slett(Innlegg innlegg) {
//		
//		throw new UnsupportedOperationException(TODO.method());
//	}
//	
//	public int[] search(String keyword) {
//		
//		throw new UnsupportedOperationException(TODO.method());
//
//	}
//}