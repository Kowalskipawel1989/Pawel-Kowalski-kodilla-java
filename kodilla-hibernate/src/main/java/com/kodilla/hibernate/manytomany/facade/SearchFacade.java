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
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void processSearchCompany(String threeLetters) throws SearchProcessingException{
        boolean wasError = false;
        List<Company> companySearch = companyDao.writeTheNameCompanies(threeLetters);

    }

    public void processSearchEmployee(String lastName) throws SearchProcessingException {
        boolean wasError = false;
        List<Employee> employeeSearch = employeeDao.writeTheLastNameEmployees(lastName);

    }
}
