package grandedistribuzione;

import java.util.*;

public class CasaMadre {
	
//	private int c;
	private String n;
	private String i;
	private String nt;
	private String www;
	
	private List<Negozio> negs;
	
	private List<Articolo> arts;

	public CasaMadre(String nome, String indirizzo, String numeroTelefono, String sitoWeb){
		this.n=nome;
		this.i=indirizzo;
		this.nt=numeroTelefono;
		this.www=sitoWeb;
		
		negs = new ArrayList<>(20);
//		this.c = ;
		
		arts = new ArrayList<>(1000);
	}
	
	public String getNome(){
		return this.n;
	}

	public String getIndirizzo(){
		return this.i;
	}

	public String getNumeroTelefono(){
		return this.nt;
	}

	public String getSitoWeb(){
		return this.www;
	}
	
	public int aggiungiNegozio(String nome, String indirizzo, int numeroArticoliEsponibili){
		int cod = 0;
		Negozio ng = new Negozio(cod , nome, indirizzo, numeroArticoliEsponibili);
		if(negs.size()<20) //{
			negs.add(ng);
			cod = negs.indexOf(ng)+1;//l'indice inizia da zero, dunque incremetiamolo di uno
			return cod;
//		}else
//			return 0;

	}
	
	public String negozio(int codice){
//		if(){...
		String negozioDaStampare = negs.get(codice-1).toString();
		return negozioDaStampare;
//		}else return "";
		}
	
	public String negozioPiuGrande(){
		Negozio ntemp = null;
		int maxn = Integer.MIN_VALUE;
		for(Negozio n : this.negs) {
			if(n.getNmax() > maxn) {
				maxn = n.getNmax();
				ntemp = n;
				}
		}
		return ntemp.toString();
	}
			
	public int aggiungiArticolo(String nome, String descrizione, double prezzo){
		int cod = 0;
		Articolo art = new Articolo(cod, nome, descrizione, prezzo);
		if(arts.size()<1000) //{
			arts.add(art);
			cod = arts.indexOf(art)+1000;//l'indice inizia da zero, dunque incremetiamolo di uno
			return cod;
//		}else
//			return 0;
	}
	
	//fatto copiando-incollando
	public String articolo(int codice){
//		if(){...
		String articoloDaStampare = arts.get(codice-1000).toString();
		return articoloDaStampare;
//		}else return "";
	}
	
	//fatto copiando-incollando
	public String articoloPiuEconomico(){
		Articolo atemp = null;
		double mina = Integer.MAX_VALUE;
		for(Articolo a : this.arts) {
			if(a.getP() > mina) {
				mina = a.getP();
				atemp = a;
				}
		}
		return atemp.toString();	
	}

	public void esponiArticoloInNegozio(int codiceNegozio, int codiceArticolo){
	}
	
	public String elencoNegozi(int codiceArticolo){
		return "";
	}

	public String elencoArticoli(int codiceNegozio){
		return "";
	}

	public int numeroNegozi(int codiceArticolo){
		return 0;
	}

	public int numeroArticoli(int codiceNegozio){
		return 0;
	}

	public String elencoNegoziCheEspongonoPiuDiTotArticoli(int numArticoli){
		return "";
	}

	public String elencoArticoliEspostiInPiuDiTotNegozi(int numNegozi){
		return "";
	}

}



