package test;

import java.util.Scanner;



public class ValidarDNI{

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);



		System.out.println("Introduce tu n�mero de DNI:");

		String numDNI = lector.nextLine();



		String numero = numDNI.substring(0, 7);

		int numeroInt = Integer.parseInt(numero);



		System.out.println(validarNIF(numDNI, numeroInt));

	}



	private static boolean validarNIF(String numDNI, int numeroInt) {



		char[] letras = {'T','R','W','A','G','M','Y','F','P','D', 'X','B','N','J','Z','S','Q','V','H','L','C','K','E'};  

		numeroInt %= 23;



		if ((Character.toUpperCase(numDNI.charAt(7))) != letras[numeroInt]) {

			return false;

		}



		return true;

	}

}