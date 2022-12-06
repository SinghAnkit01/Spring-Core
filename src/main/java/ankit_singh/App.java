package ankit_singh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("ankit_singh/config.xml");
        // context can provide object of student class
        // method to inject object from IOC to reference of class student
       student s1 =   (student) context.getBean("student1");
       student s2 =   (student) context.getBean("student2");
       student s3 =   (student) context.getBean("student3");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
 
    //    student s2 = new student(1,"ankit singh","sawarkarnagar");
    //    System.out.println(s2);
    }
}
