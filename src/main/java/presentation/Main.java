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
		int telephone=464848454;
		
		service.updateClient(service.getValidatedClient(1), service.getValidatedClient(1).getNom(), service.getValidatedClient(1).getPrenom(), service.getValidatedClient(1).getEmail(), telephone, service.getValidatedClient(1).getAdresse());
	}

}

