package com.kodilla.hibernate.manytomany.facade;

public class CEQueryException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "Company not found";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee not found";

    public CEQueryException(String message) {
        super(message);
    }
}
