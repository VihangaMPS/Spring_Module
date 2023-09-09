package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements InitializingBean {

    //${} -> Property PlaceHolder
    @Value("${user.name}")
    private String userName;

    @Value("${os.version}")
    private String osVersion ;


    @Value("${ijse.application.name}")
    private String projectName;

    @Value("${ijse.application.db}")
    private String dbName;

    public SpringBeanOne() {
        System.out.println("Spring Bean One Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(userName);
        System.out.println(osVersion);
        System.out.println(projectName);
        System.out.println(dbName);
    }
}
