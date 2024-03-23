package org.techhub.PRACTICE_MVC_APPLICATION.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.PRACTICE_MVC_APPLICATION.Model.Employee;
import org.techhub.PRACTICE_MVC_APPLICATION.Service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	EmployeeService empServ;
	List<Employee>list;
	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "home";
	}
	@RequestMapping(value="/addEmployee", method = RequestMethod.GET)
	public String AddPage()
	{
		return "addEmployee";
	}
	@RequestMapping(value="/saved",method=RequestMethod.POST)
	public String AddData(Employee e,Map map)
	{
		boolean b=empServ.isAdd(e);
		if(b)
		{
			map.put("msg", "Employee Added Successfully");
		}
		else
		{
			map.put("msg", "Employee Not Added Successfully");
		}
		return "addEmployee";
	}
	@RequestMapping(value="/viewEmployee",method = RequestMethod.GET)
	public String ViewAll(Map map)
	{
		List<Employee>list=empServ.ViewEmployee();
		map.put("view", list);
		return "viewEmployee";
	}
	@RequestMapping(value="/deleteEmployee",method=RequestMethod.GET)
	public String deleteEmployee(@RequestParam("id")Integer id,Map map)
	{
		empServ.isDelete(id);
		List<Employee>list=empServ.ViewEmployee();
		map.put("view", list);
		return "viewEmployee";
	}
	@RequestMapping(value="/updateEmployee",method=RequestMethod.GET)
	public String UpdateEmployee(@RequestParam("id")Integer id,@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("sal")String sal,Map map)
	{
		map.put("id",id);
		map.put("name",name);
		map.put("email",email);
		map.put("sal", sal);
		return "updateEmployee";
	}
	@RequestMapping(value="/fUpdate",method=RequestMethod.POST)
    public String UpdateData(Employee e,Map map)
    {
		boolean b=empServ.isUpdate(e);
		List<Employee>list=empServ.ViewEmployee();
		map.put("view", list);
		return "viewEmployee";
    }
	@RequestMapping(value="/searchEmployee",method=RequestMethod.GET)
	public String searchByName(@RequestParam("name")String name,Map map)
	{
		List<Employee>list=empServ.SearchByName(name);
//		List<Employee>list1=empServ.ViewEmployee();
		map.put("view1", list);
		return "searchEmployee";
	}
}
