package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

     void saveCustomer(CustomerDTO dto);
     void deleteCustomer(String id);
     void updateCustomer(CustomerDTO dto);
     CustomerDTO searchCustomer(String id );
     List<CustomerDTO> getAllCustomer();
}
