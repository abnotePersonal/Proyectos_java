package EXERCICIS_METODES_INICIS;

import java.util.Scanner;

public class Exercici88 {

	public static void main(String[] args) {
		Exercici88 p=new Exercici88();
		p.principal();
	}
	
	public void principal() {
		int [] numeros=new int [250];
		int [] factorials=new int[250];
		int cont=-1,num=0;
		Scanner valor=new Scanner(System.in);
	do {
		cont++;
		num=LlegirEnter(numeros,cont,factorials,valor);
		
	} while(num!=0);
	
	for (int cont2=0;cont2<cont;cont2++ ) {
		System.out.println("El factorial de "+numeros[cont2]+"!= "+factorials[cont2]);
	}
		valor.close();
	}
	
	public int LlegirEnter(int [] numeros,int cont,int []factorials,Scanner valor) {
		System.out.println("Introduce un numero");
		numeros[cont]=valor.nextInt();
		factorial(numeros[cont],cont,factorials);
		return numeros[cont];
	}
	public int factorial (int numeros,int conta,int [] factorials) {
		int facto=numeros;
		if (facto>0) {
		factorials[conta]=1;
		}
		for (int cont=facto;cont>0;cont--) {
			factorials[conta]*=cont;	
		}
		return factorials[conta];
	}
}
