package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		contaFinoAX(3);
		System.out.println("Moltiplicazione di 2 e 6 = "+ moltiplicazione(2,6));
		// Scanner myScan = new Scanner(System.in);
		// System.out.print("inserisci il tuo nome: ");
		// String g = myScan.nextLine();
		// System.out.println("ciao "+g+"!");
		System.out.println(Concatena("ciao mondo",2352));
		
		String arr[] = {"primo","secondo","terzo","quarto","quinto"};
		System.out.println(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String arrNuovo[] = addToArrey(arr);
		System.out.println(arrNuovo);
		for(int i = 0;i<arrNuovo.length;i++) {
			System.out.println(arrNuovo[i]);
		}
		
		
				
				
		}

public static String[] addToArrey(String[] a) {
	String arr2[] = new String [a.length+1];
	for(int i = 0;i<arr2.length;i++) {
		if(i == arr2.length-3) {
			arr2[i] = "nuova stringa";
		} else if(i>arr2.length-3) {
			arr2[i] = a[i-1];
		} else {
			arr2[i] = a[i];
		}
	}
	return arr2;
}

public static void contaFinoAX(int x) {
	int i=0;
	while(i<=x) {
		System.out.println(i);
		i++;
	}
	
	
}
public static int moltiplicazione(int a,int b) {
	return a*b;
}
public static String Concatena(String a, int b) {
	return a+b;
	
}
}



