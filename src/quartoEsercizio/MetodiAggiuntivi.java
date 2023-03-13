package quartoEsercizio;

import java.util.Scanner;

public class MetodiAggiuntivi {
public static void main(String[] args) {
	System.out.println("ciao");
	System.out.println("perimentro: "+ perimentro(10.5,12.45));
	System.out.println("il numero 5 è pari? "+ pariDispari(5));
	System.out.println("il numero 10 è pari? "+ pariDispari(10));
	System.out.println(Math.sqrt(25));
	System.out.println(areaTriangolo(15,20,25));
	
 Scanner myScan = new Scanner(System.in);
System.out.println("inserici i lati del rettangolo per riceverne il perimentro");
double a = myScan.nextDouble();
double b = myScan.nextDouble();
System.out.println("il perimentro del rettangolo con lati "+ a +" e "+ b + " é "+ perimentro(a,b));
System.out.println("Ora inserisci un numero per sapere se è pari p dispari: ");
int num = myScan.nextInt();
boolean res = pariDispari(num);
System.out.println("Ora Calcoliano l'area di un triangolo conoscendo i lati.. inserisci tre lati: ");
float x = myScan.nextFloat();
float y = myScan.nextFloat();
float z = myScan.nextFloat();
System.out.println("l'area trovata è "+areaTriangolo(x,y,z));

 
	
}

public static double perimentro(double latoA,double latoB) {
	return (latoA+latoB)*2;
}
public static boolean pariDispari(int a) {
	if(a % 2 == 0) {
		System.out.println(a+" è pari");
		return true;
	} else {
		System.out.println(a+" è dispari");
		return false;
	}
	
}
public static float areaTriangolo(float a,float b,float c) {
	if(a+b>c && a+c>b && c+b>a) {
	float p = (a +b +c) /2;
	System.out.println("p: "+ p);
	float area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
	
	System.out.println("area: "+area);
	return area;
	}else {
		System.out.println("non è un triangolo ");
		return 404;
	}
}

}
