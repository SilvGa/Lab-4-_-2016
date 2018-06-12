package it.polito.tdp.anagrammi.parole;

import java.util.ArrayList;
import java.util.List;

public class Parole {
	
	private List<String> permuta = null;
	
	public List<String> inizio(String s) {
		s=s.toLowerCase().trim().replaceAll(" ","");
		permuta = new ArrayList<String>();
		permutazioni(s,0);
		return permuta;
	}
	
	public void permutazioni(String parola, int indice) {
		int i=parola.length();
		
		if(indice==i) {
			permuta.add(parola);
			return;
		}
		
		for(int j=indice; j<i; j++) {
			char[]c= parola.toCharArray();
			char temp = c[indice];
			c[indice]=c[j];
			c[j]=temp;
			permutazioni(String.valueOf(c),indice+1);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb =  new  StringBuilder ();
		for(String s:permuta) {
			sb.append(s);
			sb.append("\n");
		}
		return "\n"+sb;
	}
	
	

}
