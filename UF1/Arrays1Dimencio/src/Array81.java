import java.util.Scanner;
public class Array81 {

	public static void main(String[] args) {
		/*.Introduir un conjunt de N n�meros pel teclat i guardar-los en una taula. Despr�s caldr� calcular
		la mitja i dir quants n�meros son m�s grans que la mitja i quants son m�s petits.*/
		int [] numeros;
		Scanner valor=new Scanner(System.in);
		int llarg,cont=0,grans=0,petits=0;
		double mitjana=0;
		System.out.println("INtroduce la longuitud de la array: ");
		llarg=valor.nextInt();
		numeros=new int[llarg];
		while (cont<llarg) {
			System.out.println("Introduce un numero: ");
			numeros[cont]=valor.nextInt();
			mitjana=mitjana+numeros[cont];
			cont++;
			
		}
		mitjana=mitjana/llarg;
		cont=0;
		while (cont<llarg) {
			if (numeros[cont]>mitjana) {
				grans++;
			}
			else {
				petits++;
			}
			cont++;
		}
		valor.close();
		System.out.println("Hay "+grans+" numeros m�s grandes que "+mitjana);
		System.out.println("Hay "+petits+" numeros m�s peque�os que "+mitjana);

	}

}
