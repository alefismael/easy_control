package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Control {

	private List<String> clients = new ArrayList<>();
	private String pathClient = "C:\\Users\\alefi\\Documents\\eclipse-projects\\EasyControl\\data\\clients.csv";

	public List<String> getClients() {
		return clients;
	}

	public void setClients(List<String> clients) {
		this.clients = clients;
	}

	public void showClients() {

		if(Checker.fileExists(pathClient)) {
		try (BufferedReader br = new BufferedReader(new FileReader(pathClient))) {
			String line = br.readLine();
			String[] aux;
			while (line != null) {
				aux = line.split(", ");
				System.out.println("ID: " + aux[0]);
				System.out.println("NAME: " + aux[1]);
				System.out.println("ADDRESS: " + aux[2]);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		else {
			System.out.println("NÃO HÁ CLIENTES CADASTRADOS");
		}
	}

	public void addClients(String client) {

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
			if (!(remove.equals(aux[1]))) {
				correct.add(line);
			}
			line = br.readLine();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try (BufferedWriter wr = new BufferedWriter(new FileWriter(pathClient))) {

		for(String e : correct) {
			wr.write(e);
			wr.newLine();
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
