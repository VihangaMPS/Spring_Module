package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE )
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware , ApplicationContextAware , InitializingBean , DisposableBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context  Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("INITIALIZING Bean  Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Bean Aware");
    }
}
