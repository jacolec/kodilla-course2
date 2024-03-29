package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveFirstThreeLettersFromCompanyName",
        query = "SELECT * FROM companies WHERE LEFT(company_name, 3) = :THREELETTERS ",
        resultClass = Company.class
)

@NamedNativeQuery(
        name = "Company.findCompanyByAnyString",
        query = "SELECT * FROM companies WHERE company_name LIKE :ANYSTRING",
        resultClass = Company.class
)

@Entity
@Table(name = "COMPANIES")
public class Company {

    private int  id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
