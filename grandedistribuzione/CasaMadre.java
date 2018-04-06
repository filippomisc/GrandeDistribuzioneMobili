package grandedistribuzione;

public class CasaMadre {

	public CasaMadre(String nome, String indirizzo, String numeroTelefono, String sitoWeb){
	}
	
	public String getNome(){
		return null;
	}

	public String getIndirizzo(){
		return null;
	}

	public String getNumeroTelefono(){
		return null;
	}

	public String getSitoWeb(){
		return null;
	}
	
	public int aggiungiNegozio(String nome, String indirizzo, int numeroArticoliEsponibili){
		return 0;
	}
	
	public String negozio(int codice){
		return "";
	}
	
	public String negozioPiuGrande(){
		return "";
	}
	
	public int aggiungiArticolo(String nome, String descrizione, double prezzo){
		return 0;
	}
	
	public String articolo(int codice){
		return "";
	}
	
	public String articoloPiuEconomico(){
		return "";
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



