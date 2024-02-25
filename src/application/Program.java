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
		ctrl.addClient(sc.nextLine());
		System.out.println("Os clientes são: ");
		ctrl.showClients();
		System.out.println("Informe outro csv para remover: ");
		ctrl.removeClient(sc.nextLine());
		System.out.println("Seus clientes são: ");
		ctrl.showClients();
		System.out.println("Informe o produto para adicionar: ");
		ctrl.addProduct(sc.nextLine());
		System.out.println("Os produtos são: ");
		ctrl.showProducts();
		System.out.println("Informe outro produto para remover: ");
		ctrl.removeProduct(sc.nextLine());
		System.out.println("Seus produto são: ");
		ctrl.showProducts();
		System.out.println("Informe sua venda para adicionar: ");
		ctrl.addShopping(sc.nextLine());
		System.out.println("Suas vendas são: ");
		ctrl.showShoppings();
		System.out.println("Informe sua venda para remover: ");
		ctrl.removeShopping(sc.nextLine());
		System.out.println("Suas vendas são: ");
		
		ctrl.showShoppings();
		sc.close();
	}

}
