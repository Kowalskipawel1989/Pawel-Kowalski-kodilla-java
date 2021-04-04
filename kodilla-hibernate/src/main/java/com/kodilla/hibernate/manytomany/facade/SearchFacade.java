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
        LOGGER.info("Start Search Companies");
        if (threeLetters.length() > 2) {
            LOGGER.error(SearchProcessingException.ERR_THREE_CHARACTERS);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_THREE_CHARACTERS);
        }
        if (threeLetters.isEmpty()){
            LOGGER.error(SearchProcessingException.ERR_NOT_FOUND);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_NOT_FOUND);
        }
        List<Company> companySearch = companyDao.writeTheNameCompanies(threeLetters);
    }

    public void processSearchEmployee(String firstName) throws SearchProcessingException {
        boolean wasError = false;
        List<Employee> employeeSearch = employeeDao.writeThreeLettersEmployees("%" + firstName + "%");
        LOGGER.info("Start search Employees" + employeeSearch);

        if (firstName.length() > 2) {
            LOGGER.error(SearchProcessingException.ERR_THREE_CHARACTERS);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_THREE_CHARACTERS);
        }
        if (employeeSearch.isEmpty()) {
            LOGGER.error(SearchProcessingException.ERR_NOT_FOUND);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_NOT_FOUND);
        }
    }
}
