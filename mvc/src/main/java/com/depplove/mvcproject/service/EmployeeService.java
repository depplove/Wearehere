package com.depplove.mvcproject.service;

import com.depplove.mvcproject.model.Employee;
import com.depplove.mvcproject.model.Role;
import com.depplove.mvcproject.repository.EmployeeRepository;
import com.depplove.mvcproject.web.dao.EmployeeRegistrationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {


    private EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll(){
        System.out.println("Service");
       return employeeRepository.findAll();
    }

    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    public Page<Employee> getEmoloyeePage(int pageNo, int pageSize){
        Pageable employeePage = PageRequest.of(pageNo,pageSize);
        return employeeRepository.findAll(employeePage);
    }

    // Create Employee object using RegistrationDAO

    public void registration(EmployeeRegistrationDAO employeeRegistrationDAO){
        Employee employee = new Employee(
                employeeRegistrationDAO.getFirstName(),
                employeeRegistrationDAO.getFirstName(),
                employeeRegistrationDAO.getEmail(),
                employeeRegistrationDAO.getPassword(),
                Arrays.asList(new Role("ROLE_EMPLOYEE"))
        );
        employeeRepository.save(employee);
    }

}
