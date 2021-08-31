package se.lexicon;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.lexicon.model.Employee;


public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        Employee programmer = context.getBean("programmer", Employee.class);

        Employee salesPerson = context.getBean("salesPerson", Employee.class);

        String message = "Programmers description: " + programmer.getDescription();

        System.out.println(message);

//        Employee myProgrammer = new Programmer(new RandomSalaryService());
//        System.out.println(myProgrammer.getDescription());

        int salary = programmer.getSalary();

        System.out.println(salary);

        System.out.println("salesPerson Salary = " + salesPerson.getSalary());

    }
}
