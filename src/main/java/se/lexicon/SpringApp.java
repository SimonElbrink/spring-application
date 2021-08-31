package se.lexicon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.lexicon.model.Employee;
import se.lexicon.model.Programmer;
import se.lexicon.service.RandomSalaryService;

public class SpringApp
{
    public static void main( String[] args )
    {
 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee programmer = context.getBean("programmer", Employee.class);

       String message = "Programmers description: " + programmer.getDescription();

        System.out.println(message);

//        Employee myProgrammer = new Programmer(new RandomSalaryService());
//        System.out.println(myProgrammer.getDescription());

        int salary = programmer.getSalary();

        System.out.println(salary);

    }
}
