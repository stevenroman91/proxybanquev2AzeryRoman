package presentation;

import java.util.List;

import model.Client;
import model.ConseillerClientele;
import service.ClientService;
import service.ClientServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientService service = new ClientServiceImpl();
		ConseillerClientele cc=service.getCCByLogin("cr7");
		List<Client> list = service.getClients(cc);
		System.out.println(list);
	}

}

