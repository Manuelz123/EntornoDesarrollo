import java.util.Scanner;
public class Funciones2 {
/*	
*@author Victor Manuel Rivero Leon 1 dam
*@version 1.0
*/
public static void main(String[] args) {

	
	Scanner teclado = new Scanner(System.in);
	int opcion=0;
	do {
		
	System.out.println("primer uso de la calculadora potencia, indique el valor de a");
	int a = teclado.nextInt();
	System.out.println("ingrese el valor de b");
	int b = teclado.nextInt();
	exponente(a,b);
	System.out.println("si quiere salir precione 0");
	opcion=teclado.nextInt();
	}
	/*
	 * @param a valor entero que representa la base
	 * @param b valor entero que representa el exponente
	 * @param valor que regresa a*a multiplicado tantas veces b
	 * @return devuelve un valor entero
	 * */

}

public static int exponente(int base, int exponente) {
	int res =1;
	for(int i =1;i<=exponente;i++) {
r	
	res = res*base;
	}
	System.out.println(res);
	return res;
}

}