package CoffeeShopDemo.Business.Concrete;

import CoffeeShopDemo.Business.Abstract.CustomerCheckService;
import CoffeeShopDemo.Entities.Concrete.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
