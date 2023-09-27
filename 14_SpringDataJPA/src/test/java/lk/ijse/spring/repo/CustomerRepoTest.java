package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration //state test configuration class
@ContextConfiguration(classes = {JPAConfig.class}) // import configuration for test context
@ExtendWith(SpringExtension.class) // Run With Spring Extension
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;

    @Test //test method
    public void savedCustomer(){
        // Ok let's save a customer using Customer Repo
        Customer customer1 = new Customer("C001","some","panadura",10000.00);
        Customer customer2 = new Customer("C002","piyal","Mathara",25000.00);
        Customer customer3 = new Customer("C003","Gune","Weligama",5000.00);
        customerRepo.save(customer1);
        customerRepo.save(customer2);
        customerRepo.save(customer3);

    }

}