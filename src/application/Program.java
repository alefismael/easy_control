package application;

import util.Control;

import java.util.Scanner;

import util.ClearTerminal;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Control ctrl = new Control();
		
		ClearTerminal.clear();
		System.out.println("Seus clientes são: ");
		ctrl.showClients();
		System.out.println("Informe o csv para adicionar: ");
		ctrl.addClients(sc.nextLine());
		System.out.println("Os clientes são: ");
		ctrl.showClients();
		System.out.println("Informe outro csv para remover: ");
		ctrl.removeClient(sc.nextLine());
		System.out.println("Seus clientes são: ");
		ctrl.showClients();
		sc.close();
	}

}
