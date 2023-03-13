package inserimentoStringheUtente;

import java.util.Scanner;

public class InserimentoStringheUtenteMain {
	public static void main (String[] args) {
		String prima;
		String seconda;
		String terza;
		Scanner myScan = new Scanner(System.in);
		System.out.println("Inserisci la PRIMA stringa: ");
		prima = myScan.nextLine();
		System.out.println("Inserisci la SECONDA stringa: ");
		seconda =  myScan.nextLine();
		System.out.println("Inserisci la TERZA stringa: ");
		terza=  myScan.nextLine();
		System.out.println("hai scritto in ordine: "+prima +" "+seconda+" "+terza);
		System.out.println("invertito: "+terza+" "+seconda+" "+prima );
		
		
	}

}
