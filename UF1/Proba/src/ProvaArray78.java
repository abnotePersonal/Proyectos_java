import java.io.IOException;
public class ProvaArray78 {

	public static void main(String[] args) throws IOException {
		/* Anar introduint car�cters pel teclat d'una frase finalitzada amb punt. Despr�s caldr� dir quantes
		lletres de tot l'abecedari s'han introdu�t. (a-z)*/
		char [] text;
		int paraula=0, cont=0,repetides=0,lletres=0;
		text=new char[250];
		System.out.println("Escriu un text");
		while (paraula!=46) {
				paraula=System.in.read();
				text[cont]=(char)paraula;
				if (text[cont]!=' ' && text[cont]!='.') {
					lletres++;
				}
				for(int j=0;j<250;j++) {
					if (text[cont]==text[j] && j!=cont && text[cont]!=' ') {
						repetides++;
					}
				}
				cont++;
		}
		System.out.println("El numero de lletres  de l'abecedari introduides es de "+(lletres-repetides));
	}
}
