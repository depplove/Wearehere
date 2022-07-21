package com.depplove.mvcproject.web;

import com.depplove.mvcproject.service.EmployeeService;
import com.depplove.mvcproject.web.dao.EmployeeRegistrationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class EmployeeRegistrationController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRegistrationController (EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("employee")
    public String showRegistrationForm(Model model){
        EmployeeRegistrationDAO employeeRegistrationDAO = new EmployeeRegistrationDAO();
        model.addAttribute("employee",employeeRegistrationDAO);
        return "registration-form";
    }

    @PostMapping("employee")
    public String registration(@ModelAttribute("employee")
                                   EmployeeRegistrationDAO employeeRegistrationDAO){
       employeeService.registration(employeeRegistrationDAO);

        return "redirect:/registration/employee?success";
    }

}
