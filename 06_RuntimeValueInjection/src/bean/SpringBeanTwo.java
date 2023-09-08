package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements InitializingBean {
    @Value("C001")
    private String id;
    @Value("Vishnuka Yahan")
    private String name;
    @Value("Galle")
    private String address;
    @Value("20000000.00")
    private String salary;


    public SpringBeanTwo() {
        System.out.println("Spring Bean Two Instantiated");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("=================================================");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }
}
