package it.polito.tdp.anagrammi.quadratomagico;

public class QuadratoMagico {
	private StringBuilder sb;
	private String s;
	private int riga[];
	private int num=0;
	
	
	public void inizio(int numero) {
		sb =  new  StringBuilder ();
		costruisci(0,s);
	}
	
	public void costruisci(int sum, String riga) {
		if(sum==15) {
			sb.append(riga);
			sb.append("\n");
			return;
		}
		
		while(sum<15) {
			
			costruisci(sum+1,riga);
		}
	}
}
