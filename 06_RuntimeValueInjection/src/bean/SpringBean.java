package bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

 /*   public SpringBean() {
        System.out.println("Spring bean Default Constructor");
    }
*/
  /*  public SpringBean(@Value("C001") String id,
                      @Value("10") int age,
                      @Value("true") boolean b){
        System.out.println("Spring Bean Instantiated");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }
*/


    public SpringBean(@Value("Dasun,Perera,Kavindu") String [] myNames){
        System.out.println("Spring Bean Instantiated");

        for (String myName: myNames) {
            System.out.println(myName);
        }
    }
}
