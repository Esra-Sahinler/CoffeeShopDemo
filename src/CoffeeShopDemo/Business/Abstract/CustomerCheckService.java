package CoffeeShopDemo.Business.Abstract;

import CoffeeShopDemo.Entities.Concrete.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
