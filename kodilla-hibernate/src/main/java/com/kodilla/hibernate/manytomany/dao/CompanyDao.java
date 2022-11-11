package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    List<Company> retrieveFirstThreeLettersFromCompanyName(@Param("THREELETTERS") String let);
    List<Company> findCompanyByAnyString(@Param("ANYSTRING") String anyString);

}
