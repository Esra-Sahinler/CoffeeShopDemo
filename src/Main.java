import java.time.LocalDate;

import CoffeeShopDemo.Adapters.MernisServiceAdapter;
import CoffeeShopDemo.Business.Concrete.BaseCustomerManager;
import CoffeeShopDemo.Business.Concrete.StarbucksCustomerManager;
import CoffeeShopDemo.Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.add(new Customer(1, "Esra", "Þahinler", LocalDate.of(1998, 12, 14), "11111111111"));

	}

}
