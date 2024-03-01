package application;

import util.Control;
import util.InputFilter;

import java.util.Scanner;

import util.ClearTerminal;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Control ctrl = new Control();

		

		// Program Menu

		int menu = 0;
		while (menu != 9) {

			ClearTerminal.clear();
			System.out.println(" --- EASY CONTROL --- ");
			System.out.println();
			System.out.println("1- CLIENTES");
			System.out.println("2- VENDAS");
			System.out.println("3- PRODUTOS");
			System.out.println("9- SAIR DO PROGRAMA");
			menu = InputFilter.getInt(sc);

			switch (menu) {
			case 1:
				while (menu != 9) {
					ClearTerminal.clear();
					System.out.println(" --- CLIENTES --- ");
					System.out.println();
					System.out.println("9- VOLTAR AO MENU");
					menu = InputFilter.getInt(sc);
				}
				menu = 0;
				break;

			}
		}

		sc.close();
	}

}
