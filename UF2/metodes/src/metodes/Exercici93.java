package metodes;

import java.util.Scanner;

public class Exercici93 {
	public static void main(String[] args) {
		Exercici93 p=new Exercici93();
		p.principal();
	}
	public void principal() {
		Scanner valor=new Scanner(System.in);
		String paraula=" ";
		int [] numlletra=new int [5];
		do {	
		paraula=llegirString(valor);
		char [] numlletres=new char[paraula.length()];
		System.out.println("Les lletres que hi han son :");
		for (int cont=0;cont<paraula.length();cont++) {
		numlletres[cont]=lletresDiferents(paraula,cont);	
		}
		System.out.println(numlletres[0]);
			//numlletra[cont]=comptarLletra(paraula,cont);
		//System.out.println("En la palabra "+paraula+" hay "+numlletra[cont]+" ");
		
		
		
		}while (continuar(valor));
		System.out.println("Fin del programa");
	}
	public String llegirString(Scanner valor) {
		System.out.println("Introduce una palabra");
		String paraula=valor.next();
		
		return paraula;
	}
	public char lletresDiferents(String paraula,int cont2) {
		 char lletra=paraula.charAt(cont2);
			
		return lletra;
	}
	public boolean continuar(Scanner valor) {
		boolean continuar=false;
		String con;
		System.out.println("�Quieres continuar?");
		con=valor.next();
		if (con.charAt(0)=='S' || con.charAt(0)=='s' ) {
			continuar=true;
		}
		return continuar;
	}
	public int comptarLletra(String paraula,int cont) {
		int numvocals=0;
		for (int i=0;i<paraula.length();i++) {
			/*	if (paraula.charAt(i)==lletra[cont]) {
					numvocals++;
				}*/
		}
		return numvocals;
	}
}