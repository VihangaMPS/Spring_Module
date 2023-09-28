package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@WebAppConfiguration //state test configuration class
@ContextConfiguration(classes = {JPAConfig.class}) // import configuration for test context
@ExtendWith(SpringExtension.class) // Run With Spring Extension
class ItemRepoTest {

    @Autowired
    ItemRepo itemRepo;

    @Test
    public void savedItems(){
        Item item1 = new Item("I001","Sugar",10,160.00);
        Item item2 = new Item("I002","Oil",5,90.00);
        Item item3 = new Item("I003","milk",2,180.00);
        itemRepo.save(item1);
        itemRepo.save(item2);
        itemRepo.save(item3);

    }

    @Test
    public void getAllitems(){
        List<Item> all = itemRepo.findAll();
        for (Item  item : all
             ) {
            System.out.println(item.toString());
        }
    }

    @Test
    public void searchItem(){
        Optional<Item> optional = itemRepo.findById("I001");
        boolean present = optional.isPresent();
        System.out.println(present);

        Item item = optional.get();
        System.out.println(item.toString());

    }

    @Test
    public void deleteItem(){
        itemRepo.deleteById("I001");
    }

    @Test
    public void updateItem(){
        Item item1 = new Item("I001","Sugar",10,160.00);
        itemRepo.save(item1);

    }

}