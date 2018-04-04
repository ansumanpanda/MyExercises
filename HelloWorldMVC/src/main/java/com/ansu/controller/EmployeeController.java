package com.ansu.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ansu.entity.Employee;
import com.ansu.entity.SelectOptions;
import com.ansu.entity.Student;
import com.ansu.repository.StudentJdbcRepository;

@Controller
public class EmployeeController {
	
	@Autowired
    StudentJdbcRepository repository;
 
	
	
	 //Spring binding values in a Map
	
    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
    public String showForm(@PathVariable long employeeId,ModelMap model) {
    	System.out.println("Inside show Employee Form :"+employeeId);
    	
    	//Student student =repository.findById(employeeId);
    	
    	//System.out.println("Student Name :"+student.getName());
    	
    	 //List<SelectOptions> countryList = categoryService.getAllCategories();
    	
    	Employee employee =new Employee();
    	
    	Map<String,String> formInputData=new LinkedHashMap<String,String>();
    	
    	formInputData.put("firstName", "Ravi");
    	formInputData.put("lastName", "Shyam");
    	employee.setFormInputData(formInputData);
    	
    	
    	 List<SelectOptions> country = getAllCountry();
         model.addAttribute("countryList", country);
         model.addAttribute("employee", employee);
         model.addAttribute("studentName",  "abc");
        //return new ModelAndView("employee", "employee", new Employee());
         
         return "employee";
    }
 
    
    
   

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@Valid Employee employee, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "employee";
        }
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "employeeView";
    }
    
   /* @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(@RequestBody MultiValueMap<String,String> formData, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "employee";
        }
        if(formData!=null && formData.size()>0)
        {
        	for(String key :formData.keySet())
        	{
        		System.out.println("key :"+key);
        		System.out.println("value :"+formData.get(key));
        		
        	}
        }
        model.addAttribute("name", "ansuman");
        model.addAttribute("contactNumber", "518");
        model.addAttribute("id", 1);
        return "employeeView";
    }*/
    
    
    
    @RequestMapping(value = "/countries/{countryId}", method = RequestMethod.GET)
    public @ResponseBody  List<SelectOptions> getAllStates(@PathVariable("countryId") int countryId) {
        return getAllStatesforCountry(countryId);
    }
    
    
    
    private List<SelectOptions> getAllCountry()
    {
    	List<SelectOptions> countryList = new ArrayList<SelectOptions>();
    	
    	SelectOptions selectOptionsCountry1 = new SelectOptions();
    	
    	selectOptionsCountry1.setOptionId(1);
    	selectOptionsCountry1.setOptionValue("India");
    	countryList.add(selectOptionsCountry1);
    	
    	SelectOptions selectOptionsCountry2 = new SelectOptions();
    	
    	selectOptionsCountry2.setOptionId(2);
    	selectOptionsCountry2.setOptionValue("USA");
    	countryList.add(selectOptionsCountry2);
    	return countryList;
    }
    
    
    
    
    private List<SelectOptions> getAllStatesforCountry(int countryId)
    {
    	
    	List<SelectOptions> stateList = new ArrayList<SelectOptions>();
    	if(countryId==1)
    	{
    		
        	
        	SelectOptions selectOptionsState1 = new SelectOptions();
        	selectOptionsState1.setOptionId(1);
        	selectOptionsState1.setOptionValue("Punjab");
        	
        	stateList.add(selectOptionsState1);
        	
        	SelectOptions selectOptionsState2 = new SelectOptions();
        	selectOptionsState2.setOptionId(2);
        	selectOptionsState2.setOptionValue("Kerala");
        	
        	stateList.add(selectOptionsState2);
    	}
    	else if(countryId==2)
    	{
    		SelectOptions selectOptionsState1 = new SelectOptions();
        	selectOptionsState1.setOptionId(1);
        	selectOptionsState1.setOptionValue("New York");
        	
        	stateList.add(selectOptionsState1);
        	
        	SelectOptions selectOptionsState2 = new SelectOptions();
        	selectOptionsState2.setOptionId(2);
        	selectOptionsState2.setOptionValue("New Jersey");
        	
        	stateList.add(selectOptionsState2);
    		
    	}
    	
    	
    	return stateList;
    }
    
    
}
