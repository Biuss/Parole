package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parola {
	
	private List<String> parole = new ArrayList<>();
	Scanner sc = new Scanner (System.in);

	
	public void RiempiLista() {
		String parola;
		
		System.out.println("inserisci la parola");
		parola=sc.nextLine();
		sc.nextLine();
		
		
		Collections.sort(parole);
		
		for(int i=0; i<parole.size();i++) {
			
			parole.add(parola);
			
			
		}
		
		
		
		
	}


	@Override
	public String toString() {
		return "Parola [parole=" + parole + "]";
	}
	
	
	
	
	
	
	

}
