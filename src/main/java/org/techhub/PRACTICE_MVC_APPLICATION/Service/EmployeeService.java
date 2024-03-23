package org.techhub.PRACTICE_MVC_APPLICATION.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.PRACTICE_MVC_APPLICATION.Model.Employee;
import org.techhub.PRACTICE_MVC_APPLICATION.Repository.EmployeeRepository;

@Service("empServ")
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	public boolean isAdd(final Employee e)
	{
		return empRepo.isAdd(e);
	}
	public List<Employee>ViewEmployee()
	{
		return empRepo.ViewEmployee();
	}
	public boolean isDelete(int id) 
	{
	    return empRepo.isDelete(id);
	}
	public boolean isUpdate(Employee e)
	{
		return empRepo.isUpdate(e);
	}
	public List<Employee> SearchByName(String name)
	{
		return empRepo.SearchByName(name);
	}
}
