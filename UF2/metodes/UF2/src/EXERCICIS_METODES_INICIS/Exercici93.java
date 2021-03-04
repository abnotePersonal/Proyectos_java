package EXERCICIS_METODES_INICIS;

import java.util.Scanner;

public class Exercici93 {
	public static void main(String[] args) {
		Exercici93 p=new Exercici93();
		p.principal();
	}
	public void principal() {
		Scanner valor=new Scanner(System.in);
		String paraula=" ";
		do {	
		paraula=llegirString(valor);
		int [] numlletra=new int [paraula.length()];
		char [] numlletres=new char[paraula.length()];
		//Omplenar taula de valors
		for (int cont=0;cont<paraula.length();cont++) {
		numlletres[cont]=lletresDiferents(paraula,cont);	
		}
		imprimir(paraula,numlletra,numlletres);
		}while (continuar(valor));
		System.out.println("Fin del programa");
	}

	public void imprimir(String paraula,int[] numlletra,char[] numlletres) {
		System.out.println("Les lletres que hi han son :");
		for (int cont=0;cont<paraula.length();cont++) {
			numlletra[cont]=comptarLletra(paraula,numlletres,cont);
			if (numlletres[cont]!=' ') {
				System.out.println(numlletres[cont] +" es repeteix "+numlletra[cont]+" vegades");
				}
			}		
	}
	public String llegirString(Scanner valor) {
		System.out.println("Introduce una palabra");
		String paraula=valor.next();
		return paraula;
	}
	
	public char lletresDiferents(String paraula,int cont) {
		char lletra=' ';
		boolean entrat=false;
			for (int cont2=0;cont2<cont;cont2++) {
				if (paraula.charAt(cont2)==paraula.charAt(cont) && cont2!=cont) {
					entrat=true;
				}
			
		}
			if (!entrat) {
				lletra=paraula.charAt(cont);
			}
		return lletra;
	}
	public boolean continuar(Scanner valor) {
		boolean continuar=false;
		String con;
		System.out.println("¿Quieres continuar?");
		con=valor.next();
		if (con.charAt(0)=='S' || con.charAt(0)=='s' ) {
			continuar=true;
		}
		return continuar;
	}
	public int comptarLletra(String paraula,char []numlletres,int cont) {
		int numvocals=0;
		for (int i=0;i<paraula.length();i++) {
			if (paraula.charAt(i)==numlletres[cont]) {
				numvocals++;
			}
			
		}
		return numvocals;
	}
}
