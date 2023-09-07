import bean.SpringBeanOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {



        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
/*        // Run Something just before jvm shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shout down");
                ctx.close();
            }
        }));*/

        ctx.registerShutdownHook();

        ctx.register(AppConfig.class);
        ctx.refresh();

/*        SpringBeanOne beanOne = ctx.getBean(SpringBeanOne.class); // class type -->
        SpringBeanTwo beanTwo = ctx.getBean(SpringBeanTwo.class);
        System.out.println(beanOne);
        System.out.println(beanTwo);
*/
/*

        SpringBeanThree beanThree = ctx.getBean(SpringBeanThree.class);
        System.out.println(beanThree);
*/


        //-----------------------------------
/*
        //Bean Name request (Bean ID)
        //SpringBeanOne -> springBeanOne (Bean ID)
        SpringBeanOne springBeanOne = (SpringBeanOne) ctx.getBean("springBeanOne"); //bean ID
        System.out.println(springBeanOne);


        //SpringBeanTwo -> springBeanTwo
        SpringBeanTwo springBeanTwo = (SpringBeanTwo) ctx.getBean("springBeanTwo");
        System.out.println(springBeanTwo);

*/

        //SpringBeanThree -> springBeanThree
        //SpringBeanThree springBeanThree = (SpringBeanThree) ctx.getBean("BeanThree");
        //System.out.println(springBeanThree);


        //MyConnection bean = ctx.getBean(MyConnection.class);
        //System.out.println(bean);


        //MyConnection -> myConnection  //no
        //@Bean - bean id - > bean method name
        //MyConnection myConnection = (MyConnection) ctx.getBean("getConnection");
        //System.out.println(myConnection);


        //default
        //MyConnection myConnection = (MyConnection) ctx.getBean("connection");
        //System.out.println(myConnection);

        SpringBeanOne ref1 = ctx.getBean(SpringBeanOne.class);
        SpringBeanOne ref2 = ctx.getBean(SpringBeanOne.class);
        SpringBeanOne ref3 = ctx.getBean(SpringBeanOne.class);

        System.out.println("-----------------------------------------------");

        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);


    }
}
