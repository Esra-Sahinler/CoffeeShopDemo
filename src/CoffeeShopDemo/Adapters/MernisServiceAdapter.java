package CoffeeShopDemo.Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeeShopDemo.Business.Abstract.CustomerCheckService;
import CoffeeShopDemo.Entities.Concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result =true;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(new Locale("tr")), 
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth().getYear());
		}catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
