package com.depplove.mvcproject.controllers;

import com.depplove.mvcproject.model.Employee;
import com.depplove.mvcproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    List<Employee> employees;
    
    @GetMapping("/employees")
    public String getName(Model model){
//        employees = new ArrayList<>();
//        employees= employeeService.findAll();
//        model.addAttribute("employee",employees);
//        return "employees";
        return getEmployeePage(1,model);
    }

    @GetMapping("/showForm")
    public String postEmployee(Model model){
        Employee theEmployee = new Employee();
        model.addAttribute("employee",theEmployee);
        return "employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        employeeService.save(theEmployee);
        return "redirect:/employees";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.delete(id);
        return "redirect:/employees";
    }
    @GetMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id,Model model){
        Optional<Employee> employee = employeeService.findById(id);
        if (employee != null){
            model.addAttribute("employee", employee);
        }else {
            throw  new RuntimeException("Employee is not found with "+ id);
        }
        return "employee-form";
    }

    @GetMapping("/page/{pageNo}")
    public String getEmployeePage(@PathVariable int pageNo,Model model){
        // Determine rows in the table or employees on one page
        int pageSize = 4;

        Page<Employee> employeePage = employeeService.getEmoloyeePage(pageNo-1,pageSize);
        List<Employee> employeeList = employeePage.getContent();
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("totalPages",employeePage.getTotalPages());
        model.addAttribute("employee",employeeList);
        return "employees";
    }

}
