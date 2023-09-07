import config.AppConfig;
import config.AppConfig1;
import config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      /*  context.register(AppConfig1.class);
        context.register(AppConfig2.class);*/
        context.register(AppConfig.class);

        context.refresh();
        context.registerShutdownHook();
    }
}
