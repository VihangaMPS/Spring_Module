package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.impl.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveCustomer(CustomerDTO dto){
        if (!repo.existsById(dto.getId())){

            Customer entity = mapper.map(dto, Customer.class);
            //Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
            // 01 . Sourced
            // 02 . Destination Type - > Class Type which we want to convert the source
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
    public  void updateCustomer(CustomerDTO dto){
        if (repo.existsById(dto.getId())) {

           // Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary());
            repo.save(mapper.map(dto, Customer.class));
        }else {
            throw  new RuntimeException("No Such Customer To Updated..? Please check the id ..!!!");
        }

    }

    @Override
    public CustomerDTO searchCustomer(String id ){
        if (repo.existsById(id)) {

            return mapper.map(repo.findById(id).get(), CustomerDTO.class);

            //return new CustomerDTO(customer.getId(),customer.getName(),customer.getAddress(),customer.getSalary());

        }else {
            throw new RuntimeException("No Customer For "+id+" ...!");
        }

    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
       // List<Customer> all = repo.findAll();
    /*    ArrayList<CustomerDTO> list = new ArrayList<>();

        for (Customer customer : all) {
            list.add(new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress(), customer.getSalary()));
        }
*/
       return mapper.map(repo.findAll(), new TypeToken<List<CustomerDTO>>() {}.getType());



    }
}
