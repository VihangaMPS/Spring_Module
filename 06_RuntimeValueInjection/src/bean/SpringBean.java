package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

 /*   public SpringBean() {
        System.out.println("Spring bean Default Constructor");
    }
*/
    public SpringBean(@Value("C001") String id,@Value("10") int age){
        System.out.println("Spring Bean Instantiated");
        System.out.println(id);
        System.out.println(age);
    }
}
