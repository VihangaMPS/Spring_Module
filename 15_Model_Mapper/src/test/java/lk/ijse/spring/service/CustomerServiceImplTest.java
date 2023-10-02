package lk.ijse.spring.service;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.impl.CustomerService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;



@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    void saveCustomer() {

        //if it is new Customer It should add to the databases
        CustomerDTO customerDTO1 = new CustomerDTO("C001", "Namal", "Galle", 88446);
        customerService.saveCustomer(customerDTO1);


        //Check there is no error
        //I f there is no error test ok
        //IF there are  errors test is false
        assertDoesNotThrow(()->{
            customerService.saveCustomer(customerDTO1);
        });

        //if the customer  already exits.check if it is throwing the error
        CustomerDTO customerDTO2 = new CustomerDTO("C001", "Namal", "Galle", 88446);
        // check if there is a error .If there is a error test is ok
        assertThrows(RuntimeException.class,()->{
            customerService.saveCustomer(customerDTO2);

        });



    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void searchCustomer() {
    }

    @Test
    void getAllCustomer() {
    }
}