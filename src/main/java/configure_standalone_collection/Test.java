package configure_standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("configure_standalone_collection/standaloneXML.xml");
        person e1 =   (person) context1.getBean("person1");
        // System.out.println(e1);
        // e1 calls toString() directly as class_name as been specified.
        System.out.println("Name of Friends = " + e1.getFriends());
        System.out.println("Fees Structure in java = " + e1.getFees());
        System.out.println("Database configuration = " + e1.getProperties());
        // System.out.println(e1.getFees().containsValue("10000"));
        // above is map methods
        System.out.println(e1.getFriends().getClass().getName());
        System.out.println(e1.getFees().getClass().getName());
        System.out.println(e1.getProperties().getClass().getName());
    }
}
