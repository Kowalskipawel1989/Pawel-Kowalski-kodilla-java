package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {
    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void testCompanySearch() throws SearchProcessingException {
        //Given
        Company google = new Company("Google");
        Company apple = new Company("Apple");
        Company amazon = new Company("Amazon");
        Company facebook = new Company("Facebook");
        Company factoryMilks = new Company("Factory Milk");
        Company factorySacks = new Company("Factory Sacks");

        List<Company> companyList = new ArrayList<>();
        companyList.add(companyDao.save(google));
        companyList.add(companyDao.save(apple));
        companyList.add(companyDao.save(amazon));
        companyList.add(companyDao.save(facebook));
        companyList.add(companyDao.save(factoryMilks));
        companyList.add(companyDao.save(factorySacks));
        //When
        List<Company> result = searchFacade.companySearch("Fac");
        //Then
        assertEquals(result.size(), 3);
        //CleanUp
        try {
            companyDao.delete(google);
            companyDao.delete(apple);
            companyDao.delete(amazon);
            companyDao.delete(facebook);
            companyDao.delete(factoryMilks);
            companyDao.delete(factorySacks);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testEmployeeSearch() throws SearchProcessingException {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee johnDark = new Employee("John", "Dark");
        Employee johnDerek = new Employee("John", "Derek");
        Employee steveJohnson = new Employee("Steve", "Johnson");
        Employee patricRooney = new Employee("Patric", "Rooney");
        Employee kathrinRobertson = new Employee("Kathrin", "Robertson");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employeeDao.save(johnSmith));
        employeeList.add(employeeDao.save(johnDark));
        employeeList.add(employeeDao.save(johnDerek));
        employeeList.add(employeeDao.save(steveJohnson));
        employeeList.add(employeeDao.save(patricRooney));
        employeeList.add(employeeDao.save(kathrinRobertson));
        //When
        List<Employee> result = searchFacade.employeeSearch("John");
        //Then
        assertEquals(result.size(), 3);
        //CleanUp
        try {
            employeeDao.delete(johnSmith);
            employeeDao.delete(johnDark);
            employeeDao.delete(johnDerek);
            employeeDao.delete(steveJohnson);
            employeeDao.delete(patricRooney);
            employeeDao.delete(kathrinRobertson);
        } catch (Exception e) {
            //do nothing
        }
    }
}
