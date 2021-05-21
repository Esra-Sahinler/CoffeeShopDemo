package CoffeeShopDemo.Business.Concrete;

import CoffeeShopDemo.Business.Abstract.CustomerService;
import CoffeeShopDemo.Entities.Concrete.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	@Override
	public void add(Customer customer) {
		
		System.out.println("Saved To Database " + customer.getFirstName());		
	}
}
