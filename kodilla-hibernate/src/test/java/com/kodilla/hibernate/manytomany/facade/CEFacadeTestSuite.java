package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CEFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CEFacade ceFacade;

    @Test
    public void testCompanyFacade() throws CEQueryException {
        //Given
        Company company = new Company("Kodilla");
        companyDao.save(company);

        //When
        List<Company> companies = ceFacade.findCompanyByAnyString("dil");

        //Then
        Assertions.assertEquals(1, companies.size());

        //CleanUp
        companyDao.delete(company);
    }

    @Test
    public void testEmployeeFacade() throws CEQueryException {
        //Given
        Employee employee = new Employee("Jan", "Kowalski");
        employeeDao.save(employee);

        //When
        List<Employee> employees = ceFacade.findEmployeeByAnyString("wsk");

        //Then
        Assertions.assertEquals(1, employees.size());

        //CleanUp
        employeeDao.delete(employee);
    }
}
