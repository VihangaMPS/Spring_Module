package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

     void saveCustomer(Customer entity);
     void deleteCustomer(String id);
     void updateCustomer(Customer entity);
     Customer searchCustomer(String id );
     List<Customer> getAllCustomer();
}
