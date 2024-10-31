package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	int id;
	String bruker;
	int likes;
	String dato;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}
	public void setId(int id) {
		
		this.id = id;
	
	}
	public int getId() {
		return id;

	}

	public int getLikes() {
		
		return likes;

	}
	
	public void doLike () {
			likes = likes+1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		boolean erlik;
		
		int id_1 = this.getId();
		
		int id_2 = innlegg.getId();
		
		if (id_1==id_2) {
			erlik = true;
		}
		else {
			erlik=false;
		}
		return erlik;

	}
	
	@Override
	public String toString() {
		
		String str = id+"\n"+bruker+"\n"+dato+"\n"+likes+"\n";
		System.out.print(str);
		return str;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
