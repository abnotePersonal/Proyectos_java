import java.util.Scanner;
public class numerosintroducidos {

	public static void main(String[] args) {
		//  Pedir n�meros hasta que se teclee uno negativo, y mostrar cu�ntos n�meros se han introducido
		int numero=0,contaador=0;
		Scanner valor=new Scanner(System.in);
		do {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			contaador++;
			
		}while (numero>0);
		System.out.println("Se han introducido "+contaador+" numeros positivos");
	}

}
