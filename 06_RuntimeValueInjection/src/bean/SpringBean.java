package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean {



    /*   public SpringBean() {
            System.out.println("Spring bean Default Constructor");
        }
    */

  /*  @Autowired(required = false)
    public SpringBean(@Value("C001") String id,
                      @Value("true") boolean b){
        System.out.println("Spring Bean Instantiated");
        System.out.println(id);
        System.out.println(b);
    }
*/
    @Autowired(required = false)// greediest constructor ( the highest parameter count )
    public SpringBean(@Value("1,2,3") int [] myNames,@Value("A")char a){
        System.out.println("Spring Bean Instantiated");

        for (Integer myName: myNames) {
            System.out.println(myName);
        }
        System.out.println(a);
    }



    @Autowired(required = false)
    public SpringBean(@Value("C001") String id,
                      @Value("10") int age,
                      @Value("true") boolean b){
        System.out.println("Spring Bean Instantiated");
        System.out.println(id);
        System.out.println(age);
        System.out.println(b);
    }
}
