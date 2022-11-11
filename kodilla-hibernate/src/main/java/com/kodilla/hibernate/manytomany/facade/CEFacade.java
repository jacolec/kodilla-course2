package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CEFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    private final static Logger LOGGER = LoggerFactory.getLogger(CEFacade.class);

    @Autowired
    public CEFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanyByAnyString(String anyString) throws CEQueryException {
        //boolean  wasError = false;
        LOGGER.info("Searching for company with phrase " + anyString + " in its name...");
        List<Company> companies = companyDao.findCompanyByAnyString("%" + anyString + "%");
        if (companies.size() == 0) {
            LOGGER.error(CEQueryException.ERR_COMPANY_NOT_FOUND);
            throw new CEQueryException(CEQueryException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> findEmployeeByAnyString(String anyString) throws CEQueryException {
        LOGGER.info("Searching for employees with phrase " + anyString + " in its lastname...");
        List<Employee> employees = employeeDao.findEmployeeByAnyString("%" + anyString + "%");
        if (employees.size() ==0) {
            LOGGER.error(CEQueryException.ERR_EMPLOYEE_NOT_FOUND);
            throw new CEQueryException(CEQueryException.ERR_EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}
