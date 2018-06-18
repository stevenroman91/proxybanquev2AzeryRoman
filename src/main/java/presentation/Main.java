package presentation;

import model.ConseillerClientele;
import service.ClientService;
import service.ClientServiceImpl;
import service.ErreurLogin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientService service = new ClientServiceImpl();
		String login = "cr7";
		ConseillerClientele cc = service.getCCByLogin(login);
		System.out.println(cc.getLogin());
		/*System.out.println(cc.getPassword());
		String password= cc.getPassword();
		try {
			boolean boo =service.VerifierConnexion(login, password);
			System.out.println(boo);
		} catch (ErreurLogin e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*
		
		/*Vue vue = new Vue();
		vue.showAllClients();*/

	}

}
