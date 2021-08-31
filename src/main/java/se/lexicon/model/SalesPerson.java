package se.lexicon.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import se.lexicon.service.SalaryService;

@Component
public class SalesPerson implements Employee{

    SalaryService salaryService;

    @Autowired
    public SalesPerson(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @Override
    public String getDescription() {
        return "I like to sale and have contacts with clients!";
    }

    @Override
    public int getSalary() {
        return salaryService.getSalary();
    }
}
