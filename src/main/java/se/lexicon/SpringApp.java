package se.lexicon;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.model.Employee;
import se.lexicon.model.Programmer;

public class SpringApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee programmer = context.getBean("programmer", Employee.class);

       String message = "Programmers description: " + programmer.getDescription();

        System.out.println(message);



        Employee myProgrammer = new Programmer();
        System.out.println(myProgrammer.getDescription());

    }
}
