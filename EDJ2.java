import java.util.Scanner;
public class Funciones2 {

public static void main(String[] args) {

	
	Scanner teclado = new Scanner(System.in);
	int opcion=0;

		
	System.out.println("primer uso de la calculadora potencia, indique el valor de a");
	int a = teclado.nextInt();
	
	exponente(a,4);
	


}

public static int exponente(int base, int exponente) {
	int res =1;
	for(int i =1;i<=exponente;i++) {
	
	res = res*base;
	}
	System.out.println(res);
	return res;
}

}