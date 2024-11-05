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
		return 0;
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
		return nesteLedige < innleggstabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}