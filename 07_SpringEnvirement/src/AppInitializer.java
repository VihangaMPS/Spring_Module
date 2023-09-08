import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

   //  Access System Environment Variable With Java
   //   System.getenv();

        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            System.out.println(key+ " : "+getenv.get(key));

        }
    }
}
