package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DBConnection implements InitializingBean {

    @Autowired
    Environment environment;

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
        // getProperty vs  getRequiredProperty

        System.out.println(environment);
        String version = environment.getProperty("os.version");// issue key null

        String requiredProperty = environment.getRequiredProperty("user.name"); //if key is wrong = Exceptions


        System.out.println(version);
        System.out.println(requiredProperty);


        System.out.println("=========================================");
        System.out.println(url);
        System.out.println(userName);
        System.out.println(password);
        System.out.println(driverClassName);
        System.out.println("=========================================");

    }
}
