package se.lexicon.model;

import se.lexicon.service.SalaryService;

public class Programmer implements Employee{

    SalaryService salaryService;

    public Programmer() {
    }

    public void setSalaryService(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @Override
    public String getDescription() {
        return "I love to Code!";
    }

    @Override
    public int getSalary() {
        return salaryService.getSalary();
    }
}
