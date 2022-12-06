package configure_SpringLifeCycle;

// import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Testlifecycle {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configure_SpringLifeCycle/configLifecycle.xml");
       lifecycle l1 = (lifecycle) context.getBean("lc1");
       context.registerShutdownHook();
        System.out.println(l1);
        
    }
    
}
