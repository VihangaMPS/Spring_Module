package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {
    @Value("${user.db.url}")
    private String url;
    @Value("${user.db.name}")
    private String userName;
    @Value("${user.db.password}")
    private String password;
    @Value("${user.db.driverClassName}")
    private String driverClassName;

    public DBConnection() {
        System.out.println("DB Connection Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("=========================================");
        System.out.println(url);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(driverClassName);
        System.out.println("=========================================");

    }
}
