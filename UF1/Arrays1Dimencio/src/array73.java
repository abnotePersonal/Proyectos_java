public class array73 {

	public static void main(String[] args) {
		/*Escriure un algoritme que permeti calcular el quadrat dels 100 primer n�meros enters i a
		continuaci� els vagi guardant en una taula.*/
		double []numero;
		numero=new double[100];
		for (int cont=0;cont<=99;cont++) {
			numero[cont]=cont*cont;
			System.out.println(cont+"^2 ="+numero[cont]);
		}
	}

}
