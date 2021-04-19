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

    public List<Company> companySearch(String threeLetters) throws SearchProcessingException{
        List<Company> result = null;

        if (threeLetters.length() < 2) {
            LOGGER.error(SearchProcessingException.ERR_THREE_CHARACTERS);
            throw new SearchProcessingException(SearchProcessingException.ERR_THREE_CHARACTERS);
        } else {
            LOGGER.info("Find company with: " + threeLetters);
            try{
                result = companyDao.writeTheNameCompanies("%" + threeLetters + "%");
            } catch (RuntimeException e) {
                LOGGER.error(SearchProcessingException.ERR_NOT_FOUND, e);
            }
        }
        return result;
    }

    public List<Employee> employeeSearch(String firstName) throws SearchProcessingException {
        List<Employee> result = null;

        if (firstName.length() < 2) {
            LOGGER.error(SearchProcessingException.ERR_THREE_CHARACTERS);
            throw new SearchProcessingException(SearchProcessingException.ERR_THREE_CHARACTERS);
        } else {
            LOGGER.info("Find employee with: " + firstName);
            try{
                result = employeeDao.writeThreeLettersEmployees("%" + firstName + "%");
            } catch (RuntimeException e) {
                LOGGER.error(SearchProcessingException.ERR_NOT_FOUND, e);
            }
        }
        return result;
    }
}
