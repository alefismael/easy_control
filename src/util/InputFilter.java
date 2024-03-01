package util;

import java.util.Scanner;

public class InputFilter {
	public static int getInt(Scanner sc) {
		System.out.print("Informe um número: ");
		try {
			return Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e) {
			return getInt(sc);
		}
	}
	
	public static double addValor(Scanner sc) {
		System.out.print("Informe o valor: R$");
		try {
			return Double.parseDouble(sc.nextLine());
		}
		catch(NumberFormatException e) {
			return getInt(sc);
		}
	}
}
