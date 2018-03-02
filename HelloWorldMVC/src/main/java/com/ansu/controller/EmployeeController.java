package com.ansu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ansu.entity.Employee;

@Controller
public class EmployeeController {
 
    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
    public ModelAndView showForm(@PathVariable long employeeId) {
    	System.out.println("Inside show Employee Form :"+employeeId);
        return new ModelAndView("employee", "employee", new Employee());
    }
 
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@Valid Employee employee, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "employeeView";
    }
}
