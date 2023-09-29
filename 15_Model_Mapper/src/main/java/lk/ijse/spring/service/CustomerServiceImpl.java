package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Override
    public void saveCustomer(Customer entity){
        if (!repo.existsById(entity.getId())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Customer Already exists ...");
        }

    }
    @Override
    public void deleteCustomer(String id){
        if (repo.existsById(id)) {
            repo.deleteById(id);
        }else {
            throw  new RuntimeException("Please check the customer ID ... No Such Customer ...!!");
        }
    }

    @Override
    public  void updateCustomer(Customer entity){
        if (repo.existsById(entity.getId())) {
            repo.save(entity);
        }else {
            throw  new RuntimeException("No Such Customer To Updated..? Please check the id ..!!!");
        }

    }

    @Override
    public Customer searchCustomer(String id ){
        if (repo.existsById(id)) {
            return repo.findById(id).get();
        }else {
            throw new RuntimeException("No Customer For "+id+" ...!");
        }

    }

    @Override
    public List<Customer> getAllCustomer() {
        return repo.findAll();
    }
}
