package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Control {

	// Locations where the CSV files will be stored, I changed it to your preferred folder
	
	private String pathClient = "C:\\Users\\alefi\\Documents\\eclipse-projects\\EasyControl\\data\\clients.csv";
	private String pathProduct = "C:\\Users\\alefi\\Documents\\eclipse-projects\\EasyControl\\data\\products.csv";
	private String pathShopping = "C:\\Users\\alefi\\Documents\\eclipse-projects\\EasyControl\\data\\shopping.csv";
	
	// Client functions

	public void showClients() {

		if (Checker.fileExists(pathClient)) {
			try (BufferedReader br = new BufferedReader(new FileReader(pathClient))) {
				String line = br.readLine();
				String[] aux;
				if (line == null) {
					System.out.println("NÃO HÁ CLIENTES CADASTRADOS");
				}
				while (line != null) {
					aux = line.split(", ");
					System.out.println("NAME: " + aux[0]);
					System.out.println("ADDRESS: " + aux[1]);
					line = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("NÃO HÁ CLIENTES CADASTRADOS");
		}
	}

	public void addClient(String client) {

		if (Checker.fileExists(pathClient)) {
			try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathClient, true))) {
				wr.write(client);
				wr.newLine();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		else {
			try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathClient))) {
				wr.write(client);
				wr.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void removeClient(String remove) {

		List<String> correct = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(pathClient));) {

			String line = br.readLine();
			String[] aux = line.split(", ");
			while (line != null) {
				aux = line.split(", ");
				if (!(remove.toUpperCase().equals(aux[0].toUpperCase()))) {
					correct.add(line);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathClient))) {

			for (String e : correct) {
				wr.write(e);
				wr.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Product functions
	
	public void showProducts() {

		if (Checker.fileExists(pathProduct)) {
			try (BufferedReader br = new BufferedReader(new FileReader(pathProduct))) {
				String line = br.readLine();
				String[] aux;
				if (line == null) {
					System.out.println("NÃO HÁ PRODUTOS CADASTRADOS");
				}
				while (line != null) {
					aux = line.split(", ");
					System.out.println("PRODUCT: " + aux[0]);
					System.out.println("PRICE: " + aux[1]);
					line = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("NÃO HÁ PRODUTOS CADASTRADOS");
		}
	}

	public void addProduct(String product) {
		if (Checker.fileExists(pathProduct)) {
			try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathProduct, true))) {
				wr.write(product);
				wr.newLine();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		else {
			try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathProduct))) {
				wr.write(product);
				wr.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void removeProduct(String remove) {

		List<String> correct = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(pathProduct));) {

			String line = br.readLine();
			String[] aux = line.split(", ");
			while (line != null) {
				aux = line.split(", ");
				if (!(remove.toUpperCase().equals(aux[0].toUpperCase()))) {
					correct.add(line);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathProduct))) {

			for (String e : correct) {
				wr.write(e);
				wr.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Shopping functions
	
	public void showShoppings() {

		if (Checker.fileExists(pathShopping)) {
			try (BufferedReader br = new BufferedReader(new FileReader(pathShopping))) {
				String line = br.readLine();
				String[] aux;
				if (line == null) {
					System.out.println("NÃO HÁ VENDAS CADASTRADOS");
				}
				while (line != null) {
					aux = line.split(", ");
					System.out.println("HORÁRIO: " + aux[0]);
					System.out.println("CLIENTE: " + aux[1]);
					System.out.println("PRODUCT: " + aux[2]);
					System.out.println("QUANTITY: " + aux[3]);
					System.out.println("PRICE: " + aux[4]);
					System.out.println("TOTAL PRICE: " + aux[5]);
					line = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("NÃO HÁ VENDAS CADASTRADOS");
		}
	}

	public void addShopping(String product) {
		if (Checker.fileExists(pathShopping)) {
			try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathShopping, true))) {
				wr.write(product);
				wr.newLine();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		else {
			try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathShopping))) {
				wr.write(product);
				wr.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void removeShopping(String remove) {

		List<String> correct = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(pathShopping));) {

			String line = br.readLine();
			String[] aux = line.split(", ");
			while (line != null) {
				aux = line.split(", ");
				if (!(remove.toUpperCase().equals(aux[1].toUpperCase()))) {
					correct.add(line);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathShopping))) {

			for (String e : correct) {
				wr.write(e);
				wr.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
