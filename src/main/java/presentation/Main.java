package presentation;

import java.util.List;

import model.Client;
import model.Compte;
import model.ConseillerClientele;
import service.ClientService;
import service.ClientServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientService service = new ClientServiceImpl();
		ConseillerClientele cc=service.getCCByLogin("cr7");
		List<Compte> listecomptes = service.getdAllComptes(cc);
		System.out.println(listecomptes);
		//request.setAttribute("client", c);
		//this.getServletContext().getRequestDispatcher("/WEB-INF/views/comptesclient.jsp").forward(request, response);
	}

}

